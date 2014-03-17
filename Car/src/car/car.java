package car;

public abstract class car {
	 
	String wheel,color,Manufacturer,Carname,tyre;
	
	public void setwheeltype(String wheeltype)
	{
		this.wheel=wheeltype;
	}
	
	public void setwheeltype(String wheeltype,String Tyremanufacturer)
	{
		this.wheel=wheeltype;
		this.tyre=Tyremanufacturer;
	}
	
    public abstract void carfeatures();
    
    
}
