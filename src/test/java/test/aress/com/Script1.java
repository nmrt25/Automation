package test.aress.com;

import java.io.IOException;

import org.testng.annotations.Test;

import base.testbase;

public class Script1 extends testbase {
	
public Script1() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

@Test
public void method1() throws IOException{
	readproperties();
	initializeBrowser();
	driver.get("https://google.com/");
	System.out.println(driver.getTitle());
	driver.quit();
		
		
	}
}
