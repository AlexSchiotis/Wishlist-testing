package com.fast.steps.serenity;

import com.fast.pages.LoginPage;
import com.fast.utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;

    @Step
    public void openPage(){
        loginPage.open();
        loginPage.checkLoginPage();
    }
    @Step
    public void setEmail(String email){
        loginPage.setEmailField(email);
    }
    @Step
    public void setPass(String pass){
        loginPage.setPassField(pass);
    }
    @Step
    public void pressLoginButton()
    {
        loginPage.pressLoginButton();
    }
    @StepGroup
    public void doLogin(String username, String pass){
        openPage();
        setEmail(username);
        setPass(pass);
        pressLoginButton();
    }

    public void pressLoginButton(String password) {
    }
}


