package io.kandula.test.components.antd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button extends AntdWebElement<Button> {

    public Button(WebDriver webDriver, By locator) {
        super(webDriver, locator);
    }

    @Override
    public Button waitForElement(int seconds) {
        WebDriverWait wait = new WebDriverWait(webDriver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this;
    }

    public void click() {
        this.webDriver.findElement(this.locator).click();
    }

}
