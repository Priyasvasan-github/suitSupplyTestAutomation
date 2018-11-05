package com.suitsupply.automation.pageActions;

import com.suitsupply.automation.helper.CustomMadeMenuOptions;
import com.suitsupply.automation.pageObjects.HomePage;
import net.thucydides.core.annotations.Step;
import sun.security.util.PendingException;

/**
 * Created by Sripriya srinivasan on 11/1/2018.
 */

public class HomePageActions {

    private HomePage homePage;

    /**
     * This method is to launch home page
     */
    @Step
    public void launch(){
        homePage.open();
    }

    /**
     * This method is to return status if Home page is loaded or not
     * @return
     */
    @Step
    public boolean isHomePageLoaded(){
        return homePage.isCustomModeMenuOptionDisplayed();
    }

    /**
     * This method is to navigate to custom made options
     * @param menuOption
     */
    @Step
    public void navigateToCustomMadeOption(String menuOption){
        switch (menuOption.toUpperCase()){
            case CustomMadeMenuOptions.SUIT : homePage.clickSuiteOptionFromCustomMode(); break;
            case CustomMadeMenuOptions.SHIRT: homePage.clickShirtOptionFromCustomMode(); break;
            case CustomMadeMenuOptions.JACKET: homePage.clickJacketOptionFromCustomMode(); break;
            case CustomMadeMenuOptions.TROUSERS: throw new PendingException("Navigate to Trousers flow is not Implemented");
            case CustomMadeMenuOptions.WAISTCOAT: throw new PendingException("Navigate to WaistCoat flow is not Implemented");
            default: throw new IllegalArgumentException("check the menu Option provided");
        }
    }

}
