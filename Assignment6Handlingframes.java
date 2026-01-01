package Week4assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6Handlingframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Switch to frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		//Switch to Alert
		Alert alert1 =driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		//To get result
		String Result = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(Result);
	
	}

}
