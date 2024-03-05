import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.IsEqual.equalTo;

public class EchoTest extends BaseTest{

    @Test
    @DisplayName("GET test")
    public void checkGetRequest(){
        requestSpec
                .when()
                .get("/get?foo1=bar1&foo2=bar2")
                .then()
                .spec(statusCodeSpec)
                .assertThat().body("args.foo1", equalTo("bar1"))
                .assertThat().body("args.foo2", equalTo("bar2"));
    }
    @Test
    @DisplayName("POST raw test")
    public void checkPostRawText(){
        requestSpec
                .body(stringCheck.getStr())
                .contentType("application/json")
                .when()
                .post("/post")
                .then()
                .spec(statusCodeSpec)
                .assertThat().body("data", equalTo(stringCheck.getStr()));
    }
    @Test
    @DisplayName("POST form test")
    public void checkPostFormData() {
        requestSpec
                .multiPart("foo1", "bar1")
                .multiPart("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .spec(statusCodeSpec)
                .assertThat().body("form.foo1", equalTo("bar1"))
                .assertThat().body("form.foo2", equalTo("bar2"));
    }
    @Test
    @DisplayName("PUT test")
    public void checkPutRequest() {
        requestSpec
                .body(stringCheck.getStr())
                .contentType("text/plain")
                .when()
                .put("put/")
                .then()
                .statusCode(200)
                .assertThat().body("data", equalTo(stringCheck.getStr()));

    }
    @Test
    @DisplayName("PATCH test")
    public void checkPatchRequest() {
        requestSpec
                .body(stringCheck.getStr())
                .contentType("text/plain")
                .when()
                .patch("/patch")
                .then()
                .spec(statusCodeSpec)
                .assertThat().body("data", equalTo(stringCheck.getStr()));
    }
    @Test
    @DisplayName("DELETE test")
    public void checkDelRequest() {
        requestSpec
                .contentType("text/plain")
                .body(stringCheck.getStr())
                .when()
                .delete("/delete")
                .then()
                .spec(statusCodeSpec)
                .assertThat().body("data", equalTo(stringCheck.getStr()));
    }
    }

