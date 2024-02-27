class delletionTree{

	static Node root;
	
	static class Node{
		int data;
		Node left;
		Node right;
	
	 Node(int data){
	 this.data= data;
	 left = null;
	 right = null;
		}
	}
	
		delletionTree(){
		root = null;
			}
			
		delletionTree(int data){
		root = new Node(data);
		}
	
	static void inorder(Node root){
	
		if(root == null){
		return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
			
	
		}
		static void inordercall(Node root){
		inorder(root);
			}
		
		static Node insert(Node root,int data){
		
			if(root == null){
			root = new Node(data);
			return root;
			}
			if(data <= root.data){
			root.left = insert(root.left,data);
			}
			if(data >= root.data){
			root.right = insert(root.right,data);
			}
			return root;
		}
		
		static  void insertCall(int data){
			root = insert(root,data);
			}
			
		static Node deleteData(Node root, int key){
			if(root == null){
				return root;
			}
			if(key < root.data){
				root.left = deleteData(root.left,key);
			}
			else if(key > root.data){
				root.right = deleteData(root.right,key);
			}
			else{
				if(root.left == null)
					return root.right;
				
				else if(root.right == null)
					return root.left;
				
				// case 3
				
				root.data = minValue(root.right);
				
				root.right = deleteData(root.right, root.data);
				
			}
			return root;
			
		}
		
		static int minValue(Node root){
			
			int x= root.data;
			while(root.left != null){
					x= root.left.data;
					root= root.left;
			}
			return x;
		}
		
		static void deletecall(int key){
			root = deleteData(root, key);
		}
		
		public static void main(String[] args){
			
			delletionTree dt = new delletionTree();
			
			dt.root =new Node(10);
			
			insertCall(15);
			insertCall(20);
			insertCall(25);
			insertCall(30);
		
			inordercall(root);	
			System.out.print("\n\nTree After Deletion Of 25 : \n");
			
			
			deletecall(25);
			inordercall(root);
			
			}
		}
	
	
	
