package dockerSetup;

import java.io.IOException;

import org.testng.annotations.Test;

public class scaleBrowser {
	@Test
	public void scaleChrome() throws IOException {
		boolean flag = false;
		String file = "logs.txt";
		Runtime rt = Runtime.getRuntime();
		rt.exec("cmd /c start src//resources//scaleChrome.bat");

	}

}
