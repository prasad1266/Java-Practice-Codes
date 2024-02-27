class StringBufferDemo{
public static void main(String args[]){
	StringBuffer str = new StringBuffer("Welcome");
	System.out.println("STring : "+str);


	str.append(" Friends");
System.out.println("STring : "+str);

System.out.println("___________STring Replace__________ ");
str.replace(2,4,"java");
System.out.println("STring : "+str);

	System.out.println("___________STring Delete__________ ");
	
	str.delete(2,6);
	System.out.println("STring : "+str);

		System.out.println("___________STring __________ ");
	str.delete(2,6);
	System.out.println("STring : "+str);





















	}
}