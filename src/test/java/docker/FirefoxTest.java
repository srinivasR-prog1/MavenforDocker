package docker;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
	
	@Test
	public void test2() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.firefox();	
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("https://www.google.com/");
		System.out.println("Title of the page using firefox browser:" + driver.getTitle());
		driver.quit();

	}


}
