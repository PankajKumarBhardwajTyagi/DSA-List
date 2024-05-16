package last;

// Functional interface: if an interface has only one method
public interface Position<E> {
	public E getElement() throws RuntimeException;
}