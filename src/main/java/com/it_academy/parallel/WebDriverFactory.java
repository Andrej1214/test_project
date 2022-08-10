package com.it_academy.parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver setDriver(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
            windowMaximize();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver.set(new FirefoxDriver());
            windowMaximize();
        } else if(browser.equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver.set(new EdgeDriver());
            windowMaximize();
        }
        return driver.get();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    private static void windowMaximize(){
        driver.get().manage().window().maximize();
    }
}
