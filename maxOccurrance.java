public class maxOccurrance{
    public static int checkCount(int num,int []arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int max =0;
        int Num=0;
        int [] arr = {10,20,20,20,11,20,12,10};
        for(int i = 0; i<arr.length; i++){
            int count = 0;
           
            count = checkCount(arr[i],arr);
            if(count>max){
                max= count;
                Num = arr[i];
            }
          
        }
        System.out.println("maxCount of "+Num+" is: "+max);
    }
}