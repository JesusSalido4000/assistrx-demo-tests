
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By usernameInput = By.id("user-name");
    By passwordInput = By.id("password");
    By loginButton = By.id("login-button");
    By errorMessage = By.cssSelector("h3");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isErrorVisible() {
        return driver.findElement(errorMessage).isDisplayed();
    }
    public void logout() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
    
    public void addItemToCart() {
        driver.findElement(By.cssSelector(".inventory_item:first-child button")).click();
    }
    
    public boolean isBackOnLoginPage() {
        return driver.getCurrentUrl().contains("saucedemo.com");
    }
    
}
