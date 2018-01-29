package com.fast.steps.serenity;

import com.fast.pages.LoginPage;
import com.fast.pages.WishlistPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class WishlistSteps extends ScenarioSteps {

    WishlistPage wishlistPage;


    @Step
    public void openPage(){
        wishlistPage.open();
        wishlistPage.checkWishlistPage();
    }
    @Step
    public void accountField (){
        wishlistPage.accountFieldButton();
    }
    @Step
    public void logField(){
        wishlistPage.logFieldButton();
    }
    @Step
    public void shareButton(){
        wishlistPage.shareButton();
    }
    @Step
    public void insertEmail(String email){
        wishlistPage.insertEmail(email);
    }
    @Step
    public void sharethebutton(){
        wishlistPage.setShareTheButton();
    }
    @Step
    public void logoutbutton(){

        wishlistPage.setLogoutButton();
    }
}
