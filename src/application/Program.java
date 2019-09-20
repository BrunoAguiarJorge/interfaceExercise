package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program  {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		
		System.out.println("Enter Number: ");
		int number = sc.nextInt();
		
		Date date = sdf.parse(sc.nextLine());
		System.out.println("Return dd/MM/yyyy");
		
		System.out.println("Contract value: ");
		double contractValue = sc.nextDouble();
		System.out.println("");
		System.out.println("Enter number of installment");
		int inastallments = sc.nextInt();
		System.out.println("Installtments");
		System.out.println("25/07/2018");

		
		
		
	}

}
