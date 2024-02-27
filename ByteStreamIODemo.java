import java.io.*;

public class ByteStreamIODemo {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("C:\\Users\\Admin\\Desktop");
		boolean val = f1.exists();
		System.out.println("Is File Extist Or Not : "+val);
		
		String name = f1.getName();
		
		System.out.println("Name Of The File Is : "+name);
		
	//Reading File
		
		FileInputStream  fis = new FileInputStream(f1);
		int ch;
		while((ch = fis.read()) != -1)
		{
			System.out.println(ch);
		}
		fis.close();
		System.out.println("I/O Operation Done SuccessFull");
		
		
		
//		FileOutputStream fos = new FileOutputStream(f2);
	}

}