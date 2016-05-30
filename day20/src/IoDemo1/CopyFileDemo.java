package IoDemo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("copyfiledemo.java");
			fis = new FileInputStream("fos3.txt");
			
			byte[] bys = new byte[1024];
			int len = 0;
			
			while ((len = fis.read(bys)) != -1) {
				fos.write(bys, 0, len);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e2) {
					// TODO: handle exception
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e2) {
					// TODO: handle exception
				}
			}
		}
	}
}
