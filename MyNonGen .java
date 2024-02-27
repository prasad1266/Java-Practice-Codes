
class MynGen {
	Object ob;
	MynGen (){
	
	}
	MynGen (Object ob){
		this.ob = ob;
	}
	Object getOb(){
	return ob;
	}

}

//		*****USING OBJECT TYPE*******
 class MyNonGen{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MynGen mg1 = new MynGen (100);
		int a = (Integer)mg1.getOb();
			System.out.println("\t"+a);

		MynGen mg2 = new MynGen (22.5);
		Double b = (Double)mg2.getOb();
			System.out.println("\t"+b);

		MynGen mg3 = new MynGen("Hello");
		String c = (String)mg3.getOb();
			System.out.println("\t"+c);


	}

}
