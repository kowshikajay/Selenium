import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFewMethods {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		/*
		 * String parent=driver.getWindowHandle(); System.out.println(parent);
		 * Set<String> child=driver.getWindowHandles(); System.out.println(child);
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 */
		driver.close();
		

	}

}
