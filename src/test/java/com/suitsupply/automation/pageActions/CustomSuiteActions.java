package com.suitsupply.automation.pageActions;

import com.suitsupply.automation.helper.SideMenuOptions;
import com.suitsupply.automation.pageObjects.CustomSuitePage;
import net.thucydides.core.annotations.Step;

/**
 * Created by Sripriya srinivasan on 11/3/2018.
 */
public class CustomSuiteActions {

    private CustomSuitePage customSuitePage;

    /**
     * This method is to verify if the expected side menu option is displayed or not
     * @param menuOption
     * @return
     */
    @Step
    public boolean isSideMenuOptionDisplayed(String menuOption){
        switch (menuOption.toUpperCase()){
            case SideMenuOptions.FABRIC : return customSuitePage.isFabricSideMenuDisplayed();
            case SideMenuOptions.JACKET_FIT : return customSuitePage.isJacketSideMenuDisplayed();
            case SideMenuOptions.TROUSERS_FIT : return customSuitePage.isTrousersFitSideMenuDisplayed();
            case SideMenuOptions.TURN_UP : return customSuitePage.isTurnUpSideMenuDisplayed();
            case SideMenuOptions.WAISTBAND : return customSuitePage.isWaistBandSideMenuDisplayed();
            case SideMenuOptions.WAISTCOAT : return customSuitePage.isWaistCoatSideMenuDisplayed();
            case SideMenuOptions.EXTRA_TROUSERS : return customSuitePage.isExtraTrousersSideMenuDisplayed();
            case SideMenuOptions.TROUSERS_SIZE : return customSuitePage.isTrousersSizeSideMenuDisplayed();
            case SideMenuOptions.JACKET_SIZE : return customSuitePage.isJacketSizeSideMenuDisplayed();
            default: throw new IllegalArgumentException("check the menu Option provided");
        }
    }

}
