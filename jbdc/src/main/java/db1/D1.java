package db1;
	import java.sql.*;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;  
	public class D1 
	{
		WebDriver drives;
		ResultSet r;
		int a=0;
		private String[] args;

		public D1(WebDriver driver)
		{
			this.drives=driver;
		}
		

	public void m1() throws SQLException
	{
		
		try
		{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ff","root","root");
		Statement s=c.createStatement();
		 r=s.executeQuery("select * from mascot where Mailtype='spi';");
	 while(r.next()) {

			String uname=r.getString("UserID");
			System.out.println(uname);
			String pass=r.getString("UserPassword");
			System.out.println(pass);
			m2(uname,pass);
		}
	 drives.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();//	System.out.println(r.getString("UserID")+",    "+r.getString("UserPassword"));
		}
	}
	public void m2(String uname,String pass ) throws SQLException
	{
		WebElement user=drives.findElement(By.xpath("//*[@id='username']"));
		user.clear();
		user.sendKeys(uname);
		drives.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
		
		drives.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	}
