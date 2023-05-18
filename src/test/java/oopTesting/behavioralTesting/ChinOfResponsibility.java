package oopTesting.behavioralTesting;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChinOfResponsibility {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("da-durjoy@outlook.com", "->durj0y");
        server.register("user@outlook.com", "u12345");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );
        server.setMiddleware(middleware);
    }

    @Test
    void testAdmin() {
        init();
            String email = "da-durjoy@outlook.com";
            String password = "->durj0y";
        server.logIn(email, password);
    }
    @Test
    void testUser()
    {
        init();
        String email = "user@outlook.com";
        String password = "u12345";
        server.logIn(email, password);
    }

}
