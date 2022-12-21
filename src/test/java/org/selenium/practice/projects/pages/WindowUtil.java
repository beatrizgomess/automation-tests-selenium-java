package org.selenium.practice.projects.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;


public class WindowUtil {

    private WebDriver webDriver;

    public void setDimension(WebDriver webDriver) {
        Dimension currentDimension = webDriver.manage().window().getSize();
        int height = currentDimension.getHeight();
        int width = currentDimension.getWidth();

        Dimension newDimension = new Dimension(width, height);
        webDriver.manage().window().setSize(newDimension);

    }

}
