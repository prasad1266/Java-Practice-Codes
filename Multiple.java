public class Multiple { 

    public static void multiple(int num1,int num2, int []arr){
        for (int i = 1; i <= num2; i++) {
           // System.out.println(num1*i);
           // arr.push(num1*i);
           arr[i-1] = (num1*i);
        }
      
        
    }
    public static void main(String[] args) {
        int num2 = 5;
        int arr[] = new int[num2]; 
        multiple(7,5,arr);
        for (int i: arr) {
            System.out.println(i);   
        }
       
  
    }
}
