package IoDemo1;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo3 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("fos3.txt");
			fos.write("helloworldjava".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e2) {
					// TODO: handle exception
				}
			}
		}
		
		
	}
}
