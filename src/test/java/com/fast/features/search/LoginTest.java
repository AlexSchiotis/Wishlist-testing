package com.fast.features.search;


import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.RegisterSteps;
import com.fast.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {


    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    RegisterSteps registerSteps;

    @Test

    public void loginUser() {
        loginSteps.openPage();
        loginSteps.setEmail(Constants.USERNAME);
        loginSteps.pressLoginButton(Constants.PASSWORD);
    }
}
