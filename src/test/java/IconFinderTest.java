import io.restassured.response.Response;
import org.testng.annotations.Test;


import static org.testng.Assert.*;


public class IconFinderTest extends BaseTest {



    @Test
    public void testIconId() {
        Response response =  ApiUtilIconDetails.getIconDetails(Config.ICON_ID);
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
        assertTrue(responseBody.contains("\"icon_id\":182504"), "Icon ID should match");
    }

    @Test
    public void testTagsNotEmpty() {
        Response response = ApiUtilIconDetails.getIconDetails(Config.ICON_ID);
        String responseBody = response.getBody().asString();

        assertTrue(responseBody.contains("\"tags\":[\"iconfinder\",\"logo\"]"), "Tags should match");
    }

    @Test
    public void testPublishedDate() {
        Response response = ApiUtilIconDetails.getIconDetails(Config.ICON_ID);
        String responseBody = response.getBody().asString();

        assertTrue(responseBody.contains("\"published_at\":\"2017-05-30T10:49:05.325336\""), "Published date should match");
    }

    @Test
    public void testIconIsNotPremium() {
        Response response = ApiUtilIconDetails.getIconDetails(Config.ICON_ID);
        String responseBody = response.getBody().asString();

        assertFalse(responseBody.contains("\"is_premium\":true"), "Icon should not be premium");
    }

    @Test
    public void testIconTypeIsVector() {
        Response response = ApiUtilIconDetails.getIconDetails(Config.ICON_ID);
        String responseBody = response.getBody().asString();

        assertTrue(responseBody.contains("\"type\":\"vector\""), "Icon type should be 'vector'");
    }

    @Test
    public void testRasterSizesExist() {
        Response response = ApiUtilIconDetails.getIconDetails(Config.ICON_ID);
        String responseBody = response.getBody().asString();

        assertTrue(responseBody.contains("\"raster_sizes\":["), "Raster sizes should exist");
    }

    @Test
    public void testVectorSizesExist() {
        Response response = ApiUtilIconDetails.getIconDetails(Config.ICON_ID);
        String responseBody = response.getBody().asString();

        assertTrue(responseBody.contains("\"vector_sizes\":["), "Vector sizes should exist");
    }

    @Test
    public void testDownloadUrlsExist() {
        Response response = ApiUtilIconDetails.getIconDetails(Config.ICON_ID);
        String responseBody = response.getBody().asString();

        assertTrue(responseBody.contains("\"download_url\":\"https://"), "Download URLs should exist");
    }

    @Test
    public void testStylesExist() {
        Response response = ApiUtilIconDetails.getIconDetails(Config.ICON_ID);
        String responseBody = response.getBody().asString();

        assertTrue(responseBody.contains("\"styles\":["), "Styles should exist");
    }

    @Test
    public void testCategoriesExist() {
        Response response = ApiUtilIconDetails.getIconDetails(Config.ICON_ID);
        String responseBody = response.getBody().asString();

        assertTrue(responseBody.contains("\"categories\":["), "Categories should exist");
    }

    @Test
    public void testAuthorInfoExists() {
        Response response = ApiUtilIconDetails.getIconDetails(Config.ICON_ID);
        String responseBody = response.getBody().asString();

        assertTrue(responseBody.contains("\"author\":{\"user_id\":"), "Author information should exist");
    }
}
// this is test