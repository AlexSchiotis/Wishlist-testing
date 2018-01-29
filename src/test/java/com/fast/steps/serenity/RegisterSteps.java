package com.fast.steps.serenity;

import com.fast.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class RegisterSteps extends ScenarioSteps{

    RegisterPage registerPage;
    @Step
    public void openPage()    {
        registerPage.open();
        registerPage.checkRegisterPage();
    }
    @Step
    public void setFirstName(String name){
        registerPage.setFirstNameField(name);
    }
    @Step
    public void setLastName(String lastname){
        registerPage.setLastNameField(lastname);
    }
    @Step
    public void setEmailField(String email){
        registerPage.setEmailField(email);
    }
    @Step
    public void setPasswordField(String password){
        registerPage.setPasswordField(password);
    }
    @Step
    public void setConfirmPasswordField(String confirmPassword){
        registerPage.setConfirmPasswordField(confirmPassword);
    }
    @Step
    public void pressRegisterButton() {
        registerPage.pressRegisterButton();
    }
}

