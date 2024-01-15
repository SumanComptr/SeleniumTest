package FightTicketBook;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightTicketBooking {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));

		Select drp = new Select(ele);

		drp.selectByValue("Boston");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));

		Select drp1 = new Select(ele1);
		drp1.selectByValue("London");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);

		WebElement elName = driver.findElement(By.id("inputName"));
		elName.clear();
		elName.sendKeys("Suman Das");
		Thread.sleep(2000);
		
		WebElement elAddress = driver.findElement(By.id("address"));
		elAddress.clear();
		elAddress.sendKeys("Noida,Uttar Pradesh,India");
		Thread.sleep(2000);
		
		WebElement elCity = driver.findElement(By.id("city"));
		elCity.clear();
		elCity.sendKeys("Noida");
		Thread.sleep(2000);
		
		WebElement elState = driver.findElement(By.id("state"));
		elState.clear();
		elState.sendKeys("Uttar Pradesh");
		Thread.sleep(2000);
		
		WebElement elzip = driver.findElement(By.id("zipCode"));
		elzip.clear();
		elzip.sendKeys("201307");
		Thread.sleep(2000);
		
		WebElement elCredit = driver.findElement(By.id("creditCardNumber"));
		elCredit.clear();
		elCredit.sendKeys("12345");
		Thread.sleep(2000);
		
		WebElement elCreditMonth = driver.findElement(By.id("creditCardMonth"));
		elCreditMonth.clear();
		elCreditMonth.sendKeys("12");
		Thread.sleep(2000);
		
		WebElement elCreditYear = driver.findElement(By.id("creditCardYear"));
		elCreditYear.clear();
		elCreditYear.sendKeys("2024");
		Thread.sleep(2000);
		
		WebElement elCreditName = driver.findElement(By.id("nameOnCard"));
		elCreditName.clear();
		elCreditName.sendKeys("Suman Das");
		Thread.sleep(2000);
		
		driver.findElement(By.id("rememberMe")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);

		TakesScreenshot sc = ((TakesScreenshot) driver);
		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("D:\\Cetpa\\selenium\\receipt.png");
		FileUtils.copyFile(src, f2);

		
		Thread.sleep(4000);
		driver.close();

	}

}
