public class MkclReverse {
   
    public static void main(String[] args) {
        
        String str = "My name is Akash and i am 40 years old";

        String[] arr = str.split(" ");

        // String[] arr1 = str.split("\\s");
       
        int firstindex =0;
        int secondindex =0;
        String reverse="";

        for(int j=0,i=arr.length-1; i>=0; i--,j++){
           
            reverse += arr[i]+" ";

            if(isNumeric(arr[i])){
                firstindex=j;        //index is 2
                break;
            }
         } 
         
          System.out.println("Index Is : "+firstindex);
          System.out.println("Second Index is: "+secondindex);

       //  System.out.println("revese Is : "+reverse);

        
         int count =0;
         for(int j=0,i=arr.length-1; i>=0; i--,j++){
            if(isNumeric(arr[i])){
                count++;
                     
                if(count==2)
                { 
                    secondindex=j;        //secondindex is 2
                    break;
                }
               
            }
         }
        if(secondindex == 0){
            int loop = arr.length-firstindex;       //If no Second Number
            for(int i=0;i<loop-1;i++){
               reverse+= arr[i]+" ";
            }
            System.out.println("revese Is : "+reverse);
   
        }
        else{               //If have 2nd Number

            int loop = arr.length-secondindex;
            for(int i=0;i<loop;i++){
                reverse+= arr[i]+" ";
            }

            System.out.println("half "+reverse);     

            int start = arr.length-secondindex-1;
            int end =  arr.length-firstindex-2;
            System.out.println(start+"  "+end);


            for(int i=end;i<start;i--){
               
                reverse += arr[i]+" ";
                System.out.println(reverse);

            }
            // System.out.println(reverse);
        }
    }


    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
