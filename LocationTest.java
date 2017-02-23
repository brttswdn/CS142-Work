

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LocationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LocationTest
{
    /**
     * Default constructor for test class LocationTest
     */
    public LocationTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testGetLatitude()
    {
        Location loc1 = new Location(NYC, 40.747923, -73.985217);
        assertEquals(40.747923, loc1.getLatitude(), 0.0001);
    }
    
    @Test
    public void testGetLongitude()
    {
        Location loc1 = new Location(NYC, 40.747923, -73.985217);
        assertEquals(-73.985217, loc1.getLongitude(), 0.0001);
    }
    
    @Test
    public void testGetName()
    {
        Location loc1 = new Location(NYC, 40.747923, -73.985217);
        assertEquals(NYC, loc1.getName());
    }
    
    @Test
    public void testToString()
    {
        Location loc1 = new Location(NYC, 40.747923, -73.985217);
        assertEquals("Location: " + loc1.getName() + "/n" + "Latitude: " 
                + loc1.getLatitude() + "/n" + "Longitude: " + loc1.getLongitude());
    }
    
    /**
    @Test
    public void testDistance()
    {
    }
    */
   
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
