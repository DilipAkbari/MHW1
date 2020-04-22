package com.letskodit.learn.pages;

import com.letskodit.learn.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //list of elements and their locations
    // By logInToLetsKodeIt = By.cssSelector("h1.text-center");

    @FindBy(css = "h1.text-center")
    WebElement _logInToLetsKodeIt;

    //methods performing actions on elements
    public void verifyTextLogInToLetsKodeIt(String textMesg) {
        Reporter.log("verifyTextLogInToLetsKodeIt" + textMesg + "Message " + _logInToLetsKodeIt.toString() + "<br>");
        verifyTextAssertMethod(_logInToLetsKodeIt, textMesg);
        log.info("verifyTextLogInToLetsKodeIt" + textMesg + "Message " + _logInToLetsKodeIt.toString());
    }

}