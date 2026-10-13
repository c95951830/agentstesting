public class App {
    public static void main(String[] args) {
        // Initialize the WebDriver (e.g., ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Example browser automation task
        driver.get("http://example.com");
        System.out.println("Title of the page is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }

    // Additional methods for browser automation can be added here
}