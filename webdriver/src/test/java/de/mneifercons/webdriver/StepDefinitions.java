package de.mneifercons.webdriver;

/*
 * Copyright (c) 2020 Markus Neifer
 * Licensed under the MIT License.
 * See file LICENSE in parent directory of project root.
 */

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class StepDefinitions {

    private WebDriver _driver;

    public StepDefinitions() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
    }

    @Before
    public void setUp() {
        _driver = new ChromeDriver();
    }

    @When("I search for cheese")
    public void iSearchForCheese() {
        _driver.get("https://google.com/ncr");
        _driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
    }

    @Then("I find cheese")
    public void iFindCheese() {
        WebDriverWait wait = new WebDriverWait(_driver, 10);
        WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("div.srg>div.g")));
        String textContent =  firstResult.getAttribute("textContent");

        inspectResponse(textContent);

        assertThat(textContent, containsString("Cheese"));
    }

    @After
    public void tearDown() {
        _driver.quit();
        _driver = null;
    }

    private void inspectResponse(String text) {
        System.out.println(text);
        Object response = ((JavascriptExecutor) _driver).executeScript(
           "return document.getElementsByClassName('srg').length;");
        System.out.println((Long) response);
    }

}
