package org.selenium.practice.projects.pages;

import org.openqa.selenium.By;

public class DressePage extends BasePage{

    private By menuDressesLocator = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    private By submenuCasualDressesLocator = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > ul > li:nth-child(1) > a");
    private By titleCasualDressesPageLocator = By.className("cat-name");


    public void viewCasualDressePage(){
        if(super.isDisplayed(menuDressesLocator)) {
            super.actionMoveToElementPerform(menuDressesLocator);
            super.actionMoveToElementClickPerform(submenuCasualDressesLocator);
        } else {
            System.out.println("menu dresses was not found");
        }
    }

    public String getTitlePage() {
        return super.getText(titleCasualDressesPageLocator);
    }


}
