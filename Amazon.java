package Amazon2;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");
		driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement> Listelements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	for(int i=0;i<elements.size();i++) {
			String price=elements.get(i).getText();
			System.out.println(price);
	}

	


