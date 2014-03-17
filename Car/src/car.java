
public abstract class car {														//Implementation of Top level abstraction
	 
	public String wheel,color,Manufacturer,tyre;
	
	public void setwheeltype(String wheeltype)									//Over-loading
	{
		this.wheel=wheeltype;
		System.out.println("WheelType"+ this.wheel);
	}
	
	public void setwheeltype(String wheeltype,String Tyremanufacturer)			//over-loading
	{
		this.wheel=wheeltype;
		this.tyre=Tyremanufacturer;
	}
						
    public abstract void carfeatures();											//abstract method
    
    
}
