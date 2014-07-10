import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Btree {
	Node root;
	private static int i = 0;
	private static ArrayList<Integer> list = new ArrayList<Integer>();
	public Btree(int[] arr){
		this.root = create(arr);
	}
	private Node create(int[] arr){
		Node temp;
		int data = arr[i];
		i++;
		if(data==-1)
			return null;
		list.add(data);
		temp = new Node(data);
		temp.left = create(arr);
		temp.right = create(arr);
		return temp;
	}
	public void preOrder(Node n){//中->左->右
		if (n != null) {
			System.out.print(n.data+" ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	public void postOrder(Node n) {//左->右->中
		if (n!=null) {
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.data+" ");
		}
	}
	public void inOrder(Node n) {//左->中->右
		if (n != null) {
			inOrder(n.left);
			System.out.print(n.data+" ");
			inOrder(n.right);
		}
	}
	public void printAll(Node n) {//樹的節點降冪輸出
		System.out.print("\nPrintAll: ");
		Collections.sort(list, new Comparator<Integer>(){//Sort ArrayList
			@Override 
			public int compare(Integer a, Integer b){
				return a.compareTo(b);
			}
		});
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i)+" ");
		}
	}
	public void size() {//樹的大小
		System.out.print("\nSize: "+list.size());
	}
}
