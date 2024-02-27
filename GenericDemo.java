class MyGen <T> {
	T ob;
	MyGen (){
	ob = null;
	}
	MyGen(T ob){
		this.ob = ob;
	}
	T getOb(){
	return ob;
	}

}
class GenericDemo{
public static void main(String[] args){
	MyGen<Integer> mg1 = new MyGen <Integer>(100);
	int a = mg1.getOb();
		System.out.println("\t"+a);

	MyGen<Double> mg2 = new MyGen <Double>(22.5);
	Double b = mg2.getOb();
		System.out.println("\t"+b);

	MyGen<String> mg3 = new MyGen <String>("Hello");
	String c = mg3.getOb();
		System.out.println("\t"+c);
	}
}