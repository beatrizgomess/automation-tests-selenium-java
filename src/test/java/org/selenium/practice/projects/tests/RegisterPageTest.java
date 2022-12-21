package org.selenium.practice.projects.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.selenium.practice.projects.pages.RegisterPage;

public class RegisterPageTest {

    private WebDriver webDriver;
    private RegisterPage registerPage;
    private final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    @BeforeEach
    void setUp() throws Exception{
      this.registerPage = new RegisterPage();
      this.registerPage.visit(this.URL);
    }


    @AfterEach
    void tearDown() throws Exception{
        webDriver.quit();
    }
    @Test
    void test() {
    }
}
