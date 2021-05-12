

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author DOA
 */
public class ScriptTester {

      private WebDriver driver;
        
    @Before
    public void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximired");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\user\\Desktop\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver(options);
    }

    @Test
    public void OpenPages() {
        
        driver.get("http://www.automationpractice.com");
    } 
}
