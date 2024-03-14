	
	public class PrimeNumber{
	public static void main (String[] args){
	String str = "hello";
	String reverse ="";
	int n= str.length()-1;
	for(int i=n ;i>=0; i--){
	reverse += str.charAt(i);
	}
	System.out.println("Reverse String is : "+reverse);
	/* StringBuilder str = new StringBuilder ("hello");
	System.out.println("Reverse String Is : "+str.reverse());
	*/
		}
	}
/*		
	 public static boolean primeCheck(int a){
	if(a<2){
	return false;
	}
	for(int i=2; i<Math.sqrt(a);i++){
	if(a%i==0)
	return false;
	}
	return true;

}
public static void main (String[] args){
	for(int i = 100; i<=200; i++){
	if(primeCheck(i))
	System.out.println(i);
	}

	}
}
*/
/*
select salary from emp
order by salary dec;
Limit 2 ,1;

//LIMIT 1 OFFSET 2;

select salary from emp
where salary =( select salary from emp
order by salary dec;
Limit 2 ,1;
)


select max(salary) from emp 
where salary  < (
select max(salary) from emp 
where salary < (
select max(salary) from emp
));









*/

