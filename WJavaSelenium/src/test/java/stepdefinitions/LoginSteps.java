package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Navigate to login page");
        driver.get("https://www.google.com/");
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("Enter credentials");
        driver.get("https://www.google.com/");
    }

    @Then("user should land on dashboard")
    public void user_should_land_on_dashboard() {
        System.out.println("Verify dashboard");
    }
}
