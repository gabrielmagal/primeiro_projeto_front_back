import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testLogin200() {
        given()
          .when().get("/Gabriel/123")
          .then()
             .statusCode(200)
             .body(is("Usuário Correto."));
    }

    @Test
    public void testLogin400() {
        given()
          .when().get("/LoginErrado/SenhaErrada")
          .then()
             .statusCode(200)
             .body(is("Usuário Incorreto."));
    }

}