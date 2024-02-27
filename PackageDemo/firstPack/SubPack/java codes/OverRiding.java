class OverRiding{
void add(int a,int b){
int c =(a+b);
System.out.println("Addition int :" +c);
}
/*
void add(double a,double b){
double c =a+b;
System.out.println("Addition double :" +c);
} */
	public static void main(String[] args){
	OverRiding obj=new OverRiding();
	obj.add((int)10.7,(int)20.6);		//Ttypecast FOr no function.


	}
}