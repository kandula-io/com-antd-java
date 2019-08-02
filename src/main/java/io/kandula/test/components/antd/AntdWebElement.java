package io.kandula.test.components.antd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AntdWebElement {

    protected WebDriver webDriver;

    protected By locator;

    public AntdWebElement(WebDriver webDriver, By locator) {
        this.webDriver = webDriver;
        this.locator = locator;
    }

}
