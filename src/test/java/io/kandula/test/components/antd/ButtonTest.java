package io.kandula.test.components.antd;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ButtonTest extends IntegrationTestBase {

    @Test
    public void buttonCanBeClicked() {

        open("Button");

        new Button(getWebDriver(), By.className("at__my_button")).click();

        assertThat($(By.id("result")).getText(), equalTo("Clicked"));
    }
}
