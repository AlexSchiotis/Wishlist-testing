package com.fast.features.search;

import com.fast.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    SearchSteps searchSteps;

    @Test
    public void setSearchTest() {
        searchSteps.openPage();
        searchSteps.enters("glass");
        searchSteps.searchbutton();
        searchSteps.productbutton();
        searchSteps.wishlistbutton();
        searchSteps.usernamefield();
        searchSteps.passwordfield();
        searchSteps.loginbutton();
    }
}
