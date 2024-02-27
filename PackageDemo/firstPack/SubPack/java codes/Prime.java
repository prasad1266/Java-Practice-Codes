
import java.util.*;
public class Prime {
	int count=0;
	void getPrime(int n){

		for(int i=1; i<=n; i++){
		if(n%i==0){
	count++;
	     }
	   }
	if(count==2){
	System.out.println("Prime Number");
	   }
	else{
	   System.out.println("Not Prime Number");
	   }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime obj=new Prime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		obj.getPrime(num);

	}

}
