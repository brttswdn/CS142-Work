
/**
 * Write a description of class MovieReviews here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;

public class MovieReviews
{
    // fields (instance variables)
    private int[] rawReviews;
    private String[] movieTitles;
    private String[] reviewers;
    private int[] rankedReviews;
    private double[] avgRanks;

    /**
     * Constructor for objects of class MovieReviews
     */
    public MovieReviews()
    {        
    }

    //PRIVATE METHODS
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private void readReviews(int y)
    {
        File movies = new File();
        Scanner input = new Scanner(movies);
        
        int numOfReviewers = input.nextInt();
        int numOfMovies = input.nextInt();
        rawReviews = new int[numOfReviewers][numOfMovies]; //single array?
        for(int i = 0; i < numOfMovies; i++){
            for (int j = 0; j < numOfReviewers; j++) {
                rawReviews[i][j] = input.nextInt(); //cycle through reviews
            }
        }
        
        movieTitles = new String[numOfMovies];
        for(int i = 0; i < numOfMovies; i++){
            movieTitles[i] = input.next();
        }
        
        reviewers = new String[numOfReviewers];
        for(int i = 0; i < numOfReviewers; i++) {
            reviewers[i] = input.next();
        }
        
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    private void generateRankings()
    {
        rankedReviews = new int[numOfMovies][numOfReviewers];
        int rank = 0;
        for(int i = 0; i <numOfReviewers - 1; i++) { //numOfReviewers = number of rows
            int[]temp = Arrays.copyOf(rawReviews[row], arr[row].length);
            Arrays.sort(temp);
        }
        r = 1;
        for (int i = temp.length; i <= 0; i--) {
            if (temp[i] == arr[row][c]) {
                //arr[row][c];
                rankedReviews[row][c] = r;
            }
        }
        if ( i > 0 && temp[i] != temp[i-1]) {
            r++;
        }
    }    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    private void calculateAvgRankings()
    {
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    private void displayReviews(int[] arr)
    {
        
    }

    //PUBLIC METHODS
    /**
     * An example of a method - replace this comment with your own 
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void sortByRanking()
    {
        int[] temp;
        temp.length = rawReviews[movies].length; // from class notes
        // other option?
        //temp = int[numOfMovies] (numOfMovies = number of columns) 
        
        for(int i = 0; i < numOfMovies - i; i++) { //numOfMovies = number of columns in array
            for(int j = 0; j < numOfMovies-i-1; j++) {
                if (avgRanking[i] < avgRanking[i+1]) {
                    temp = avgRanking[i];
                }
            }
        }

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int getReviewerCount()
    {
        return this.numOfReviewers;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int MovieCount()
    {
        return this.numOfMovies;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int getRawReview(int reviewer, int movie)
    {
        return rawReviews[reviewer][movie];
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int getRankedReview(int reviewer, int movie)
    {
        //return y;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    
    public String getMovieTitle(int movie)
    {
        return movieTitles[movie];
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public String getReviewerName(int reviewer)
    {
        return reviewers[reviewer];
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public double getAvgRank(int movie)
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
    public void displayRawReviews()
    {
        
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void displayRankedReviews()
    {
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void displayRankedMovies()
    {
    }
}
