package com.suitsupply.automation.pageObjects;

import com.google.inject.internal.cglib.core.internal.$CustomizerRegistry;
import com.suitsupply.automation.helper.BasePage;
import net.serenitybdd.core.exceptions.SerenityManagedException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

/**
 * Created by Sripriya Srinivasan on 11/2/2018.
 */
public class CustomSuitePage extends BasePage{
    private String navigationShadowMoc = "document.querySelector('cmtm-root').shadowRoot.querySelector('cmtm-navigation')";
    private String selectionMenu = navigationShadowMoc+".shadowRoot.querySelector('main > div.controls > div.selector')";
    private String fabricMenuOptionFromPopUp =navigationShadowMoc+".shadowRoot.querySelector('main > div.drawer.open > cmtm-collapsible > ul > li[data-index=\"0\"]')";
    private String jacketMenuOptionFromPopUp =navigationShadowMoc+".shadowRoot.querySelector('main > div.drawer.open > cmtm-collapsible > ul > li[data-index=\"1\"]')";
    private String trousersMenuOptionFromPopUp =navigationShadowMoc+".shadowRoot.querySelector('main > div.drawer.open > cmtm-collapsible > ul > li[data-index=\"2\"]')";
    private String extraTrousersMenuOptionFromPopUp =navigationShadowMoc+".shadowRoot.querySelector('main > div.drawer.open > cmtm-collapsible > ul > li[data-index=\"3\"]')";
    private String waistCoatMenuOptionFromPopUp =navigationShadowMoc+".shadowRoot.querySelector('main > div.drawer.open > cmtm-collapsible > ul > li[data-index=\"4\"]')";
    private String sizeMenuOptionFromPopUp =navigationShadowMoc+".shadowRoot.querySelector('main > div.drawer.open > cmtm-collapsible > ul > li[data-index=\"5\"]')";
    private String filterButton="document.querySelector('cmtm-root').shadowRoot.querySelector('cmtm-filter-bar').shadowRoot.querySelector('div.right-content > button.filter-button')";
    private String lazyWrapper ="document.querySelector('cmtm-root').shadowRoot.querySelector('cmtm-grid').shadowRoot.querySelector('div.lazy-wrapper>img')";

    @FindBy(css="#footer-notifications .toast")
    WebElement cookiesNotification;

    @FindBy(css="#footer-notifications .toast-header .close")
    WebElement closeCookieNotification;

    public WebElement fabricChooseMenu(){
        WebElement fabricMenuOption = getWebElement(fabricMenuOptionFromPopUp);
        return fabricMenuOption;
    }

    public WebElement jacketFitChooseMenu(){
        WebElement jacketFitChooseMenu = getWebElement(jacketMenuOptionFromPopUp);
        return jacketFitChooseMenu;
    }
    public WebElement trousersFitChooseMenu(){
        WebElement trousersFitChooseMenu = getWebElement(trousersMenuOptionFromPopUp);
        return trousersFitChooseMenu;
    }
    public WebElement extraTrousersMenu(){
        WebElement extraTrousersMenu = getWebElement(extraTrousersMenuOptionFromPopUp);
        return extraTrousersMenu;
    }
    public WebElement waistCoatChooseMenu(){
        WebElement waistCoatChooseMenu = getWebElement(waistCoatMenuOptionFromPopUp);
        return waistCoatChooseMenu;
    }
    public WebElement sizeChooseMenu(){
        WebElement sizeChooseMenu = getWebElement(sizeMenuOptionFromPopUp);
        return sizeChooseMenu;
    }

    public WebElement filterButtonElement(){
        WebElement filterButtonElement = getWebElement(filterButton);
        return filterButtonElement;
    }

    public WebElement lazyWrapperElement(){
        WebElement lazyWrapperElement = null;
        try {
            lazyWrapperElement = getWebElement(lazyWrapper);
        } catch (SerenityManagedException e) {
            lazyWrapperElement = getWebElement(lazyWrapper);
        }
        return lazyWrapperElement;
    }

    private WebElement getWebElement(String lazyWrapper) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        return (WebElement) jsExecutor.executeScript("return " + lazyWrapper);
    }


    @FindBy(xpath ="//li[@data-category-type]//span[contains(text(),'Turn Up')]")
    WebElement turnUPChooseMenu;

    @FindBy(xpath ="//li[@data-category-type]//span[contains(text(),'Waistband')]")
    WebElement waistBandChooseMenu;

    @FindBy(xpath ="//li[@data-category-type]//span[contains(text(),'Jacket Size')]")
    WebElement jacketSizeChooseMenu;


    public WebElement selectionMenu(){
        WebElement dropDownMenu = getWebElement(selectionMenu);
        return dropDownMenu;
    }



    /**
     * Below method is to handle cookie notifications
     */
    public void handleCookieNotification(){

        try{
            waitForElementToBeClickable(cookiesNotification);
            if(cookiesNotification.isDisplayed()){
                closeCookieNotification.click();
                WebDriver driver = getDriver();
                driver.navigate().to(driver.getCurrentUrl());
                waitFor(3000);
            }
        }catch (Throwable e){
            WebDriver driver=getDriver();
            driver.navigate().to(driver.getCurrentUrl());
            waitFor(3000);
        }

    }

    public boolean isPageLoaded(){
        waitFor(7000);
        waitForElementToBeClickable(lazyWrapperElement());
        return lazyWrapperElement().isDisplayed();
    }

    public boolean isShadowDomLoaded(){
        isPageLoaded();
        waitForElementToBeClickable(selectionMenu());
        selectionMenu().click();
        return selectionMenu().isDisplayed();
    }
    /**
     *
     * Below methods are to return if side menu items are displayed or not
     * @return
     */
    public boolean isFabricChooseMenuDisplayed(){
        waitForElementToBeClickable(fabricChooseMenu());
        return fabricChooseMenu().isDisplayed();
    }

    public boolean isJacketChooseMenuDisplayed(){
        waitForElementToBeClickable(jacketFitChooseMenu());
        return jacketFitChooseMenu().isDisplayed();
    }

    public boolean isTrousersFitChooseMenuDisplayed(){
        return trousersFitChooseMenu().isDisplayed();
    }

    public boolean isTurnUpChooseMenuDisplayed(){
        return turnUPChooseMenu.isDisplayed();
    }

    public boolean isWaistBandChooseMenuDisplayed(){
        return waistBandChooseMenu.isDisplayed();
    }

    public boolean isWaistCoatChooseMenuDisplayed(){
        return waistCoatChooseMenu().isDisplayed();
    }

    public boolean isExtraTrousersChooseMenuDisplayed(){
        return extraTrousersMenu().isDisplayed();
    }

    public boolean isSizeChooseMenuDisplayed(){
        return sizeChooseMenu().isDisplayed();
    }

    public boolean isJacketSizeChooseMenuDisplayed(){
        return jacketSizeChooseMenu.isDisplayed();
    }

    public boolean isTrouserSizeSizeChooseMenuDisplayed(){
        return jacketSizeChooseMenu.isDisplayed();
    }

    /**
     * Below methods are to click on Side menu item
     */
    public void clickFabricChooseMenu(){
         fabricChooseMenu().click();
    }

    public void clickJacketFitChooseMenu(){
        jacketFitChooseMenu().click();
    }

    public void clickTrouserFitChooseMenu(){
        trousersFitChooseMenu().click();
    }
    public void clickTurnUPChooseMenu(){
        turnUPChooseMenu.click();
    }
    public void clickWaistBandChooseMenu(){
        waistBandChooseMenu.click();
    }
    public void clickWaistCoatChooseMenu(){
        waistCoatChooseMenu().click();
    }
    public void clickExtraTrousersChooseMenu(){
        extraTrousersMenu().click();
    }

    public void clickJacketSizeChooseMenu(){
        sizeChooseMenu().click();
    }
}
