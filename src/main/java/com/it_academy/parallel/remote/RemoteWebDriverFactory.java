package com.it_academy.parallel.remote;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteWebDriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver(String browser) {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setPlatform(Platform.WIN10);
//        capabilities.setBrowserName(browser);
        DesiredCapabilities capabilities = CapabilityFactory.getCapabilities(browser);
        try {
            driver.set(new RemoteWebDriver(new URL("http://192.168.0.113:4444"), capabilities));
        } catch (MalformedURLException e) {
            System.out.println("Cannot create connection with remote server");
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void closeDriver() {
        driver.get().close();
        driver.remove();
    }
}
