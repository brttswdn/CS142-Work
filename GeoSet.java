
/**
 * Write a description of class GeoSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;

public class GeoSet
{
    // instance variables
    private double[][] Location;
    private int x;
    private int count;
    private File locationFile;

    /**
     * Constructor for objects of class GeoSet
     */
    public GeoSet(String filename)
    {
        locationFile = new File(filename);
        readInFile(locationFile);
    }
    
    //HELPER METHOD
    private int readInFile(File filename){
        try {
            Scanner input = new Scanner(filename);
            
            //number of locations in this file
            int locNum = input.nextInt();
            if (locNum < 2) {
                throw new IllegalArgumentException("File must have at least 2 locations.");
        }
        return locNum;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    

    /**
     * getCount counts the number of locations in a file/set
     * 
     * @param   no parameters
     * @return     the number of locations in this set 
     */
    public int getCount()
    {
        readInFile(locationFile);
        //locNum equals the number of locations in the file
        return readInFile(locationFile);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     * PLAN: TO MAKE AN ARRAY WITH ALL THE LOCATIONS, THEN SUBTRACT CONSECUTIVE LOCATIONS
     * TO FIND THE SMALLEST.
     */
    public double findMinDist(int y)
    {
        // put your code here
        return y;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public Location find(String name)
    {
        Location found = new Location(name, 0.0, 0.0);
        while(locationFile.hasNext){
            if (locationFile.next != name){
                //carry on
            }else if (locationFile.next.equals(name)){
                found.lat = locationFile.nextDouble();
                found.longitude = locationFile.nextDouble();
            }
        }
        found.name = name;
        return found;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     * PLAN: TO MAKE AN ARRAY
     */
    public Location[] farthest()
    {
        // put your code here
        return y;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public String toString()
    {
        String output = "";
        while(locationFile.hasNext()) {
            output = output + locationFile.next() + " " + locationFile.nextDouble() + 
                " " + locationFile.nextDouble() + "\n";
    }
    return output;
    }
}
