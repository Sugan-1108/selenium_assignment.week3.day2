package assignments.week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for = 'Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for = 'Men - Fashion Bags']")).click();
		Thread.sleep(5000);
		
		System.out.println("Count: " + driver.findElement(By.className("length")).getText());
		
		List<WebElement> brand = driver.findElements(By.className("brand"));
		System.out.println("Number of Brands: " +brand.size());
		System.out.println("The list of brand of the products displayed in the page are: ");
		
		for (WebElement listOfProducts : brand) {
			String text1 = listOfProducts.getText();
			System.out.println(text1);
		}
		
		List<WebElement> nameOfBags = driver.findElements(By.className("nameCls"));
		System.out.println("Number of Bags: " +nameOfBags.size());
		System.out.println("The list of names of the bags are: ");
		
		for (WebElement listOfBags : brand) {
			String text2 = listOfBags.getText();
			System.out.println(text2);
		}
		
		
		
		
		
	}

}
