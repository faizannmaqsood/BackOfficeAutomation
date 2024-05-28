import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;


public abstract class BaseTest {

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = Config.BASE_URL;
    }
}
