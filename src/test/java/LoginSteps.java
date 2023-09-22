import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {

    WebDriver webDriver;
    WebDriverWait wait;
    @Given("I open browser")
    public void iOpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\BDD\\WebDrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 3);
    }

    @And("I go to login page")
    public void iGoToLoginPage() {
        webDriver.get("https://demo.guru99.com/v4/index.php");
    }

    @When("I type {string} as login")
    public void iTypeAsLogin(String login) {
    }

    @And("I type {string} as password")
    public void iTypeAsPassword(String password) {
    }

    @And("I click login button")
    public void iClickLoginButton() {
    }

    @Then("I am logged in")
    public void iAmLoggedIn() {
    }

    @Then("I am NOT logged in")
    public void iAmNOTLoggedIn() {
    }
}
