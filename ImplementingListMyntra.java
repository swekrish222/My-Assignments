package week4ClassroomActivity;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingListMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();	
		//Load URL
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Search box- enter bags
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bags",Keys.ENTER);
		//To select gender, we use the parent child x-path
		driver.findElement(By.xpath("//input[@type='radio' and @value='men,men women']/parent::label")).click();
		//selecting radio button for Laptop bags 
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[3]")).click();
		Thread.sleep(4000);
		//To get the size of ArrayList
		List<WebElement>listOfElements= driver.findElements(By.xpath("//h4[@class='product-product']"));
		System.out.println(listOfElements.size());
		//TO print the bag brands
		Thread.sleep(4000);
		List<WebElement> BrandName = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		//Empty list created to store the values after iteration
				List<String>list0=new ArrayList<String>();
				for (WebElement each0 : BrandName)
				{
					String text0 = each0.getText();
					list0.add(text0);
				}
				
				System.out.println(list0);
		//TO print the elements in a list
		Thread.sleep(4000);
		List<WebElement> ListOfELements = driver.findElements(By.xpath("//h4[@class='product-product']"));
		//Empty list created to store the values after iteration
		List<String>list1=new ArrayList<String>();
		for (WebElement each : ListOfELements)
		{
			String text = each.getText();
			list1.add(text);
		}
		
		System.out.println(list1);
	}
	
	
	
	
}





