
/**
 * @author Michael (Yang) Weng
 * 
 * Computer configuration problem:
 * Display the different features, parts, and prices of a desirable computer
 * for the average student, in a format that would attract potential users.
 * 
 * Then upgrade CPU, RAM, hard drive, audio card, video card, and speakers.
 * Create appropriate variables for new components, then read prices from user.
 * Calculate new total price, display new components, and output. 
 * 
 * Pseudocode:
 * 
 * 1. Display part names and prices of computer
 * 2. Display part names for recommended upgrades
 * 3. Ask user to type in prices for each upgrade part
 * 4. Display part names / prices and total price of upgraded computer
 */

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// Display parts and prices for student computer
		System.out.println("Hey there! Let's take a look at your current computer.\n");
		System.out.println("Model: Alienware X51 Desktop\n");
		
		// All are based on Newegg.com prices
		String cpu = "Intel Core i3-3250";
		double cpuPrice = 149.99;
		String ram = "Corsair XMS 8GB";
		double ramPrice = 79.99;
		String hddrive = "Western Digital 750GB";
		double hddrivePrice = 120.31;
		String audiocard = "Onboard Audio";
		double audiocardPrice = 0.00;
		String gpu = "AMD Radeon HD 7750";
		double gpuPrice = 99.99;
		String speakers = "Logitech X-140 Speakers";
		double speakersPrice = 29.99;
		double total = cpuPrice + ramPrice + hddrivePrice + audiocardPrice + gpuPrice + speakersPrice;
		
		// printf() formats the components and prices into readable columns
		System.out.printf("%-25s %-25s %-25s\n", "Component", "Component Type", "Price");
		System.out.printf("%-25s %-25s $%-25.2f\n", cpu, "CPU", cpuPrice);
		System.out.printf("%-25s %-25s $%-25.2f\n", ram, "RAM", ramPrice);
		System.out.printf("%-25s %-25s $%-25.2f\n", hddrive, "Hard Drive", hddrivePrice);
		System.out.printf("%-25s %-25s $%-25.2f\n", audiocard, "Audio Card", audiocardPrice);
		System.out.printf("%-25s %-25s $%-25.2f\n", gpu, "Video Card", gpuPrice);
		System.out.printf("%-25s %-25s $%-25.2f\n\n", speakers, "Speakers", speakersPrice);
		System.out.printf("Your current computer costs: $%.2f\n", total);
		
		System.out.println("\nNot bad. Let's upgrade your computer a little bit. Here are some upgrades that I recommend.\n"
				+ "You can enter the current market prices yourself:\n");
		
		// set new part names for recommended upgrades; prices are from Newegg.com / Amazon.com
		String cpuNew = "Intel Core i7-4770K"; // $339.99
		String ramNew = "G.Skill Ripjaws Z 32GB"; // $314.99
		String hddriveNew = "Samsung 840 EVO 1TB"; // $599.99
		String audiocardNew = "Creative Sound Blaster Zx"; // $119.99
		String gpuNew = "AMD Radeon R9 290X"; // $649.99
		String speakersNew = "Logitech z-5500 Speakers"; // $749.99
		
		// ask user for market prices on recommended parts
		Scanner input = new Scanner(System.in);
		System.out.printf("Price for %s: ", cpuNew);
		double cpuPriceNew = input.nextDouble();
		System.out.printf("Price for %s: ", ramNew);
		double ramPriceNew = input.nextDouble();
		System.out.printf("Price for %s: ", hddriveNew);
		double hddrivePriceNew = input.nextDouble();
		System.out.printf("Price for %s: ", audiocardNew);
		double audiocardPriceNew = input.nextDouble();
		System.out.printf("Price for %s: ", gpuNew);
		double gpuPriceNew = input.nextDouble();
		System.out.printf("Price for %s: ", speakersNew);
		double speakersPriceNew = input.nextDouble();
		double totalNew = cpuPriceNew + ramPriceNew + hddrivePriceNew + audiocardPriceNew + gpuPriceNew + speakersPriceNew;
		input.close();
		
		// display new part names and prices, and calculate the total costs for upgraded PC
		System.out.printf("\n%-27s %-25s %-25s\n", "Upgraded Component", "Component Type", "Price");
		System.out.printf("%-27s %-25s $%-25.2f\n", cpuNew, "CPU", cpuPriceNew);
		System.out.printf("%-27s %-25s $%-25.2f\n", ramNew, "RAM", ramPriceNew);
		System.out.printf("%-27s %-25s $%-25.2f\n", hddriveNew, "Hard Drive", hddrivePriceNew);
		System.out.printf("%-27s %-25s $%-25.2f\n", audiocardNew, "Audio Card", audiocardPriceNew);
		System.out.printf("%-27s %-25s $%-25.2f\n", gpuNew, "Video Card", gpuPriceNew);
		System.out.printf("%-27s %-25s $%-25.2f\n", speakersNew, "Speakers", speakersPriceNew);
		System.out.printf("\nYour newer, beast computer costs $%,.2f and rocks the socks off "
				+ "of your old one. We should name it \"Godzilla\".\n", totalNew);
		
	}

}
