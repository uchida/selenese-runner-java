package jp.vmi.selenium.testutils;

import org.junit.Rule;

/**
 * Base class for test.
 */
public class TestBase {

    /**
     * Webserver for test
     */
    @Rule
    public final WebServerResouce wsr = new WebServerResouce();
}
