package docker;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest {
    
	@Test
	public void test1() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
	//	URL url = new URL("http://localhost:4444/wd/hub");
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title of the page using chrome browser :" + driver.getTitle());
		driver.quit();

	}

}
