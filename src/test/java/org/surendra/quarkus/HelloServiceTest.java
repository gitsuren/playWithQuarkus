package org.surendra.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {
    @QuarkusTest
    public class ExampleResourceTest {

        @Test
        public void testHelloEndpoint() {
            given()
                    .when().get("/hello")
                    .then()
                    .statusCode(200)
                    .body(is("hello"));
        }

    }

}