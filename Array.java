import java.util.*;
class Array{
public static void main(String args[]){

Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[n];
System.out.println("Enter Elements Here :");
for(int i=0; i<n; i++){
arr[i]=s.nextInt();
	}
System.out.println("Elements Are:");
int max=0;
for(int i=0; i<n; i++){
System.out.println(arr[i]);
if(arr[i]>max){
max=arr[i];
    }
	}

System.out.println("Max Element is :"+max);
    }
}