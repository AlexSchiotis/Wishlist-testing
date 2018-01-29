package com.fast.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://fasttrackit.org/selenium-test/customer/account/create/")
public class RegisterPage extends PageObject {

    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;

    @FindBy(className = "page-title")
    private WebElementFacade pageTitle;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;

    @FindBy(css = "#email_address")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmPasswordField;

    @FindBy(css = "#form-validate > div.buttons-set > button")
    private WebElementFacade registerField;


    public void checkRegisterPage() {
        pageTitle.shouldContainText("CREATE AN ACCOUNT");
    }
    public void setFirstNameField(String firstName) {
        typeInto(firstNameField, firstName);
    }
    public void setLastNameField(String lastName) {
        typeInto(lastNameField, lastName);
    }
    public void setEmailField(String email) {
        typeInto(emailField, email);
    }
    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }
    public void setConfirmPasswordField(String confirmPassword) {
        typeInto(confirmPasswordField, confirmPassword);
    }
    public void pressRegisterButton() {
        registerField.click();
    }


}

