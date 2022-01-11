
public class Main {
	

	public static void main(String[] args) {
		BinaryTree theTree=new BinaryTree();
		theTree.addNode(15);
		theTree.addNode(45);
		theTree.addNode(16);
		theTree.addNode(25);
		theTree.addNode(86);
		theTree.addNode(95);
		theTree.addNode(10);
		theTree.addNode(7);
		theTree.inOrderTraverseTree(theTree.root);
		theTree.preOrderTraverseTree(theTree.root);

	}

}
