package com.suitsupply.automation.pageObjects;

import com.suitsupply.automation.helper.BasePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sripriya Srinivasan on 11/4/2018.
 */
public class ViewShoppingCartPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Proceed to Purchase')]")
    WebElement proceedToPurchaseButton;

    @FindBy(xpath="//div[@data-variant-id='DYO-JACKET']//p[contains(text(),'Fabric')]/following::p[1]")
    WebElement jacketFabricText;

    @FindBy(xpath="//div[@data-variant-id='DYO-JACKET']//p[contains(text(),'Fit')]/following::p[1]")
    WebElement jacketFitText;

    @FindBy(xpath="//div[@data-variant-id='DYO-JACKET']//p[contains(text(),'Size')]/following::p[1]")
    WebElement jacketSizeText;

    @FindBy(xpath="//div[@data-variant-id='DYO-TROUSERS']//p[contains(text(),'Size')]/following::p[1]")
    WebElement trousersSizeText;

    @FindBy(xpath="//div[@data-variant-id='DYO-TROUSERS']//p[contains(text(),'Fabric')]/following::p[1]")
    WebElement trousersFabricText;

    @FindBy(xpath="//div[@data-variant-id='DYO-TROUSERS']//p[contains(text(),'Fit')]/following::p[1]")
    WebElement trousersFitText;

    @FindBy(xpath="//div[@data-variant-id='DYO-TROUSERS']//p[contains(text(),'Turn-up')]/following::p[1]")
    WebElement trousersTurnUpText;

    @FindBy(xpath="//div[@data-variant-id='DYO-TROUSERS']//p[contains(text(),'Waistband')]/following::p[1]")
    WebElement trousersWaistBandText;

    @FindBy(xpath="//div[@data-variant-id='DYO-TROUSERS']//p[contains(text(),'Additional Trousers')]/following::p[1]")
    WebElement extraTrousersText;

    @FindBy(xpath="//div[@data-variant-id='DYO-WAISTCOAT']//p[contains(text(),'Fabric')]/following::p[1]")
    WebElement waistCoatFabricText;

    @FindBy(xpath="//div[@data-variant-id='DYO-WAISTCOAT']//p[contains(text(),'Fit')]/following::p[1]")
    WebElement waistCoatFitText;

    @Step
    public boolean isProceedButtonDisplayed(){
        return proceedToPurchaseButton.isDisplayed();
    }

    @Step
    public String getJacketFabricText(){
        return jacketFabricText.getText();
    }

    public String getJacketFitText(){
        return jacketFitText.getText();
    }

    public String getJacketSizeText(){
        return jacketSizeText.getText();
    }

    @Step
    public String getTrouserSizeText(){
        return trousersSizeText.getText();
    }

    public String getExtraTrouserText(){
        try{
            return extraTrousersText.getText();
        }catch(Exception e){
            return "No";
        }
    }
    public String getTrouserFabricText(){
        return trousersFabricText.getText();
    }
    public String getTrouserFitText(){
        return trousersFitText.getText();
    }
    public String getTrouserTurnUpText(){
        return trousersTurnUpText.getText();
    }
    public String getTrouserWaistBandText(){
        return trousersWaistBandText.getText();
    }

    @Step
    public String getWaistCoatFabricText(){
        try{
            return waistCoatFabricText.getText();
        }catch(Exception e){
            return "No";
        }
    }
    public String getWaistCoatFitText(){
        try{
            return waistCoatFitText.getText();
        }catch(Exception e){
            return "No";
        }
    }

}
