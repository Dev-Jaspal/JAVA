// A Java program to demonstrate use of Comparable
import java.io.*;
import java.util.*;

// A class 'Movie' that implements Comparable
class Moviee implements Comparable<Moviee>
{
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(Moviee m)
	{
		return this.year - m.year;
	}

	// Constructor
	public Moviee(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }
}

// Driver class
class ComparableDemo
{
	public static void main(String[] args)
	{
		ArrayList<Moviee> list = new ArrayList<Moviee>();
		list.add(new Moviee("Force Awakens", 8.3, 2015));
		list.add(new Moviee("Star Wars", 8.7, 1977));
		list.add(new Moviee("Empire Strikes Back", 8.8, 1980));
		list.add(new Moviee("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (Moviee movie: list)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
	}
}
