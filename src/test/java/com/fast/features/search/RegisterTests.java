package com.fast.features.search;

import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.Session;


@RunWith(SerenityRunner.class)
public class RegisterTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;


    @Steps
    RegisterSteps registerSteps;


    @Test
    public void registerUser() {
        registerSteps.openPage();
        registerSteps.setFirstName("Alex");
        registerSteps.setLastName("Schiotis");
        registerSteps.setEmailField("alexschiotis2@gmail.com");
        registerSteps.setPasswordField("123456");
        registerSteps.setConfirmPasswordField("123456");
        registerSteps.pressRegisterButton();
    }

}