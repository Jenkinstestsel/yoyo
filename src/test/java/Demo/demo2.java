package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo2 {

	
	public static void main(String[] args) {
		
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://www.bing.com/");
		
		ff.findElement(By.id("sb_form_q")).sendKeys("selenium");
		
		ff.findElement(By.className("b_searchboxSubmit")).click();
		
		String output = ff.findElement(By.className("sb_count")).getText();
		
		System.out.println(output);
		
		
		
		
		
	}
}
