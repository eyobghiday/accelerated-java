package labs.lab2;
//Question 3 onwards. 
//Creating the class file
public class GeoLocation {
	 
	//4. Creating two instance variables
	private double lng;
	private double lat;
	  
	//5. This is the default constructor
	   GeoLocation() {
	     
	   }
	  
	//6. This is the non-default constructor
	   public GeoLocation(double lat, double lng) {
	       this.lng = lng;
	       this.lat = lat;
	   }

	   //7.1 Accessor method for lat
	   public double getLat() {
	       return lat;
	   }
	   
	 //7.2 Accessor method for lng
	   public double getLng() {
	       return lng;
	   }
	   //8.1 Mutator method for lat
	   public void setLat(double lat) {
	       this.lat = lat;
	   }
	 
	   //8.2 Mutator method for lng
	   public void setLng(double lng) {
	       this.lng = lng;
	   }
	  
	   //9. toString() method to return in the format "(lat,lng)"
	   public String toString() {
	       return "("+lat + "," + lng + ")";
	   }
	  
	   //10. Boolean method to check if latitude is between -90 & 90
	   public boolean Lat()
	   {
	       if(this.lat>=-90 && this.lat<=90)
	           return true;
	       else;
	       return false;
	   }
	  
	   //11. Boolean method to check if longitude is between -180 & 180
	   public boolean Lng()
	   {
	       if(this.lng>=-180 && this.lng<=180)
	           return true;
	       else;
	       return false;
	   }
	   
	   
	   //12. Now to my understanding you neeed to return a geolocation function
	   //We need to create a method that takes string arguements
	   //But we also need to convert them into double using parse
	   //create new instance of Geolocation 
	   //return getLocation
	   public GeoLocation getGeoLocation(String slat, String slng)
	   {
	      
	       double stringlat=Double.parseDouble(slat); 
	       double stringlng=Double.parseDouble(slng);
	       GeoLocation GeoLocation=new GeoLocation(stringlat,stringlng);
	       return GeoLocation;
	      
	   }
	  

	}