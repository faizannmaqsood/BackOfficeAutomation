import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public abstract class BaseTest {

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = Config.BASE_URL;
    }

    @Test
    public void show(){
        System.out.println("hello");
    }
}

