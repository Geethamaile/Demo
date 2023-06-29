package Focus;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class VeggietBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		wrapper(2000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART'][1]")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART'][2]")).click();
		driver.close();
		

	}
	public static void wrapper(long num) throws InterruptedException {
		Thread.sleep(num);
	}

}
