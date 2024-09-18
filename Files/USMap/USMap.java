/**
 *  USMap.java
 *	Read in and plot cities in the USA. Plots large cities with porportional
 *  dots and showing the top 10 cities in red.
 *
 *	@author Jasmine Zhao
 *	@since September 4, 2024
 */
import java.util.Scanner; 
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class USMap
{
	private Scanner input; // Scanner for cities.txt
	private Scanner bigInput; // Scanner for bigCities.txt
	
	public USMap()
	{
	}
	
	public static void main(String [] args)
	{
		USMap us = new USMap();
		us.runIt();
	}
	
	public void runIt()
	{
		setupCanvas();
		getScanner();
		readIn();
		drawBigCities();
	}
	
	public void setupCanvas() 
	{
		StdDraw.setTitle("USMap");
		StdDraw.setCanvasSize(900, 512);
		StdDraw.setXscale(128.0, 65.0);
		StdDraw.setYscale(22.0, 52.0);
	}
	
	public void getScanner()
	{
		// Creates scanner for cities.txt
       input = FileUtils.openToRead("cities.txt");
        
	}
	
	public void getBigCities()
	{
		// Creates scanner for bigCities.txt
		bigInput = FileUtils.openToRead("bigCities.txt");
	}
	
	public void readIn()
	{	
		double xCord = -1.0; // variables to store the double coordinates
		double yCord = -2.0;
		StdDraw.setPenColor(StdDraw.BLUE);
		while(input.hasNext())
		{
			xCord = input.nextDouble(); // reads in first and second double 
			yCord = input.nextDouble();  // for the cords
			StdDraw.filledCircle((yCord), xCord, 0.06);
			input.nextLine();  // moves scanner to the next line
		}
		
	}
	
	public void drawBigCities()
	{
		String line = new String (" ");  //line of bigCities.txt
		String cordLine = new String (" ");  //line of cities.txt
		String cityName = new String (" "); // name of city from bigCities.txt
		String cordCity = new String (" "); // name of city from cities.txt
		double xCordBig = -1.0; // variables to store the double coordinates
		double yCordBig = -2.0;
		int popNum = -1; // stores the population of the city
		int rank = -2; // stores the rank of the biggest cities
		getBigCities(); // makes scanner go to top of file
		
		/* finds the rank, population and name of the biggest cities using
		 * substring
		 */
		while(bigInput.hasNext()) 
		{
			line = bigInput.nextLine();
			cityName = line.substring(((line.indexOf(' ') + 1)),((line.indexOf(',')) - 1));
			cityName.trim();
			rank = Integer.parseInt(line.substring(0, (line.indexOf(' '))));
			popNum = Integer.parseInt(line.substring((line.indexOf(',')) + 5));
			getScanner();
			
			/* finds each city name out of all the cities and stores the coordinates
			 * then comparing it to the biggest cities names. to determine color,
			 * then drawing the dot with an equation to find the radius
			*/
			while(input.hasNext())
			{
				cordLine = input.nextLine();
				xCordBig = Double.parseDouble(cordLine.substring(0,5));
				yCordBig = Double.parseDouble(cordLine.substring(6,12));
				cordCity = cordLine.substring((cordLine.indexOf(' ', 9)+ 1),(cordLine.indexOf(',') - 1));
				if(cordCity.equals(cityName))
				{
					if(rank <= 10)
						StdDraw.setPenColor(StdDraw.RED);
					else
						StdDraw.setPenColor(StdDraw.BLUE);
					StdDraw.filledCircle((yCordBig), xCordBig ,6 * (Math.sqrt(popNum)/18500));
				}
			}
		}
	}
}
