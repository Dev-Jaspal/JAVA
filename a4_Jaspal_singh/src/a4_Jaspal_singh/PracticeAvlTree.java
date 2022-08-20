package a4_Jaspal_singh;

public class PracticeAvlTree {

	public static void main(String[] args) {
		 AVLTree<Integer> tree = new AVLTree<>(new Integer[]{10,20,30,40,50,60});
		 tree.inorder();
		 System.out.println();
		 tree.insert(35);
		 tree.inorder();
		 System.out.println();
		 System.out.println(tree.search(10));
		 System.out.println();
		 tree.path(35).forEach(x->System.out.println(x.element));
		 System.out.println();
		 System.out.println(tree.getRoot().element);
		 System.out.println(tree.getRoot().left.element);
		 System.out.println(tree.getRoot().right.element);
		 System.out.println(tree.getRoot().left.left.element);
		 System.out.println(tree.getRoot().left.right.element);
		 System.out.println(tree.getRoot().left.right.right.element);
		 System.out.println(tree.getRoot().right.right.element);
	
	}

}
