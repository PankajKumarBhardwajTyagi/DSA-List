package last;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
	
	public Position<E> sibling(Position<E> position) {
		Position<E> parent = parent(position);
		if(parent == null) return null; // position must be root
		if(position == left(parent)) return right(parent); else return left(parent);
	}
	
	public int numChildren(Position<E> position) {
		int count = 0;
		if(left(position) != null) ++count;
		if(right(position) != null) ++count;
		return count;
	}
	
	public Iterable<Position<E>> children(Position<E> position) {
		List<Position<E>> positions = new ArrayList<Position<E>>(2);
		if(left(position) != null) positions.add(left(position));
		if(right(position) != null) positions.add(right(position));
		return positions;
	}

}