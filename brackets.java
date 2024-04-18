public class brackets {
    public static void append(int num,String str,StringBuilder rs){
        for(int i=0; i<num;i++){
            rs.append(str);
        }
    }
    public static void main(String[] args) {
        String str = "3[a]4[b]5[c]";
        String str2 = str;
        
        int length = str.length();
        String op = "";
        char[] arr = str.toCharArray();
        StringBuilder rs = new StringBuilder();
        int num;
        for(int i = 0; i<length; i++){
            
           if(Character.isDigit(arr[i])){
            num = arr[i]-'0';
           // System.out.println(arr[i]);
            int j = i+2;
            while(arr[j] !=']'){
                 op+=arr[j];
                //  System.out.println(op);
                append(num,op,rs);
                 j++;
            }
            op = "";
             }
        
         }
         System.out.println("Result String: "+rs);
        }
       
}
/*
 input--->	str=3[a]4[b]5[c]  
output---> 	aaabbbbccccc;     
            aaabbbbccccc
input--->	3[a2[ac]] 
output---> 	aacacaacacaacac
 */