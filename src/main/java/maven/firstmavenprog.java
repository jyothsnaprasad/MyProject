package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstmavenprog {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WebDriver = interface, ChromeDriver - implementation Class for the web driver interface, driver - is an object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://selenium.dev");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.startsWith("https")) {
			System.out.println("secured page");
		}

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("SeleniumHQ Browser Automation")) {
			System.out.println("test case pass");
		}


}
}



