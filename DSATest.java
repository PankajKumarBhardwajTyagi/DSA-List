package last;

public class DSATest {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// run your algorithm
		for(int count = 1; count <= 100; ++count) {
			try {
				Thread.sleep(100);
			} catch(InterruptedException ie) {}
		}
		long endTime   = System.currentTimeMillis();
		long elapsed   = endTime - startTime;
		System.out.println("Time taken for the Algorithm: " + elapsed / 1000 + " second(s)");
	}
}