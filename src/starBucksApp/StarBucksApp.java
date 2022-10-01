package starBucksApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StarBucksApp {

	//make an arraylist to hold our starbucks records
	public static ArrayList<StarBucks> starbucks = new ArrayList<StarBucks>();

	public static void main(String args[])  {

		readInTheData("StarbucksInCalifornia.csv");

		//System.out.println(starbucks);
		for(StarBucks store: starbucks)
			System.out.println(store);

	}

	//call this method to load our arraylist our data structure
	static void readInTheData(String fileName) {
		//read in our data
		//create an object for each record and put that object in the arraylist
		Scanner input = null;
		try {
			input = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("file now found");
			e.printStackTrace();
		}
		//read in the field names - header on the text file
		//so we can skip it
		input.nextLine();

		while(input.hasNextLine()) {

			starbucks.add(new StarBucks(input.nextLine()));

		}//end while
	}


	
	

}
