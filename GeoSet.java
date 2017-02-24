/**
 * Write a description of class GeoSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
//import Location

public class GeoSet
{
    // instance variables
    private Location[] locArray;
    private int x;
    private int num;
    private File locationFile;

    /**
     * Constructor for objects of class GeoSet
     */
    public GeoSet(String filename)throws FileNotFoundException
    {
        File locationFile = new File(filename);
        Scanner input = new Scanner(locationFile);
            
       //number of locations in this file
       int num = input.nextInt();
       Location locArray[] = new Location[num];
       
       if (num < 2) {
                throw new IllegalArgumentException("File must have at least 2 locations.");
       }
       for (int i = 0; i < num; i++) {
           String place = input.next();
           double lat = input.nextDouble();
           double longitude = input.nextDouble();
           locArray[i] = new Location(place, lat, longitude);
        }
    }


    /**
     * getCount counts the number of locations in a file/set
     * 
     * @param   no parameters
     * @return     the number of locations in this set
     * */
     
    public int getCount()
    {
        return this.num;
    }

    
    /**
     * findMinDist Based on the order that the Locations were loaded into this GeoSet, 
     * this method returns the smallest distance between 2 consecutive Locations in this set
     *
     * @param   no parameters
     * @return     the difference between x and y
     * PLAN: TO MAKE AN ARRAY WITH ALL THE LOCATIONS, THEN SUBTRACT CONSECUTIVE LOCATIONS
     * TO FIND THE SMALLEST. NEED NESTED FOR LOOP.
     * */
     
    public double findMinDist()
    {
        double min = 3963.1; // earth's radius - attempt at no magic numbers
        for(int i = 0; i < this.num; i++) {//for all the locations in the file
            for (int j = 1; j < 3; j++) { // for the last two values in each location array
                double dist = Location.distance(locArray[i]); //find the distance between i and i -1
                if (dist <= min) {
                    min = dist;
                }
            }
        }
    }

    
    /**
     * returns the Location whose name matches the parameter. Return null if no match found
     *
     * @param  name   the name of the location you're looking for
     * @return     the array of the lat/long for the location
     * */
     
    public Location find(String name)
    {
        //Location found = new Location(name, 0.0, 0.0);
        for(int i = 0; i< num; i++){
            for ( int j = 0; j< 1; j++) {
                if (locArray[i][0] /* place*/ == name) {
                    return locArray[i];
                }
            }
        }
        /*while(locationFile.hasNext){
            if (locationFile.next != name){
                continue;
            }else if (locationFile.next().equals(name)){
                found.lat = locationFile.nextDouble();
                found.longitude = locationFile.nextDouble();
            }
        }
        found.name = name;
        return found;
        */
    }
}
 
   
    /**
     * returns an array with the 2 Locations from this GeoSet 
     * that are the farthest from each other. 
     * These 2 Locations are not necessarily consecutive in the set.
     *
     * @param   no parameters
     * @return     an array of the two locations farthest from each other
     * PLAN: TO MAKE AN ARRAY. NEED NESTED FOR LOOP.
    
    public Location[] farthest()
    {

    }
    */
    /**
     * returns a String that contains the String representation for 
     * each Location object in this GeoSet, separate by '\n'.

     *
     * @param  no parameter
     * @return     the string representation for each location
     
    public String toString()
    {
        String output = "";
        while(locationFile.hasNext()) {
            output = output + locationFile.next() + " " + locationFile.nextDouble() + 
                " " + locationFile.nextDouble() + "\n";
    }
    return output;
    }
    */
