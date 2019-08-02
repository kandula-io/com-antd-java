package io.kandula.test.components.antd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends AntdWebElement {

    public Button(WebDriver webDriver, By locator) {
        super(webDriver, locator);
    }

    public void click() {
        this.webDriver.findElement(this.locator).click();
    }

}
