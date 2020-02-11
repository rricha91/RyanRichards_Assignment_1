
/*
 * Program to take in wind speed and wind chill and 
 * read back the wind chill, aka the percived
 * wind temprature.
 */

import java.util.Scanner;
import java.lang.Math;
public class WindChill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please input wind temprature in Degrees F:"); 					// Print a request for wind temp.
		double windTemp=userInput.nextDouble(); 							  					// Declare wind temp. and initialize /w keyboard input
		System.out.println("You entered: " + windTemp + " degrees F.");						// Print back wind temp. to varify input.
			
		
		System.out.println("Please input wind speed in miles per hour:"); // Request wind speed.
		double windSpeed=userInput.nextDouble(); 							  					// declare wind speed and initialize /w keyboard input.
		
		System.out.println("You entered: " + windSpeed+ "ml/h.");	  	 					// Print back wind speed to varify input.
		windSpeed=Math.pow(windSpeed, 0.16); 												// Set windSpeed to variable used in equation.
				
		final double C=35.74; 									  		  					// Declare the constant now that it's needed.
		
		    // windChill = 35.75 + 0.6215(T) - 35.75(V^0.16) + 0.4275(T)(V^0.16)
		double windChill = C + 0.6215*windTemp - C*windSpeed + 0.4275*windTemp*windSpeed; 	// Declare and calculate wind chill.
		
		System.out.println("The calculated windChill is " + windChill+ " degrees F."); 		// Print the wind chill value.

		userInput.close(); 																	// Close userInput to keep program secure
		
		System.out.println("Programer: Ryan Richards");
	}
	
}


