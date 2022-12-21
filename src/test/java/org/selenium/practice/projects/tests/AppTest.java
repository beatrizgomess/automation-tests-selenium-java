package org.selenium.practice.projects.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    private WebDriver webDriver;

    @Test
    void helloSelenium(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://automationexercise.com/");

        String currentUrl = webDriver.getCurrentUrl();
        String expected = "https://automationexercise.com/";

        Assertions.assertEquals(expected, currentUrl);

        webDriver.quit();
    }

    @Test
    public void shouldAnswerWithTrue(){
        assertTrue(true);
    }

}
