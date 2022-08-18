package dockerSetup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class setupDocker {

	@SuppressWarnings("deprecation")
	@Test
	public void dockerUp() throws IOException, InterruptedException {
		boolean flag = false;
	String file = "logs.txt";
			
	Runtime rt = Runtime.getRuntime();
	rt.exec("cmd /c start src\\resources\\dockerBat\\dockerUp.bat");
		Thread.sleep(20000);
	
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.SECOND, 30);
		long timer = cal.getTimeInMillis();
	//	System.out.println(timer);

		while (System.currentTimeMillis() < timer) {
			if (flag = false) {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String currentLine = reader.readLine();

				while (currentLine != null) {
					Thread.sleep(5000);
					if (currentLine.contains("[NodeServer.lambda$createHandlers$2] - Node has been added")) {
						System.out.println("breaking the loop");
						flag = true;
						break;
					} else {

						currentLine = reader.readLine();
					}
				}

			} else {
				break;
			}
			
			Assert.assertTrue(flag);
		}

	}
	


}
