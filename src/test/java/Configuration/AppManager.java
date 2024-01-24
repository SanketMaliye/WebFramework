package Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class AppManager {

    protected WebDriver driver;
    private Properties properties;

    @BeforeMethod
    public void setUp() {
        System.out.println("Starting...");
        try {
            loadProperties();
            String browser = properties.getProperty("BROWSER", "chrome").toLowerCase();
            switch (browser) {
                case "chrome":
                    setUpChrome();
                    break;
                case "firefox":
                    setUpFirefox();
                    break;
                case "edge":
                    setUpEdge();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid browser specified in config.properties");
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get(properties.getProperty("BASE.URL"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setUpChrome() {
        ChromeOptions options = new ChromeOptions();
        // Chrome setup code...
        // options.addArguments("--headless");
        options.addArguments(
                "user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    private void setUpFirefox() {
        FirefoxOptions options = new FirefoxOptions();
        // Firefox setup code...
        driver = new FirefoxDriver(options);
    }
    private void setUpEdge() {
        EdgeOptions options = new EdgeOptions();
        // Edge setup code...
        driver = new EdgeDriver(options);
    }

    private void loadProperties() throws IOException {
        properties = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        properties.load(fis);
        fis.close();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Closing...");
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
