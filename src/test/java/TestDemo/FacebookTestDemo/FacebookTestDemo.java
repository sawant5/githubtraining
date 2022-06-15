
package TestDemo.FacebookTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome browser launched");

		try {
			// declaration and instantiation of objects/variables
			// System.setProperty("webdriver.chrome.driver",
			// "D:\\ChromeDriver\\chromedriverexe");

			// Maimize current window
			driver.manage().window().maximize();
			System.out.println("Window Maximized");

			// Launch website
			driver.navigate().to("https://www.facebook.com/");
			System.out.println("Navigate to Facebook portal");

			// Click on the search text box and send value
			driver.findElement(
					By.xpath("//div[@class='_6ltg']/a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			System.out.println("Clicked on Create New Account button");
			Thread.sleep(2000);

			driver.findElement(By.xpath("(//input[@name='firstname'])")).sendKeys("Sawan");
			System.out.println("Entered First name: Sawan");

			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
			System.out.println("Entered Last name: Kumar");

			driver.findElement(By.xpath("(//input[@name='reg_email__'])")).sendKeys("sawantkr5@gmail.com");
			System.out.println("Entered Gmail: sawantkr5@gmail.com");

			driver.findElement(By.xpath("(//input[@name='reg_passwd__'])")).sendKeys("Test@123");
			System.out.println("Entered Password: Test@123");

			Select seDay = new Select(driver.findElement(By.id("day")));
			// Select the option using the visible text
			seDay.selectByVisibleText("5");
			System.out.println("Select Day: 5");

			Select seMonth = new Select(driver.findElement(By.id("month")));
			// Select the option using the visible text
			seMonth.selectByVisibleText("Oct");
			System.out.println("Select Month: Oct");

			Select seYear = new Select(driver.findElement(By.id("year")));
			// Select the option using the visible text
			// seMonth.selectByIndex(3);
			// seMonth.selectByVisibleText("2003");
			// System.out.println("Select Year: 2003");

			driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[position()=2]")).click();
			driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sawantkr5@gmail.com");
			driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();

			// close the chrome web browser
			Thread.sleep(5000);
			driver.close();
			System.out.println("Browser Closed");

		}

		catch (Exception e) {
			System.out.println("Exception: " + e);
			Thread.sleep(5000);
			driver.close();
			System.out.println("Browser Closed");

		}

	}

}
