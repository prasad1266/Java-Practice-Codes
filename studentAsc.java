import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class student{
    private int id;
   private String name;
    private String date;

    student(int id ,String name,String date){
        this.id = id;
        this.name = name;
        this.date = date;

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getdate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
   @Override  
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
    // public Date getDateObject() {
    //     try {
    //         SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    //         return sdf.parse(date);
    //     } catch (ParseException e) {
    //         e.printStackTrace();
    //         return null;
    //     }
    // }

}
public class studentAsc {
   public static void main(String[] args) {
    
    List<student> list = new ArrayList<>();
    student stt = new student(2, "Ganesh", "17/12/1990");
    
    String arr = stt.getdate().split("/")[1];
    
    list.add(new student(1,"Prasad","13/05/1998"));
    list.add(new student(2,"Aayush","12-01-1995"));
    list.add(new student(3,"Pravin","20/07/2001"));
    list.add(stt);

    // System.out.println(list);
    List<student> std = list.stream()
                        .sorted((a,b)->a.getdate().split("[/-]")[1].compareTo(b.getdate().split("[/-]")[1]))
                        .toList();
        for(student ob :std){
            System.out.println(ob);
        }
   }

}
