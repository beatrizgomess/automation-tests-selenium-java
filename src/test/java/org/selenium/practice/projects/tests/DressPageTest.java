package org.selenium.practice.projects.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.selenium.practice.projects.pages.DressePage;

public class DressPageTest {
    private DressePage dressePage;
    private final String URL = "http://automationpractice.com/index.php";

    @BeforeEach
    void setUp() throws Exception {
        this.dressePage = new DressePage();
        this.dressePage.visit(this.URL);
    }

    @AfterEach
    void tearDown() throws Exception {
        //this.dressesPage.quitWebDriver();
    }

    @Test
    void test() {
        //when
        this.dressePage.viewCasualDressePage();

        //then
        Assertions.assertEquals("CASUAL DRESSES ", this.dressePage.getTitlePage());
        Assertions.assertFalse(this.URL.equals(dressePage.getCurrentUrl()));
    }
}
