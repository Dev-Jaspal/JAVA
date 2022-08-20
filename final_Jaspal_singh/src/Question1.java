

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Question1 {
	
	public static void main(String... s) {
		System.out.println("--------(Jaspal Singh) Question 1-----------");
		System.out.println("Testing method fillQueue(): ");
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		int i= 1;
		while(i < 6) {
			System.out.print("Enter a positive integer: ");
			queue.add(sc.nextInt());
			i++;
		}
		fillQueue(queue);
		System.out.println();
		System.out.println();
		System.out.println("Testing method createAVLTree( ): ");
		AVLTree<Integer> tree = new AVLTree<Integer>();
		createAVLTree(queue, tree);
		System.out.println();
		System.out.println();
		System.out.println("Testing method printAVLTree( ): ");
		printAVLTree(tree, "inorder");
	}
	
	public static void fillQueue(Queue<Integer> queue) {
		System.out.print("Queue has been filled with numbers ");
		Iterator<Integer> item = queue.iterator();
		StringBuilder sb = new StringBuilder();
		while(item.hasNext())
		{
			if(!sb.isEmpty()) {
				sb.append(",");
			}
			sb.append(item.next());
		}
		System.out.println(sb);
	}
	
	public static void createAVLTree(Queue<Integer> queue, AVLTree<Integer> tree) {
		Iterator<Integer> item = queue.iterator();
		while(item.hasNext())
		{
			int val = item.next();
			tree.insert(val);
			System.out.println("Number " + val + " inserted to AVLTree");
			
		}
	}
	
	public static void printAVLTree(AVLTree<Integer> tree, String whichOrder) {
		switch(whichOrder.toLowerCase()) {
		case "inorder":
			System.out.print("\nInorder: ");
			tree.inorder();
			break;
		case "postorder":
			System.out.print("\nPostorder: ");
			tree.postorder();
			break;
		case "preorder":
			System.out.print("\nPreorder: ");
			tree.preorder();
			break;
		default:
			System.out.println("Please enter any of these order:\nInorder\nPostorder\nPreorder");
			break;
		}
	}

}


