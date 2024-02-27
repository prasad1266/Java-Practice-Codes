import java.io.*;
public class TryWithResourcesDemo{

	public static void main(String[] args) {
try{	
	try(FileReader fr = new FileReader("myfile.txt")){
		System.out.println("Within try block");
	}
	
	finally{
	System.out.println("Within Finally block");
	}
}
	catch(IOException ex) {
	System.out.println("FIleNot FOuund : ");
	}
	System.out.println("Execution Successful : ");
	}

}
