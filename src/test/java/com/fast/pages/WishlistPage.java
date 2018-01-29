package com.fast.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class WishlistPage extends PageObject {

    @WhenPageOpens
    public void maximiseScreen() { getDriver().manage().window().maximize();
    }

    @FindBy(css = "#header > div > div.skip-links > div > a > span.label")
    private WebElementFacade accountField;

    @FindBy(css = "#header-account > div > ul > li.last > a")
    private WebElementFacade logField;

    @FindBy(css = "#email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passField;

    @FindBy(id = "send2")
    private WebElementFacade loginField;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css = "#search_mini_form > div.input-box > button")
    private WebElementFacade searchButton;

    @FindBy(id = "product-collection-image-337")
    private WebElementFacade productButon;

    @FindBy(css = "#product_addtocart_form > div.add-to-cart-wrapper > div > ul.add-to-links > li:nth-child(1) > a")
    private WebElementFacade wishlistButton;

    @FindBy(css = "#wishlist-view-form > div > div > button.button.btn-share > span > span")
    private WebElementFacade shareButton;

    @FindBy(css = "#email_address")
    private WebElementFacade insetEmail;

    @FindBy(css = "#form-validate > div.buttons-set.form-buttons > button > span > span")
    private WebElementFacade shareTheButton;

    @FindBy(css = "#header-account > div > ul > li.last > a")
    private WebElementFacade logoutButton;


    public void checkWishlistPage() {
    }
    public void accountFieldButton() {
        accountField.click();
    }
    public void logFieldButton() {
        logField.click();
    }
    public void shareButton() {
        shareButton.click();
    }
    public void insertEmail(String email) {
        insetEmail.typeAndEnter("noname@nowhere.no");
    }
    public void setShareTheButton() {
        shareTheButton.click();
    }
    public void setLogoutButton() {
        logoutButton.click();
    }
}
