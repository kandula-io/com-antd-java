package io.kandula.test.components.antd;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import fi.iki.elonen.SimpleWebServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;

import java.io.File;
import java.io.IOException;

public class IntegrationTestBase {

    public static final int PORT = 8888;

    private static SimpleWebServer simpleWebServer;

    @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests();

    @BeforeClass
    public static void startServer() throws IOException {

        File webframework = new File(System.getProperty("user.dir") + "/src/test/resources/webframework");

        simpleWebServer = new SimpleWebServer(
            "localhost",
            PORT,
            webframework,
            false
        );

        simpleWebServer.start();

        // Base URL for Selenide
        Configuration.baseUrl = String.format("http://localhost:%d/", PORT);
    }

    @AfterClass
    public static void stopServer() {
        simpleWebServer.stop();
        simpleWebServer = null;
    }
}
