import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	int a=10;
	protected int b=5;
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjcyNjQzOTU1LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.findElement(By.id("email")).sendKeys("kowshik.ajay");
		driver.findElement(By.name("pass")).sendKeys("kowshik.ajay");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgotten account?")).click();
   
	}
	public void check() {
		
	}

}
