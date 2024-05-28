import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiUtilIconDetails {

    public static Response getIconDetails(String iconId) {
        return given()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + Config.BEARER_TOKEN)
                .when()
                .get(Config.ICON_DETAIL_ENDPOINT + iconId)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}
