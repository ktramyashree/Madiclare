package mediclare;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleMediclare {
	
	public static void main(String[] args) throws Exception
	{
		 System.setProperty("webdriver.chrome.driver","C:\\DriverExecutable\\chromedriver.exe");
		 
		 //Step1:Go to Mediclare website
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://www.mediclare.com/");
		 //Step2:maximize the window
		 driver.manage().window().maximize();
         // Step3:click on healthcareJobs,navigate back
		 WebElement healthcareJobs =driver.findElement(By.xpath("//body//div[1]//div[1]//h3[1]//img[1]"));
		 healthcareJobs.click();
		 driver.navigate().back();
         //Step4:Click on healthcareBusiness ,navigate back
		 WebElement healthcareBusiness =driver.findElement(By.xpath("//div[1]//div[2]//h3[1]//img[1]"));
		 healthcareBusiness.click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 //Step5:Click on healthcareProfessionals, navigate back
		 WebElement healthcareProfessionals =driver.findElement(By.xpath("//div[2]//div[1]//h3[1]//img[1]"));
		 healthcareProfessionals.click();
		 driver.navigate().back();
         //Step6:Click on emergencyServices,click on contacts
		 WebElement emergencyServices =driver.findElement(By.xpath("//body//div[2]//div[2]//h3[1]//img[1]"));
		 emergencyServices.click();
		 Thread.sleep(5000);
	     //Step7:Close the browser
		 driver.close();
	}

}
