package multipleproject;
import java.lang.String;
public class car {
	public static void main(String[] args)
	{   
		String Showroom_name="Tata showrooms";
		car cars=new car();
		String []carcolors= {"red","black","blue","violet","white"};
		System.out.println("car color and car model: "+cars.CarDetails());
		System.out.println("car is selected");
		System.out.println("Total cars: "+cars.CarCount(500));
		for(int i=0;i<carcolors.length;i++)
		{
		System.out.println(carcolors[i]);
		}
	    cars.ShowroomDisplay();
	    {
	    	System.out.println(Showroom_name);
	    }
	   
	    
	    	
	    
		
	}

   
	void ShowroomDisplay()
	{
		System.out.println("Welcome to showroom");
	}
public static String CarDetails() {
		
	return "blue and "+" tata";
	}
public static int CarCount(int count)
   {
	
	return count;
	

   }
}
class CarStore
{
	int car_var=10;
	CarStore store=new CarStore();
	
}