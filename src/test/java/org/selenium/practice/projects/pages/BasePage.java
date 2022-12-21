package org.selenium.practice.projects.pages;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class BasePage extends WindowUtil {

    private WebDriver webDriver;
    private Actions action;

    private WindowUtil windowUtil;

    public void BasePage(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        webDriver = new ChromeDriver();
        windowUtil.setDimension(webDriver);
    }

    public void visit(String url){
        this.webDriver.get(url);
    }

    public String getCurrentUrl(){
        return this.webDriver.getCurrentUrl();
    }

    public void quitWebDriver(){
        this.webDriver.quit();
    }

    public WebElement findElement(By locator){
        return this.webDriver.findElement(locator);
    }

    public void type(String input, By locator){
        this.webDriver.findElement(locator).sendKeys(input);
    }

    public Boolean isDisplayed(By locator) {
        try {
            return this.webDriver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void click(By locator) {
        this.webDriver.findElement(locator).click();
    }

    public String getText(By locator) {
        return this.webDriver.findElement(locator).getText();
    }

    public void actionMoveToElementPerform(By locator){
        if(this.action == null){
            this.action = new Actions(this.webDriver);
        }

        WebElement element = this.webDriver.findElement(locator);
        action.moveToElement(element).perform(); // hovering the mouse over the element

    }

    public  void actionMoveToElementClickPerform(By locator){
        if(this.action == null){
            this.action = new Actions(this.webDriver);
        }

        WebElement element = this.webDriver.findElement(locator);
        action.moveToElement(element).click().build().perform(); //placing the mouse over the element, clicking and performing
    }


}
