package com.it_academy.test.parallel;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        OnChromeTest.class,
        OnFirefoxTest.class,
        OnEdgeTest.class
})
public class SuiteForParallelTest {
}
