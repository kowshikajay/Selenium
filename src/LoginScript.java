import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript extends Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://integrator.actitime.com/auth/at");
		driver.findElement(By.name("username")).sendKeys("kowshik");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		String title= driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		//verification
		if(title.equals("Login")) {
			
		System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		driver.close();
		Locators l=new Locators();
		l.check();
		System.out.println(l.a);
		
	}
	

}
