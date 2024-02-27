import java.io.*;
class MultipleThrows{

static void myFun() throws ArithmeticException,IOException{
 	int res = 5/0;

	}
public static void main (String[] args){

	try{
	myFun();
}
catch(IOException exp){
	System.out.println("IOException ");
	}
/*	catch(ArithmeticException e){
	System.out.println("Airthmetic Exeption");
	}*/
     }
}