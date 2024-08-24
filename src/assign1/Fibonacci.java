package assign1;

public class Fibonacci {
	/*
	 * Recursive static method
	 *
	 * @param n the integer n to set the number
	 *
	 * @return n the integer number
	 *
	 * @return fibseq() the formula to calculate the fibonacci sequence
	 */
	static int fibseq(int n) {
		if (n <= 1) {
			return n;
		}
		return fibseq(n - 1) + fibseq(n - 2);
	}

	/*
	 * Main method Prints out fibseq() method
	 */
	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i <= n; i++) {
			System.out.println("The " + i + "th term is: " + fibseq(i));
		}
	}

}
