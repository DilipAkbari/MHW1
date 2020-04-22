package com.letskodit.learn.testsuite;

import com.letskodit.learn.pages.HomePage;
import com.letskodit.learn.pages.LoginPage;
import com.letskodit.learn.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase extends TestBase {
    //object creation
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(groups = {"regression", "smoke", "sanity"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"Regression", "Sanity"})
    public void navigateSuccessfullyToPracticePage() {
        //click on Practice link
        homePage.clickOnPracticeLink();

    }

    @Test(groups = {"Regression", "Smoke"})
    public void navigateSuccessfullyToLoginPage() {
        //click on Login link
        homePage.clickOnLoginLink();

    }

    @Test(groups = {"Regression"})
    public void navigateSuccessfullyToSignupPage() {
        //click on SignUp button
        homePage.clickOnSignUpBtn();

    }

    @Test(groups = {"Regression"})
    public void userShouldSelectHondaElementFromDropDownMenu() throws InterruptedException {
        //click on Practice link
        homePage.clickOnPracticeLink();

    }
}


