import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.junit.Assert;


/**
 * Created by rafa on 12/30/14.
 */


public class miPrimerTest {
    @Test
    public void startWebDriver(){
        WebDriver   driver = new FirefoxDriver();

        driver.navigate().to("https://www.gnu.org/fun/jokes/helloworld.html");

        Assert.assertTrue("title should contain Hello World", driver.getTitle().contains("Hello World"));
        driver.close();
        driver.quit();
    }

}
