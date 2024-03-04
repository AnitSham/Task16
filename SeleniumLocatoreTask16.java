import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocatoreTask16 {

	public static void main(String[] args) throws InterruptedException {
		
		//1. 
		
	 /*	 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://google.com");
		 System.out.println(driver.getCurrentUrl());
		 driver.navigate().refresh();
		 driver.close(); 
		 
		// 2. 
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.demoblaze.com/");
		 driver.manage().window().maximize();
		 String exptitle=driver.findElement(By.tagName("a")).getText();
		String acttitle=driver.getTitle();
		 System.out.println("Actual title is:" +acttitle);
		if(acttitle.equalsIgnoreCase(exptitle)) {
			System.out.println("Page landed on Correct Website");
		}else {
			System.out.println("Page landed on Correct Website");
		} 
		
		 
		 //3.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("View history")).click();
		String title=driver.findElement(By.tagName("h1")).getText();
		System.out.println(title); */
		 
		 	}

}

Output:

1.https://www.google.com/?gws_rd=ssl
2.Actual title is:STORE
Page landed on Correct Website
3.Artificial intelligence: Revision history
