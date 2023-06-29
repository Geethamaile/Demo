package Focus;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class VeggietBooking {
	 public static WebDriver driver;
	 int ak=9;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(opt);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		wrapper(2000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART'][1]")).click();
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[2]")).click();
		wrapper(2000);
		OrderBtn();
		//driver.close();
		

	}
	
	public void thisRef() {
		System.out.println("this.a=h");
		System.out.println("this.a=hy");
}
	public void thisRef2() {
		System.out.println("this.a=hi");
	}
	public static void OrderBtn() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Br");
		wrapper(2000);
		
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
	
		
	}
	public static void wrapper(long num) throws InterruptedException {
		Thread.sleep(num);
		System.out.println("time spent");
	}

}
