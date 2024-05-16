package last;

import java.util.Iterator;

public interface Tree<E> extends Iterable<E> {
	public Position<E> root();
	public Position<E> parent(Position<E> position) throws IllegalArgumentException;
	public Iterable<Position<E>> children(Position<E> position) throws IllegalArgumentException;
	public int numChildren(Position<E> position) throws IllegalArgumentException;
	public boolean isRoot(Position<E> position) throws IllegalArgumentException;
	public int size();
	public boolean isEmpty();
	public Iterator<E> iterator(Position<E> parent);
}