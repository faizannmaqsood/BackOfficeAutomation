import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;



public class BaseTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = Config.BASE_URL;
    }


}
