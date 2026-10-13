import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class AppTest {
    private WebDriver driver;
    private App app;

    @Before
    public void setUp() {
        // Set the path for the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        app = new App(driver);
    }

    @Test
    public void testSomeFunctionality() {
        // Example test case
        app.openWebsite("http://example.com");
        String title = driver.getTitle();
        assertEquals("Expected Title", title);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}