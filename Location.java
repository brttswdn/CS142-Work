
/**
 * Write a description of class Location here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Object;

public class Location
{
    // fields
    private String name;
    private double longitude;
    private double lat;
   
    //Constructor
    /**
     * Constructor for objects of class Location
     */
    public Location(String name, double lat, double longitude)
    {
        if(lat<-90 || lat > 90 || longitude <-180 || longitude > 180){ 
            throw new IllegalArgumentException("Input values out of range");
        }
        this.name = name;
        this.lat = lat;
        this.longitude = longitude;
    }
    
    
    //Accessors
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getLatitude()
    {
        return this.lat;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public double getLongitude()
    {
        return this.longitude;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param      no parameters
     * @return     the name of this location
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * To String method presents the name of the location, latitude, and longitude in string format.
     * @return     a string of location, latitude, and longitude.
     */
    public String toString()
    {
        return("Location: " + name + "/n" + "Latitude: " 
                + this.lat + "/n" + "Longitude: " + this.longitude);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public double distance(Location loc2)
    {
        double lat2 = loc2.getLatitude();
        double lng2 = loc2.getLongitude();
        //Haversine formula
        double earthRadius = 3963.1;
        double lat1 = Math.toRadians(this.lat);
        lat2 = Math.toRadians(lat2);
        double lng = Math.toRadians(this.longitude);
        lng2 = Math.toRadians(lng2);
        
        double dLat = lat2-lat1;
        double dLong = lng2 - longitude;
        double sinDLat = Math.sin(dLat/2);
        double sinDLong = Math.sin(dLong/2);
        double a = Math.pow(sinDLat, 2) + Math.pow(sinDLong, 2) + Math.cos(lat1) + Math.cos(lat2);
        double c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double dist = earthRadius*c;
        return dist;
    }

}
