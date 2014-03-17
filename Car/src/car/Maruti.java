package car;

public class Maruti extends car {								//concrete class,Inheritance
String SteeringType,WindowType;
@SuppressWarnings("unused")
private void Pricerange()
{
	System.out.println("1-10 lakhs");							//Encapsulation
}
public void setSteeringType(String SteeringType)
{
this.SteeringType=SteeringType;
System.out.println("SteeringType :"+SteeringType);
}
public void setWindowType(String WindowType)
{
this.WindowType=WindowType;
System.out.println("WindowType :"+WindowType);
}

@Override					
public void carfeatures()										//abstract method definition-Over-riding
{
	Manufacturer= "Maruti";
	color="Red";
	
	
	System.out.println("Manufacturer : "+Manufacturer );
	System.out.println("Color : "+color);
	
}

}