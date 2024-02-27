class StringDemo{
public static void main(String[] args){

String str1= "Welcome";
//	String str = str1.concat(" Friends");			//Concat Functions

//		System.out.println(str);

// 			******CharAt Function**********

 //	char ch=str.charAt(0);
//	System.out.println(ch);



//				*****getChar()*********
	

char charr[]  = new char[4];
str1.getChars(1,4,charr,0);
System.out.println(charr);


String str2 = new String("WElcome");

String str3= "Welcome";
String str4 = new String("WElcome");
/* 
if(str1== str3){
System.out.println("Both same str1 & str3");
}
*/
// String str = str1==str3 ? "str1==str3" : "str1!=str3";

//System.out.println(str2);
	}
}
