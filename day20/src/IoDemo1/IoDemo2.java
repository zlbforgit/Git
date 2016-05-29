package IoDemo1;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("fos2.txt");
		
		byte[] bys = {97,98,99,125};
		
		fos.write(bys);
		
		fos.write(bys, 0, 3);
		
		fos.close();
	}
}
