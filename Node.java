package last;

public class Node<E> implements Position<E>{
	private E element;
	private Node<E> parent;
	private Node<E> leftChild;
	private Node<E> rightChild;
	
	public Node(E element, Node<E> parent, Node<E> leftChild, Node<E> rightChild) {
		this.element = element;
		this.parent = parent;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public E getElement() { return element; }
	public void setElement(E element) { this.element = element; }

	public Node<E> getParent() { return parent; }
	public void setParent(Node<E> parent) { this.parent = parent; }

	public Node<E> getLeftChild() { return leftChild; }
	public void setLeftChild(Node<E> leftChild) { this.leftChild = leftChild; }

	public Node<E> getRightChild() { return rightChild; }
	public void setRightChild(Node<E> rightChild) { this.rightChild = rightChild; }
}