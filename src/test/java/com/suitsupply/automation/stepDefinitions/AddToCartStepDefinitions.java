package com.suitsupply.automation.stepDefinitions;

import com.suitsupply.automation.pageActions.HomePageActions;
import com.suitsupply.automation.pageActions.SelectSuiteOptionsActions;
import com.suitsupply.automation.pageObjects.SelectSuiteOptionsWindow;
import com.suitsupply.automation.pageObjects.ViewShoppingCartPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Sripriya srinivasan on 11/1/2018.
 */
public class AddToCartStepDefinitions {

    @Steps
    HomePageActions homePageStep;

    @Steps
    SelectSuiteOptionsActions selectSuiteOptions;

    private ViewShoppingCartPage viewShoppingCartPage;

    @Given("^user is accessing custom made (.*) selection page$")
    public void navigateToCustomMadeSuit(String menuOption) {
        homePageStep.launch();
        assertThat(homePageStep.isHomePageLoaded()).isTrue();
        homePageStep.navigateToCustomMadeOption(menuOption);
    }

    @When("^he chooses (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void selectYourChoiceForCustomSuite(String fabric,String jacket,String trouserFit,String turnUp,String
            waistBand, String waistCoat,String extraTrousers,String trouserSize,String jacketSize) {
        Serenity.setSessionVariable("fabric").to(fabric);
        Serenity.setSessionVariable("jacket").to(jacket);
        Serenity.setSessionVariable("trouserFit").to(trouserFit);
        Serenity.setSessionVariable("turnUp").to(turnUp);
        Serenity.setSessionVariable("waistBand").to(waistBand);
        Serenity.setSessionVariable("waistCoat").to(waistCoat);
        Serenity.setSessionVariable("extraTrousers").to(extraTrousers);
        Serenity.setSessionVariable("trouserSize").to(trouserSize);
        Serenity.setSessionVariable("jacketSize").to(jacketSize);
        selectSuiteOptions.selectAllTheOptionsOfSuite(fabric,jacket,trouserFit,turnUp,waistBand,waistCoat,
                extraTrousers,trouserSize,jacketSize);

    }

    @When("^proceeds to Add to Cart$")
    public void addToCart() {
        selectSuiteOptions.navigateToViewCart();
        selectSuiteOptions.navigateToSecureCheckOut();
    }

    @Then("^the cart should have all the options as per selection$")
    public void verifyProductsAddedOnCart() {
        assertThat(viewShoppingCartPage.getJacketSizeText()).isEqualToIgnoringCase(Serenity.sessionVariableCalled
                ("jacketSize"));
        assertThat(viewShoppingCartPage.getJacketFabricText()).isEqualToIgnoringCase(Serenity.sessionVariableCalled
                ("fabric"));
        assertThat(viewShoppingCartPage.getJacketFitText()).isEqualToIgnoringCase(Serenity.sessionVariableCalled
                ("jacket"));
        assertThat(viewShoppingCartPage.getTrouserSizeText()).isEqualToIgnoringCase(Serenity.sessionVariableCalled
                ("trouserSize"));
        assertThat(viewShoppingCartPage.getTrouserFabricText()).isEqualToIgnoringCase(Serenity.sessionVariableCalled
                ("fabric"));
        assertThat(viewShoppingCartPage.getTrouserFitText()).isEqualToIgnoringCase(Serenity.sessionVariableCalled
                ("trouserFit"));
        assertThat(viewShoppingCartPage.getTrouserTurnUpText()).isEqualToIgnoringCase(Serenity.sessionVariableCalled
                ("turnUp"));
        assertThat(viewShoppingCartPage.getTrouserWaistBandText()).isEqualToIgnoringCase(Serenity.sessionVariableCalled
                ("waistBand"));
        System.out.println("the value is"+Serenity.setSessionVariable("extraTrousers"));
        if(Serenity.setSessionVariable("extraTrousers").equals("Skip")){
            assertThat(viewShoppingCartPage.getExtraTrouserText()).isEqualToIgnoringCase("Yes");
        }
        if(Serenity.setSessionVariable("extraTrousers").equals("Skip")){
            assertThat(viewShoppingCartPage.getWaistCoatFabricText()).isEqualToIgnoringCase(Serenity.sessionVariableCalled
                    ("fabric"));
            assertThat(viewShoppingCartPage.getWaistCoatFitText()).isEqualToIgnoringCase(Serenity.sessionVariableCalled
                    ("waistCoat"));
        }
    }

}
