package a4_Jaspal_singh;

import java.util.Random;

public class AVL extends AVLTree<Integer>{
	
	public void generateAVLTree(AVLTree<Integer> tree){
		Random rand = new Random();
		for (int i = 0; i < 14; i++) {
			int num = rand.nextInt(1, 101);
			System.out.println("Inserting Num >> " + num);
			tree.insert(num);
		}
	}
	
	public void printAVLTree(AVLTree<Integer> tree, String whichOrder) {
		
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
	
	public void deleteElement(AVLTree<Integer> tree, int elementToDelete){
		 
		System.out.println("\nDeleting element >> " + elementToDelete);
		tree.delete(elementToDelete);
	}
	
}
