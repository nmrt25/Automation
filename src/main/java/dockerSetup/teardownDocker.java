package dockerSetup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class teardownDocker {

	@Test
	public void teardownDocker() throws IOException {
		String file = "logs.txt";
		boolean flag = false;
		Runtime rt = Runtime.getRuntime();
		rt.exec("cmd /c start src//resources//dockerBat//dockerTearDown.bat");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.SECOND, 30);
		long timer = cal.getTimeInMillis();
		System.out.println(timer);

		while (System.currentTimeMillis() < timer) {
			if (flag = false) {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String currentLine = reader.readLine();

				while (currentLine != null) {
					if (currentLine.contains("Shutdown complete")) {
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
			
			File f = new File("logs.txt");
			if(f.delete()) {
				System.out.println("Clearing Logs file...");
			}

		}

	}

}
