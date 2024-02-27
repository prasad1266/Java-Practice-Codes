class LabelDemo{

	public static void fun() {
		block1: {
			System.out.println("Block 1");
		}
		block2: {
			System.out.println("Block 2");
			break;
		 block3:{
			System.out.println("Block 3");
			
			}
		}
	}


public static void main(String[] args){
	fun();
	}
}