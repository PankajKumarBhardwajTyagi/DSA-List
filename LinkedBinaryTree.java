package last;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {
	private List<E> list;
	
	public LinkedBinaryTree() { list = new ArrayList<E>(); }
	
	public List<E> getList() { return list; }
	
	private Node<E> root = null;
	private int size = 0;
	
	private Node<E> createNode(E element, Node<E> parent, Node<E> leftChild, Node<E> rightChild) {
		return new Node<E>(element, parent, leftChild, rightChild);
	}
	
	public Position<E> addRoot(E element) throws IllegalArgumentException {
		if(!isEmpty()) throw new IllegalArgumentException("Tree already has a ROOT");
		root = createNode(element, null, null, null);
		size = 1;
		return root;
	}
	
	private Node<E> validate(Position<E> position) {
		if(!(position instanceof Node)) throw new IllegalArgumentException("Invalid Position");
		Node<E> node = (Node<E>) position; // safe cast
		if(node.getParent() == node) throw new IllegalArgumentException("The Position is no longer on the Tree");
		return node;
	}
	
	public Position<E> addLeft(Position<E> position, E element) throws IllegalArgumentException {
		Node<E> parent = validate(position);
		if(parent.getLeftChild() != null) throw new IllegalArgumentException("The Position Already has a Left Child");
		Node<E> child = createNode(element, parent, null, null);
		parent.setLeftChild(child);
		++size;
		return child;
	}
	
	public Position<E> addRight(Position<E> position, E element) throws IllegalArgumentException {
		Node<E> parent = validate(position);
		if(parent.getRightChild() != null) throw new IllegalArgumentException("The Position Already has a Right Child");
		Node<E> child = createNode(element, parent, null, null);
		parent.setRightChild(child);
		++size;
		return child;
	}
	
	@Override public Position<E> left(Position<E> position) throws IllegalArgumentException {
		Node<E> node = validate(position);
		return node.getLeftChild();
	}

	@Override public Position<E> right(Position<E> position) throws IllegalArgumentException {
		Node<E> node = validate(position);
		return node.getRightChild();
	}

	@Override public Position<E> root() { return root; }

	@Override public Position<E> parent(Position<E> position) throws IllegalArgumentException {
		Node<E> node = validate(position);
		return node.getParent();
	}

	@Override public int size() { return size; }

	@Override public Iterator<E> iterator(Position<E> parent) {
		if(left(parent) != null) {
			list.add(left(parent).getElement());
			iterator(left(parent));
		}
		if(right(parent) != null) {
			list.add(right(parent).getElement());
			iterator(right(parent));
		}
		return list.iterator();
	}

	@Override public Iterator<E> iterator() { return null; }
}