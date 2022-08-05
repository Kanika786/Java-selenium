package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 153 , originalNumber, remainder, result = 0;
		   originalNumber = number;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " = (1*1*1)+(5*5*5)+(3*3*3) is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }
	
		

	}

