package com.cognizant.jwt_auth_service.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import java.security.Key;
import java.util.Base64;
import java.util.Date;

@RestController
public class AuthenticationController {

    // IMPORTANT: At least 32 bytes for HS256
    private final String SECRET_KEY = "mySuperSecretKeyThatIsAtLeast32BytesLong!";

    @GetMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing or invalid Authorization header");
        }

        // Decode Basic Auth header (base64)
        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(credDecoded);
        String[] values = credentials.split(":", 2);

        String username = values[0];
        String password = values[1];

        // Dummy validation
        if (!"user".equals(username) || !"pwd".equals(password)) {
            throw new RuntimeException("Invalid credentials");
        }

        // Convert secret to Key object
        Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

        // Build JWT token valid for 10 minutes
        String token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 600_000))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

        return "{\"token\":\"" + token + "\"}";
    }
}
