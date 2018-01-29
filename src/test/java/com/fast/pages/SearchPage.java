package com.fast.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class SearchPage extends PageObject {


    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css = "#search_mini_form > div.input-box > button")
    private WebElementFacade searchButton;

    @FindBy(id = "product-collection-image-337")
    private WebElementFacade productButon;

    @FindBy(css = "#product_addtocart_form > div.add-to-cart-wrapper > div > ul.add-to-links > li:nth-child(1) > a")
    private WebElementFacade wishlistButton;

    @FindBy(css = "#email")
    private WebElementFacade usernamefield;

    @FindBy(css = "#pass")
    private WebElementFacade passwordfield;

    @FindBy(css = "#send2 > span > span")
    private WebElementFacade loginbutton;

    public void enter_keywords(String keyword) {
        searchField.typeAndEnter("glass");
    }
    public void setSearchButton() {
        searchButton.click();
    }
    public void setProductButon() {
        productButon.click();
    }
    public void setWishlistButton() {
        wishlistButton.click();
    }

    public void setUsernamefield() {
    }

    public void setPasswordField() {
    }

    public void setLoginButton() {
    }

    public void checkSearchPage() {
    }
}


