package com.it_academy.test.remote;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RemoteInChromeTest.class,
        RemoteInFirefoxTest.class,
        RemoteInEdgeTest.class
})
public class TestSuiteForParallel {
}
