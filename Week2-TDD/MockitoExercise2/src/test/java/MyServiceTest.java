package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);

        // Act
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Assert: check that getData() was called
        verify(mockApi).getData();
    }
}
