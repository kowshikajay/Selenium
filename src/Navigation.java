import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
             
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=pmax_cpc&utm_campaign=dms_google_pmax_cpc_Myntra_PMax_MFB_Interest_Based_Female_SOK&keyword=&matchtype=&target=&placement=&gclid=CjwKCAiA-8SdBhBGEiwAWdgtcKM57ANdoUX58EPk5CRLa_rkrEoZ-3jxGdRZDJJKQWnPBEPoYVQiRhoCxboQAvD_BwE");
		driver.navigate().to("https://www.naukri.com/mnjuser/homepage");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
	}

}
