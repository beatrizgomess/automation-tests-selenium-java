package org.selenium.practice.projects.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.selenium.practice.projects.pages.LoginPage;

public class LoginPageTest {

    private LoginPage loginPage;
    private final String BASE_URL_LOGIN = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    @BeforeEach
    void setUp() throws Exception{
        this.loginPage = new LoginPage();
        this.loginPage.visit(this.BASE_URL_LOGIN);
    }


    @AfterEach
    void tearDown() throws Exception{
        this.loginPage.quitWebDriver();
    }

    @Test
    void test(){
        //when
        this.loginPage.login();
        //then
        Assertions.assertTrue(this.loginPage.getMyAccount().equals("MY ACCOUNT"));
    }


}
