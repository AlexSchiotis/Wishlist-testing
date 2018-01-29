package com.fast.features.search;

import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.SearchSteps;
import com.fast.steps.serenity.WishlistSteps;
import com.fast.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WishlistTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    WishlistSteps wishlistSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    SearchSteps searchSteps;


    @Test
    public void runWishlistTest(){
        wishlistSteps.openPage();
        wishlistSteps.accountField();
        wishlistSteps.logField();
        loginSteps.doLogin(Constants.USERNAME, Constants.PASSWORD);
        searchSteps.openPage();
        searchSteps.enters("");
        searchSteps.searchbutton();
        searchSteps.productbutton();
        searchSteps.wishlistbutton();
        wishlistSteps.shareButton();
        wishlistSteps.insertEmail("");
        wishlistSteps.sharethebutton();
        wishlistSteps.accountField();
        wishlistSteps.logoutbutton();

    }








}
