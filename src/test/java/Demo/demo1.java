package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {
	
	public static void main(String[] args) {
		
//		launch the application
		
		 FirefoxDriver ffwkhdekwkj = new FirefoxDriver();
		 ff.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		
		 String exp_value = "134.67";
		 
//		Enter amount
		 ff.findElement(By.id("loanamount")).sendKeys("100000");		
		 
//		Enter rate
		 ff.findElement(By.name("rate")).sendKeys("10");
		
//		Enter tenure
		 ff.findElement(By.id("pmonths")).sendKeys("120");
		 
//		Click on calcuate
		 ff.findElement(By.id("Button1")).click();
		 
		
//		Validate EMI
		
		 String act_output = ff.findElement(By.id("EMI")).getAttribute("value");
		 	 
		 
//		eport pass or fail
		 if(act_output.equals(exp_value)){
			 
			 System.out.println("passed the testcase as value is matching");
		 }else{
			 
			 System.out.println("Failed the testcase as value are not matching"); 
		 }
		 
		
//		Close the app
		 
		 ff.close();
		
		
		
	}

}
