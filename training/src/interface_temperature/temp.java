package interface_temperature;

public class temp implements interfaceconvt  
{

	public void ftc(float farenheit) 
	{
		// TODO Auto-generated method stub
		float convt=((farenheit-32)*5)/9;
		System.out.println("After converting farenhiet to celcius: "+convt);
	}

	public void ctk(float celcius) 
	{
		// TODO Auto-generated method stub
		float convt= celcius + 273.15f;
		System.out.println("After converting celcius to kelvin: "+convt);
		
	}
	
	public static void main(String[] args) 
	{
		temp t=new temp();
		t.ftc(farenheit);
		t.ctk(celcius);
	}
	
}
