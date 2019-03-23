
public class SumCode {

	public static void main(String[] args) {
		int d = sum(1030894525,10000000);
		System.out.println(d);
	}
	static int sum(int a, int b) {
		int c = a += b;
		return c;
	}
}
