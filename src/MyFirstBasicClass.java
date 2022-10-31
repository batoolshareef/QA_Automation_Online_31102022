import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstBasicClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/index.html");

		//1. to print the title of site
		String myTitle = driver.getTitle();
		System.out.println("The Title of My Site Is: " + myTitle);

		//2. to define array of webelement 
		List <WebElement> myListOption=driver.findElements(By.tagName("option"));
		
		//3. to print the title of array list of tagname
		for (int i=0; i<myListOption.size();i++) {
			
			System.out.println("The Element No." + (i+1) +": " + myListOption.get(i).getText());
		}
		
	}

}
