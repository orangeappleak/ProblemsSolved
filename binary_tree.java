import java.util.*;
import java.io.*;

class Node{
	String data;
	Node left,right;

	Node(String data){
		this.data = data;
		left = right = null;
	}
}

public class binary_tree{

	Queue<Node> q = new LinkedList<>();

	public static void main(String args[]){

		binary_tree bt = new binary_tree();
		Node root = new Node("A");
		bt.insert(root,"B");
		bt.insert(root,"C");
		bt.insert(root,"D");
		bt.insert(root,"E");
		bt.insert(root,"F");
		bt.insert(root,"G");
		bt.insert(root,"Z");
	}

	public void LOT(Node root,String data){
		if(q.isEmpty()) q.add(root);
		Node temp = q.peek();
		if(temp.left!=null && temp.right!=null){
			q.add(temp.left);
			q.add(temp.right);
			System.out.println("Q.peek is="+q.peek().data);
			q.remove();
			LOT(q.peek(),data);
		}
		else{
			System.out.println("can insert at " + q.peek().data);
			insert(q.peek(),data);
		}
	}

	public void insert(Node root,String data){
		if(root.left!=null && root.right!=null) LOT(root,data);
		else if(root.left == null) root.left = new Node(data);
		else root.right = new Node(data);
	}

}
