
package stepdefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import static org.junit.Assert.*;
import utils.DriverFactory;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("I open the SauceDemo login page")
    public void open_login_page() {
        driver = DriverFactory.createDriver(System.getProperty("browser", "chrome"));
    
        loginPage = new LoginPage(driver);
        driver.get("https://www.saucedemo.com/");
    }

    @When("I login with username {string} and password {string}")
    public void login(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("I should be redirected to the inventory page")
    public void inventory_page() {
        assertTrue(driver.getCurrentUrl().contains("inventory"));
        driver.quit();
    }

    @Then("I should see an error message")
    public void error_message() {
        assertTrue(loginPage.isErrorVisible());
        driver.quit();
    }

    @When("I add an item to the cart")
public void add_item_to_cart() {
    loginPage.addItemToCart();
}

@When("I log out")
public void logout() {
    loginPage.logout();
}

@Then("I should be redirected to the login page")
public void redirected_to_login() {
    assertTrue(loginPage.isBackOnLoginPage());
    driver.quit();
}

}
