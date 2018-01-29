package com.fast.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://fasttrackit.org/selenium-test/customer/account/login/")
public class LoginPage extends PageObject {

    @FindBy(css = "#email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passField;

    @FindBy(id = "send2")
    private WebElementFacade loginField;

    public void checkLoginPage() {
    }
    public void setEmailField(String email) {
        typeInto(emailField, email);
    }
    public void setPassField(String pass) {
        typeInto(passField, pass);
    }
    public void pressLoginButton() {
        loginField.click();
    }
}
