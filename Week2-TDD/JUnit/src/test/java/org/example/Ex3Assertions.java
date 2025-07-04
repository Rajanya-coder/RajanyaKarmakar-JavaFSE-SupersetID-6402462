package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Ex3Assertions {

    @Test
    public void testAssertions() {
        // assertEquals: check name is correct
        Person person = new Person("Rajanya");
        assertEquals("Rajanya", person.getName());

        // assertTrue: length of name > 3
        assertTrue(person.getName().length() > 3);

        // assertFalse: length of name < 3
        assertFalse(person.getName().length() < 3);

        // assertNull: make a null object
        Person p2 = null;
        assertNull(p2);

        // assertNotNull: the original person is not null
        assertNotNull(person);
    }
}
