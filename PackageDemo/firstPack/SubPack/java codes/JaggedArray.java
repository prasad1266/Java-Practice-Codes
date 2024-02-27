class JaggedArray{
public static void main(String[] args){
	//int arr1[][]={{5,10}, {10,20,30},{30}};


	int arr1[][]=new int[3][];

arr1[0]=new int[2];
arr1[1]=new int[3];
arr1[2]=new int[1];
//Input
	for(int i=0; i<3;i++){
		for(int j=0; j<arr1[i].length;j++){
		arr1[i][j]=i+j;	
	}
}
//print
	for(int i=0; i<3;i++){
		for(int j=0; j<arr1[i].length;j++){

		System.out.print(arr1[i][j]+"\t");
	}
System.out.println();
}

	}
}