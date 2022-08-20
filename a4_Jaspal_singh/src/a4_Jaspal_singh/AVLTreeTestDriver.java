package a4_Jaspal_singh;

public class AVLTreeTestDriver {

	public static void main(String[] args) {
	
		AVLTree<Integer> tree = new AVLTree<>();
		AVL avl = new AVL();
		System.out.println("Generate Tree:\n");
		avl.generateAVLTree(tree);
		
		System.out.println("\n\nPrint above generated Tree:");
		avl.printAVLTree(tree, "Inorder");
		avl.printAVLTree(tree, "Postorder");
		avl.printAVLTree(tree, "Preorder");
		
		 AVLTree<Integer> avlTree = new AVLTree<>(new Integer[]{10,2,6,9,50,75,80,20, 5});
		 System.out.println();
		 System.out.println("\n\nCreated new AVL Tree to test deletion:");
		 avl.printAVLTree(avlTree, "Inorder");
		 System.out.println("\nDelete Element From Tree: 2,6,50" );
		 
		 
		 avl.deleteElement(avlTree, 2);
		 avl.printAVLTree(avlTree, "Inorder");
		 System.out.println();
		 
		 avl.deleteElement(avlTree, 6);
		 avl.printAVLTree(avlTree, "Inorder");
		 System.out.println();
		 
		 avl.deleteElement(avlTree, 50);
		 avl.printAVLTree(avlTree, "Inorder");
	}

}
