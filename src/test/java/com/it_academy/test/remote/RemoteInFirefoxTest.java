package com.it_academy.test.remote;

import com.it_academy.test.pages.RemoteBasePage;
import org.junit.Test;


import static com.codeborne.selenide.Selenide.open;

public class RemoteInFirefoxTest {
    private RemoteBasePage remoteBasePage = new RemoteBasePage();

    @Test
    public void testExistingOnlinerSite() {
        open("https://www.onliner.by/");
    }
}
