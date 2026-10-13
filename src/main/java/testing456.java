import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testing456 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://rahulshettyacademy.com/AutomationPractice/?utm_source=chatgpt.com");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            for (String value : new String[] {"radio1", "radio2", "radio3"}) {
                By radioButton = By.cssSelector(
                    "input[name='radioButton'][value='" + value + "']"
                );

                wait.until(ExpectedConditions.elementToBeClickable(radioButton)).click();
                wait.until(ExpectedConditions.elementToBeSelected(radioButton));
                System.out.println("Selected " + value);
            }

            System.out.println("All three radio buttons were clicked in sequence.");
            System.out.println("Only radio3 stays selected because these radio buttons share a group.");
        } finally {
            driver.quit();
        }
    }
}
