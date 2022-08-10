package com.it_academy.parallel.remote;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilityFactory {
    public static DesiredCapabilities capabilities;

    public static DesiredCapabilities getCapabilities(String browser) {
        switch (browser) {
            case "firefox":
                capabilities = OptionsManager.getFirefoxDesiredCapabilities();
                break;
            case "chrome":
                capabilities = OptionsManager.getChromeDesiredCapabilities();
                break;
            case "edge":
                capabilities = OptionsManager.getEdgeDesiredCapabilities();
                break;
            default:
                System.err.println("Нет такого драйвера");
        }
        return capabilities;
    }
}
