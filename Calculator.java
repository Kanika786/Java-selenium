package week1.day1;

public class Calculator {
	
	public void sum(int i, int j)
	{
		int k = i+j;
		System.out.println("Sum is"+k);
	}
	public void subtraction(int i, int j)
	{
		int k = i-j;
	System.out.println("Subraction is"+k);
	}
	public void multiplication(double i, double j)
	{
		double k = i*j;
	System.out.println("Multiplication is"+k);
	}
	public void division(double i, double j)
	{
		double k = i/j;
	System.out.println("Division is"+k);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Calculator input = new Calculator();
			input.sum(2,3);
			input.subtraction(2, 3);
			input.multiplication(2, 3);
			input.division(2, 3);
		}

	}

}
