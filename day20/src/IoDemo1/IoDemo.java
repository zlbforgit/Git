package IoDemo1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo {
	public static void main(String[] args) throws IOException {

		File f = new File("fos.txt");

		FileOutputStream fos = new FileOutputStream(f, true);

		fos.write("hello".getBytes());

		fos.close();
		
	}

}
