package labs.lab2;
//This is an application class for our GeoLocation.Java file
//Since the assignment is displaying only, I went ahead and show the boolean values as well
//I have tested the program for all possible values
//Double values checks out
//Int values checks out
//Booleans checks out as well. 

public class Question13
{
  
   public static void main(String[] args)
   {
       //a. Let's create instance of an object using default constructor
       GeoLocation instance01=new GeoLocation();
       instance01.setLat(47); 
       instance01.setLng(-120); 
      
     //b. Let's assign some values for non default constructor here
       double lat=-21.7;
       double lng=181;
      
       //c. I'm Creating an object using non-default constructor
       GeoLocation instance02=new GeoLocation(lat,lng);
      
       System.out.println("Testing out Instance 01 using default constructor:");
      
       System.out.println("Latitude is:"+instance01.getLat()); 
       System.out.println("Longitude is:"+instance01.getLng());
      
       System.out.println("\nTesting out Instance 02 using non-default constructor:");
      
       System.out.println("Latitude is:"+instance02.getLat());
       System.out.println("Longitude is:"+instance02.getLng());
       
       System.out.println("\nTesting if values are within given range using default contructor:");
       
       System.out.println("Latitude is:"+instance01.Lat());
       System.out.println("Longitude is:"+instance01.Lng());
       
       System.out.println("\nTesting if values are within given range using non-default contructor:");
       
       System.out.println("Latitude is:"+instance02.Lat());
       System.out.println("Longitude is:"+instance02.Lng());
      
   }
}