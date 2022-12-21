package org.selenium.practice.projects.pages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.practice.projects.pages.BasePage;

public class LoginPage extends BasePage {

    private By emailAddressLocator = By.name("email");
    private By passwordLocator = By.name("email");
    private By submitBtnLocator = By.xpath("/html/body/section/div/div/div[1]/div/form/button");
    private By tagMyAccountLocator = By.tagName("h1");
    private WebDriver webDriver;


    public void login(){
        if(super.isDisplayed(emailAddressLocator)){
            super.type("camilajavadev123@gmail.com", emailAddressLocator);
            super.type("123456@Ca", passwordLocator);
            super.click(submitBtnLocator);
        }else{
            System.out.println("Email address TextBox was not present");
        }
    }

    public String getMyAccount(){
        return super.getText(tagMyAccountLocator);
    }



}
