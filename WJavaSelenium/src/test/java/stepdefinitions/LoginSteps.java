package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver=new ChromeDriver();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Navigate to google page1");
        driver.get("https://www.google.com/");
        driver.quit();
        System.out.println("Navigate to login page");
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("Navigate to google page2");
        driver.get("https://www.google.com/");
        driver.quit();
        System.out.println("Enter credentials");
    }

    @Then("user should land on dashboard")
    public void user_should_land_on_dashboard() {
        System.out.println("Verify dashboard");
    }
}
