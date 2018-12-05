package db1;

		import java.sql.SQLException;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class mytrails {

			public static void main(String[] args) throws SQLException 
			{
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://spimail.spi.com/");
				
				D1 d=new D1(driver);
				((D1) d).m1();
			}
			

		}

