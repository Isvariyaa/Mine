package car;

public class Hyundai extends car{								//Inheritance
String ReverseSensor,Geartype;
int spokes;
public void setGearType(String Geartype)
{
this.Geartype=Geartype;
}
public void setReverseSensor(String ReverseSensor)				// additional functions
{
this.ReverseSensor=ReverseSensor;
}

public void setwheeltype(String wheeltype,int spokes)
{
	this.wheel=wheeltype;
	this.spokes=spokes;
}
@Override
public void carfeatures() {
	// TODO Auto-generated method stub
	
}
}