package DemoTest.Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenProj1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KHUSHI SHAH\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("khushishah324");
		
		driver.findElement(By.name("password")).sendKeys("Khushi@5211");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("We successfully open insta");

	}

}
