//Methods Class File : VideoMethods.java

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class VideoMethods {
	List<Video> MovieList = new ArrayList<Video>();

	public void AddMovies() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the name of the movie:");
		String mName = in.nextLine();
		System.out.print("Enter the status of the movie(True/False):");
		boolean status = in.nextBoolean();
		System.out.print("Enter the ratings for the movie(0-5):");
		double rating = in.nextDouble();
		Video v = new Video(mName, status, rating);
		MovieList.add(v);
		System.out.println("Library Initialized");
	}

	public void DisplayAll() {
		if (MovieList.isEmpty()) {
			System.out.println("No movies in the library");
		}
		for (Video m : MovieList) {
			System.out.println(
					"Movie : " + m.getmName() + "  " + "Status : " + m.isStatus() + "  " + "Rating " + m.getRating());
		}
	}

	boolean RentOut(String name) {
		for (Video m : MovieList) {
			if (m.getmName().equalsIgnoreCase(name)) {
				if (m.isStatus()) {
					m.setStatus(false);
					return true;
				}
			}
			return false;
		}
		return false;
	}

	public void CollectIn(String name, double rat) {
		boolean flag = false;
		for (Video m : MovieList) {
			if (m.getmName().equalsIgnoreCase(name)) {
				m.setStatus(true);
				flag = true;
				Math.round(m.setRating((m.getRating() + rat) / 2));
			}
		}
		if (!flag) {
			System.out.println("Requested Movie not rented out");
		}
	}
}
