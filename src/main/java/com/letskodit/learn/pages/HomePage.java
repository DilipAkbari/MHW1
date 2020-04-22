package com.letskodit.learn.pages;

import com.letskodit.learn.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //list of elements and their locations
//    By practiceLink = By.linkText("Practice");
//    By loginLink = By.linkText("Login");
//    By signUpbtn = By.linkText("Sign Up");
    @FindBy(linkText = "Practice")
    WebElement _practiceLink;

    @FindBy(linkText = "Login")
    WebElement _loginLink;

    @FindBy(linkText = "Sign Up")
    WebElement _signUpbtn;


    //methods performing actions on elements
    public void clickOnPracticeLink() {
        Reporter.log("cliking on practice link"+_practiceLink.toString() + "<br>");
        clickOnElement(_practiceLink);
        log.info("cliking on practice link\"+_practiceLink.toString()");
    }

    public void clickOnLoginLink() {
        Reporter.log("cliking on login link"+_loginLink.toString()+"<br>");
        clickOnElement(_loginLink);
        log.info("cliking on login link\"+_loginLink.toString()");

    }

    public void clickOnSignUpBtn() {
        Reporter.log("click on sign btn"+_signUpbtn.toString()+"<br>");
        clickOnElement(_signUpbtn);
        log.info("click on sign btn\"+_signUpbtn.toString()");
    }
}
