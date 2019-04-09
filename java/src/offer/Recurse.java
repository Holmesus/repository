package offer;

public class Recurse {

	public static int recurse(int n) {
		if (n < 1)
			return 1;
		return n * recurse(n - 1);
	}

	public static void main(String[] args) {
		System.out.print(recurse(5));
	}
}
