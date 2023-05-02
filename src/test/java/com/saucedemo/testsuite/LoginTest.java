package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    @Test

    public void userShouldLoginSuccessfullyWithValid(){
        //Enter “standard_user” username
        loginPage.sendTextToUserNameField();

        //* Enter “secret_sauce” password
        loginPage.sendTextToPasswordField();

        //Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();

        //Verify the text “PRODUCTS”
        Assert.assertEquals(loginPage.getProductText(),"Products");



    }
    @Test

    public void verifyThatSixProductsAreDisplayedOnPage(){
        //Enter “standard_user” username
        loginPage.sendTextToUserNameField();

        //Enter “secret_sauce” password
        loginPage.sendTextToPasswordField();

        //Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();

        //Verify that six products are displayed on page
        loginPage.get6Products();

            }
    }

