package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Resevation;

public class program {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.print("Room number :");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Resevation reservation = new Resevation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			sc.close();
		}
		catch (ParseException e) {
			System.out.println("Invalid date format!");
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error in reservation : " + e.getMessage());
		}
		

	}
	
}