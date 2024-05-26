import com.microsoft.playwright.*;

public class LoginPage {
    private final Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void navigateToLoginPage(String url) {
        page.navigate(url);
    }

    public void enterUsername(String username) {
        page.fill("#email", username);
    }

    public void enterPassword(String password) {
        page.fill("//*[@id=\"root\"]/div/div/div[2]/div/form/div/div[2]/div[2]/span/input", password);
    }

    public void clickLoginButton() {
        page.click("#loginButton");
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}
