package last;

public abstract class AbstractTree<E> implements Tree<E>{
	public boolean isRoot(Position<E> position) { return position == root(); }
	public boolean isEmpty() { return size() == 0; }
}