package last;

import java.util.Iterator;

public class LinkedBinaryTreeTest {
	public static void main(String[] args) {
		LinkedBinaryTree<String> tree = new LinkedBinaryTree<String>();
		
		Position<String> root = tree.addRoot("Techyz");
		Position<String> level1 = tree.addLeft(root, "COO");
		Position<String> level2 = tree.addRight(root, "CAO");
		Position<String> level3 = tree.addLeft(level1, "Dilip");
		Position<String> level4 = tree.addRight(level1, "Vijay");
		Position<String> level5 = tree.addLeft(level2, "Raksha");
		Position<String> level6 = tree.addRight(level2, "Kavya");
		
		System.out.println(root.getElement());
		Iterator<String> iterator = tree.iterator(root);
		while(iterator.hasNext()) System.out.println(iterator.next());
	}
}