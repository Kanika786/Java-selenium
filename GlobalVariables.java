package week1.day1;

public class GlobalVariables {
	
	String mobileModel = "iphone";
	int mobileWeight = 250;
	boolean isFullCharge = true;
	double mobileCost = 1200.58;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  GlobalVariables GV = new GlobalVariables();
                  System.out.println(GV.mobileModel);
                  System.out.println(GV.mobileWeight);
                  System.out.println(GV.isFullCharge);
                  System.out.println(GV.mobileCost);
	}

}
