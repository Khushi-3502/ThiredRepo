package DemoTest.Test2;

import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumGrid1 {

    @DataProvider(parallel = true)
    public Object[][] sendData() {
        Object arr[][] = new Object[2][2];

        arr[0][0] = "Email_1";
        arr[0][1] = "chrome";

        arr[1][0] = "Email_2";
        arr[1][1] = "chrome";

        return arr;
    }

    @SuppressWarnings("deprecation")
	@Test(dataProvider = "sendData")
    public void login(String userName, String browserName) throws Exception {

        DesiredCapabilities cap = null;

        if (browserName.equalsIgnoreCase("chrome")) {
            cap = DesiredCapabilities.chrome();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.ANY);
        }

        // Replace with your Selenium Grid Hub URL
        URL url = new URL("http://localhost:4444/wd/hub");

        WebDriver driver = new RemoteWebDriver(url, cap);

        // Open Facebook
        driver.get("https://www.facebook.com/");

        // Wait for a few seconds to observe the browser
        Thread.sleep(5000);

       
    }
}
