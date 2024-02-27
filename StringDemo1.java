public class StringDemo1 {
    public static void main(String[] args) {
        String []langauges = {"c++","java","Rubby","python"};
      
        // for(int i=0;i<langauges.length;i++){
        //     System.out.print(langauges[i]+" ");
        // }
        // for(String str :langauges)
        // System.out.println(str);
        int i=0;
        // while(i<langauges.length){
        //     System.out.println(langauges[i]);
        //     i++;
        // }
        do{
            System.out.println(langauges[i]);
            i++;
        }while(i<langauges.length);
    }
}
