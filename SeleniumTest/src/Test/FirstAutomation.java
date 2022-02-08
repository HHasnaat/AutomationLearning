package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseurl=("https://ethiodash.staging.wwcny.com/MTSWEBAPP/index.aspx");
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
}
