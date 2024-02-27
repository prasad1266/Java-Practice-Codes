abstract class Shape{
abstract void CalArea();
void PrintArea(){
System.out.println("Shape PrintArea");
	}
}
class Rectangle extends Shape{
void CalArea(){
System.out.println("Rectangle  CaltArea");
	}
   }
class Square extends Shape{
void CalArea(){
System.out.println("Square  CaltArea");
	}
   }
class Circle extends Shape{
void CalArea(){
System.out.println("Circle  CaltArea");
	}
   }
public class PolymorphismDemo{
public static void main(String[] args){
	Shape shape=null;
	Rectangle rect= new Rectangle();
	Circle crcl = new Circle();

	Shape shp[] = new Shape[3];
	shp[0] = rect;
	shp[1] = crcl;
	shp[2] = new Square(); 
	for(int i=0; i<shp.length; i++){
		shp[i].CalArea();
}
 
	}
}