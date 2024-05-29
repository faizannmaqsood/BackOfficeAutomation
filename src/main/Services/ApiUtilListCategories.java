import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiUtilListCategories {

    public static Response ListCategories() {
        return given()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + Config.BEARER_TOKEN)
                .when()
                .get(Config.CATEGORIES_LIST_ENDPOINT)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}
