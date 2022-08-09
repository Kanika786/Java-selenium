package jul22.week2.day1;

public class StringName {

	public static void main(String[] args) {  // check number of occurence of char (eg a ) in a string)
		String name = "my name is kanika";
		
		int count = 0;
		char[] charArray = name.toCharArray();  // convert string into char array 
		
	//	for (int i=0; i<charArray.length; i++)
		{
		//System.out.println(charArray[i]);
		}
		for (int i =0; i<charArray.length; i++)
		{
			if (charArray[i]=='a')
				count++;
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
	}

}
