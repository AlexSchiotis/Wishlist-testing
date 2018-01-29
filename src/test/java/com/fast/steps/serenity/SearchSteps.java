package com.fast.steps.serenity;


import com.fast.pages.SearchPage;
import com.fast.utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public  class SearchSteps extends ScenarioSteps {


    SearchPage searchPage;


    @Step
    public void openPage(){
        searchPage.open();
        searchPage.checkSearchPage();
    }
    @Step
    public void enters(String keyword) {
        searchPage.enter_keywords("");
    }
    @Step
    public void searchbutton(){
        searchPage.setSearchButton();
    }
    @Step
    public void productbutton(){
        searchPage.setProductButon();
    }
    @Step
    public  void wishlistbutton(){
        searchPage.setWishlistButton();
    }
    @Step
    public void usernamefield(){
        searchPage.setUsernamefield();
    }
    @Step
    public void passwordfield(){
       searchPage.setPasswordField();
    }
    @Step
    public void loginbutton(){
        searchPage.setLoginButton();
    }
}