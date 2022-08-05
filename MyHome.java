package week1.day1;

public class MyHome {

	private String bed ="queen";
	
	public void bedRoom()
	{
		System.out.print(bed);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            PublicPark park = new PublicPark();
    		MyHome house = new MyHome();
    		house.bedRoom();
System.out.println(park.swing);
System.out.println(park.playground);
	}

}