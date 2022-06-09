package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Resevation;
import model.exceptions.DomainExceptions;

public class program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
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
			
		}
		catch (ParseException e) {
			System.out.println("Invalid date format!");
		}
		catch (DomainExceptions e) {
			System.out.println("Error in reservation : " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected erro");
		}
		
	sc.close();

	}
	
}