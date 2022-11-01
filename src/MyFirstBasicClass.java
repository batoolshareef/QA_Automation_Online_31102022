import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstBasicClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/index.html");

		Thread.sleep(3000);
		// 1. to print the title of site
//		String myTitle = driver.getTitle();
//		System.out.println("The Title of My Site Is: " + myTitle);

		// 2. to define array of webelement
		// List<WebElement> myListOption = driver.findElements(By.tagName("option"));

		// 3. to print the title of array list of tagname Option
//		System.out.println("Print the elements with option tag text");
//		for (int i = 0; i < myListOption.size(); i++) {
//
//			System.out.println("The Element No." + (i + 1) + ": " + myListOption.get(i).getText());
//		}

		// 4. to print the title of array list of tagname A

		List<WebElement> myListATag = driver.findElements(By.tagName("option"));

		System.out.println("Print the elements with link text");

		for (int i = 0; i < myListATag.size(); i++) {

			System.out.println("The Href No." + (i + 1) + ": " + myListATag.get(i).getAttribute("value"));
		}

	}

}
