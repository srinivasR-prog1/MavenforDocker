package docker;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class EdgeTest {

	@Test
	public void test3() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.edge();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("https://www.amazon.in/");
		System.out.println("Title of the page using edge browser :" + driver.getTitle());
		driver.quit();

	}

}
