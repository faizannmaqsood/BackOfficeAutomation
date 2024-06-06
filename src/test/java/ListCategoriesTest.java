import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertNotNull;


public class ListCategoriesTest extends BaseTest {

    @Test
    public void listCategories() {
        Response response = ApiUtilListCategories.ListCategories();
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

    }


    @Test
    public void testListCategoriesTotalCount() {
        Response response = ApiUtilListCategories.ListCategories();
        int totalCount = response.jsonPath().getInt("total_count");
        assertEquals(totalCount, 122, "Total count of categories should match");
    }


        @Test
        public void testListCategoriesNotEmpty() {
            Response response = ApiUtilListCategories.ListCategories();
            List<Map<String, String>> categories = response.jsonPath().getList("categories");

            assertFalse(categories.isEmpty(), "Categories list should not be empty");
        }


    @Test
    public void testListCategoriesFields() {
        Response response = ApiUtilListCategories.ListCategories();
        List<Map<String, String>> categories = response.jsonPath().getList("categories");

        for (Map<String, String> category : categories) {
            assertNotNull(category.get("name"), "Category name should not be null");
            assertNotNull(category.get("identifier"), "Category identifier should not be null");
        }
    }








}
