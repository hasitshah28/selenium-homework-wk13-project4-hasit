package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {

    By userName = By.id("user-name");
    By password = By.id("password");
    By clickOnLogin = By.id("login-button");

    By productText = By.xpath("//span[@class = 'title']");

    public void sendTextToUserNameField() {
        sendTextToElement(userName, "standard_user");
    }

    public void sendTextToPasswordField() {
        sendTextToElement(password, "secret_sauce");
    }

    public void clickOnLoginButton() {
        clickOnElement(clickOnLogin);
    }

    public String getProductText(){
        return getTextFromElement(productText);
    }

    public void get6Products(){
        List<WebElement> totalProducts = driver.findElements(By.className("inventory_item"));
        System.out.println("Total Numbers of Products" + totalProducts.size());
    }
}
