package JavaBasic;

public class ThrowsKeywords {

	public static void main(String[] args) {

		ThrowsKeywords obj = new ThrowsKeywords();
		obj.sum();
		System.out.println("ABC");
	}

	public void sum() {

		try {

			div();
		} catch (ArithmeticException e) {

		}

	}

	public void div() throws ArithmeticException {
		int i = 9 / 0; // Exception Line
	}

}
