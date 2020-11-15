package rosterhospital;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HillsHospital {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","I:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bijib.biz");
		driver.findElement(By.id("email")).sendKeys("rosadmin");
		driver.findElement(By.name("password")).sendKeys("@rBuZhJySuVPU7XyU#");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[6]/a/span")).click();
		driver.findElement(By.id("folder_33:112:0:21:Roster:roster::roster/index.php:1:21")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Schedule Calendar")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div[3]/div/div/div[1]/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addshift_1601510400")).click();
		System.out.println("Before switing");
		System.out.println("Title of the main window 1 "  + driver.getTitle());
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println("After switching");
		System.out.println("Title of child window 1 " + driver.getTitle());
		Select st=new Select(driver.findElement(By.id("role_id")));
		//Select st=new Select(driver.findElement(By.xpath("//*[@id=\"role_id\"]")));
		//st.selectByIndex(1);
		st.selectByIndex(0);
		Thread.sleep(5000);
		Select st1=new Select(driver.findElement(By.cssSelector("#ward_id")));
		st1.selectByValue("9");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"user_select\"]/strong")).click();
		Thread.sleep(5000);
	
		//driver.switchTo().window("Select User");
		System.out.println("Title of main window 2 " + driver.getTitle());
		/*Set<String> ids2=driver.getWindowHandles();
		//System.out.println("ids2" +ids2);
		Iterator<String> it2=ids.iterator();
		String parentid2=it.next();
		String childid2=it.next();
		driver.switchTo().window(childid2);*/
		
		//Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		//Perform the click operation that opens new window

		//Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window

		//Close the new window if that window no more required
		//driver.close();

		//Switch back to original browser (first window)

		//driver.switchTo().window(winHandleBefore);//

		//continue with original browser (first window)
		System.out.println("Before switching");
		System.out.println("Title of child window 2 " + driver.getTitle());
		Thread.sleep(7000);
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("#check_sc15885cd5655d10")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("select")).click();
		driver.switchTo().window(childid); 
		driver.findElement(By.id("img_start_date")).click();
		List<WebElement> dates=driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
					{
				        if(text.equalsIgnoreCase("2"))
				        {
				        	driver.findElements(By.className("day")).get(i).click();
				        	break;
				        }
					}
		}
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("[class='day'][class='day selected']")).click();
		Select s=new Select(driver.findElement(By.name("frequency")));
		s.selectByIndex(2);
		Thread.sleep(2000);
		/*Select s2=new Select(driver.findElement(By.id("interval")));
		s2.selectByIndex(0);*/
		Select se=new Select(driver.findElement(By.id("interval")));
		se.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"days\"]/table/tbody/tr/td[1]/input")).click();
		
		
		//Thread.sleep(2000);
		driver.findElement(By.id("img_repeat_until")).click();
		
		List<WebElement> dates2=driver.findElements(By.className("day"));
		int count2=driver.findElements(By.className("day")).size();
		for(int i=0;i<count2;i++)
		{
			String text2=driver.findElements(By.className("day")).get(i).getText();
					{
				        if(text2.equalsIgnoreCase("30"))
				        {
				        	driver.findElements(By.className("day")).get(i).click();
				        	break;
				        }
					}
		}
	          

		//driver.findElement(By.id("img_repeat_until")).click();
		//driver.findElement(By.cssSelector("body > div:nth-child(11) > table > tbody > tr:nth-child(5) > td.day.undefined.selected")).click();
		Select s3=new Select(driver.findElement(By.xpath("//*[@id=\"shift_id\"]")));
		s3.selectByValue("44");//a9
		Select s4=new Select(driver.findElement(By.xpath("//*[@id=\"duty_type\"]")));
		s4.selectByIndex(1);//on site
		Select s5=new Select(driver.findElement(By.xpath("//*[@id=\"payment_type\"]")));
		s5.selectByIndex(1);
		driver.findElement(By.name("submit")).click();
		//driver.quit();
	   if(driver.getPageSource().contains("20001-Record Inserted successfully"))
		{
			System.out.println("Successfully Inserted One Record");
		}
		else
		{
			System.out.println("Not Inserted Recorded");
		}
		//boolean text=driver.getPageSource().contains("20001-Record Inserted successfully");
		//System.out.println(text);
		
		
		
			}
}
			
		
		
		

	


