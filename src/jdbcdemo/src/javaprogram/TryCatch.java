package javaprogram;

public class TryCatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i = 9;
		int j = 0;
		
		try {
		System.out.println("Result" + i/j);
		}
		catch(ArithmeticException e ) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Please do not give 0 as value of j");
		}
		System.out.println("Result for addition" + i+j);
		System.out.println("Result for multplication" + i*j);
		System.out.println("Result for subtraction" + (i-j));

	}

}
