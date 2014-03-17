

package carname;
import car.*;												 //importing car package

public class swift {
	static String carname="swift";

	public static void main(String[] args)
	{
		Maruti m = new Maruti();
		System.out.println("MARUTI \n\n");
		System.out.println(carname);						
		m.setSteeringType("Power steering");
		m.setWindowType("Power window");
		m.carfeatures();
		
		car c = new Hyundai();	
		car c1 = new Maruti();   
		c.carfeatures();
		c1.carfeatures();										// Dynamic dispatch
		
	}
	
	
	
}
