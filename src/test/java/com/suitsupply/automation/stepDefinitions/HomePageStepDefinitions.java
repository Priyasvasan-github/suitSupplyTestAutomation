package com.suitsupply.automation.stepDefinitions;


import com.suitsupply.automation.pageActions.CustomSuiteActions;
import com.suitsupply.automation.pageActions.HomePageActions;
import com.suitsupply.automation.pageActions.SelectSuiteOptionsActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import cucumber.api.DataTable;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Sripriya srinivasan on 11/1/2018.
 */
public class HomePageStepDefinitions {

    @Steps
    HomePageActions homePageStep;

    @Steps
    CustomSuiteActions customSuiteActions;

    @Steps
    SelectSuiteOptionsActions selectSuiteOptions;

    @Given("^user is accessing suitsupply home page$")
    public void launchPage() {
        homePageStep.launch();
        assertThat(homePageStep.isHomePageLoaded()).isTrue();
    }


    @When("^he Navigate to Custom made (.*) selection$")
    public void navigateToMenu(String menuOption) {
        homePageStep.navigateToCustomMadeOption(menuOption);
    }

    @Then("^he should view below options to select$")
    public void verifySideMenuOptionsAreDisplayedCorrectly(DataTable dataTable) {
        List<Map<String, String>>sideMenuOptions = dataTable.asMaps(String.class, String.class);
        for(int i=1;i<=sideMenuOptions.get(sideMenuOptions.size()-1).size();i++){
            assertThat(customSuiteActions.isSideMenuOptionDisplayed(sideMenuOptions.get(0).get("Option"+i)));
        }
    }

    @Then("^verify Fabric page has options to filter based on colour and design$")
    public void verifyFilteroptionsAreAvailableOnFabric() {
        assertThat(selectSuiteOptions.isColorFilterDisplayed()).isTrue();
        assertThat(selectSuiteOptions.isCodeFilterDisplayed()).isTrue();
        assertThat(selectSuiteOptions.isDesignFilterDisplayed()).isTrue();
    }


    @Then("^verify Add To Bag button is disabled$")
    public void verifyAddButtonIsDisplayed() {
        assertThat(selectSuiteOptions.isAddToCartEnabled()).isFalse();
    }
}
