package assign1;

public class Fibonacci {

	static int fibseq(int n) {
		if (n <= 1) {
			return n;
		}
		return fibseq(n - 1) + fibseq(n - 2);
	}

	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i <= n; i++) {
			System.out.println("The " + i + "th term is: " + fibseq(i));
		}
	}

}
