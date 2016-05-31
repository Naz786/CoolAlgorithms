public class MultipleOfTwo {

	public static void main(String[] args) {

		System.out.println(isPowTwo());
	}

	static int inputNum = 3;
	static boolean trueN = false;

	public static boolean isPowTwo() {
		
		for (int i = 0; i < inputNum; i++) {

			if (Math.pow(2, i) == inputNum) {
				return trueN = true;
			}
		}
		return trueN;
	}
}
