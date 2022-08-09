package jul22.week2.day1;

public class LearnArray {

	public static void main(String[] args) {
		
		int[] nums = new int[6];
		nums[0] = 20;
		nums[1] =30;
		nums[2]=40;
		nums[3]=50;
		nums[4]=60;
		nums[5]=70;
		
		int[] num = {20,30,40,50,60,100,110};
		
		//System.out.println(nums.length); // to find length of array
		
		//for(int i = 0; i< nums.length; i++)  //this is printing values store in arrays
		{
	//		System.out.println(nums[i]);
			
		}
		
		int lastindex = (nums.length)-1;  //To find the last index
		{ 
			System.out.println(lastindex);  
		}
		
		
		for(int i = 0; i< num.length; i++)  //this is printing values store in arrays
		{
			System.out.println(num[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
