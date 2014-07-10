
public class Test {
	public static void main(String args[]){
		//Input,in terms of Preorder
		int[] arr = {7,3,6,1,-1,-1,-1,10,-1,-1,5,8,-1,-1,3,-1,-1};
		Btree btree = new Btree(arr);
		System.out.print("\nPreOrder\n");
		btree.preOrder(btree.root);
		System.out.print("\nInOrder\n");
		btree.inOrder(btree.root);
		System.out.print("\nPostOrder\n");
		btree.postOrder(btree.root);
		btree.size();
		btree.printAll(btree.root);
	}

}
