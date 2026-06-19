/*
 * Name: Juliana Bruno
 * Project: 2
 * Title: YouVeGoyShoes.java
 * Summary: uses user input and outputs information about shoes
 * Date: 11/30/24
 */
import java.util.Scanner;
public class YouVeGotShoes {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		Shoe shoe1 = new Shoe("Adidas", "Samba", 50, 12345, 40);		
		
		Shoe shoe2 = new Shoe("Reebok", "Club C", 100, 67890, 40);
		
		Shoe shoe3 = new Shoe("Skechers", "Jade", 40, 24689, 40);
		
		System.out.println("Please enter the manufacturer of the 4th shoe:");
		String manufacturer = keyboard.nextLine();
		
		System.out.println("Please enter the name of the 4th shoe:");
		String name = keyboard.nextLine();
		
		System.out.println("Please enter the price of the 4th shoe:");
		double price = keyboard.nextDouble();
		
		System.out.println("Please enter the SKU number of the 4th shoe:");
		int SKU = keyboard.nextInt();
		
		Shoe shoe4 = new Shoe(manufacturer, name, price, SKU);
		
		System.out.println();
		System.out.println("\n----------------------------");
		System.out.println("Shoe information before changes:");
		System.out.print(shoe1);
		System.out.println("\n----------------------------");
		System.out.print(shoe2);
		System.out.println("\n----------------------------");
		System.out.print(shoe3);
		System.out.println("\n----------------------------");
		System.out.print(shoe4);

		shoe4.like();
		shoe3.like(5);
		shoe2.like(-1);
		
		shoe1.setPrice(29.99);
		
		double price2 = shoe2.getPrice();
		shoe2.setPrice(price2 -(price2 * .2));
		
		double price3 = shoe3.getPrice();
		shoe3.setPrice(price3 -(price3 * .2));
		
		double price4 = shoe4.getPrice();
		shoe4.setPrice(price4 -(price4 * .2));
		
		System.out.println();
		System.out.println("\nShoe information after changes:");
		System.out.print(shoe1);
		System.out.println("\n----------------------------");
		System.out.print(shoe2);
		System.out.println("\n----------------------------");
		System.out.print(shoe3);
		System.out.println("\n----------------------------");
		System.out.print(shoe4);
		
		double price1 = shoe1.getPrice();
		
		double totalPrice = price1 + price2 + price3 + price4;
		System.out.println("\nTotal price of all 4 shoes: $" + totalPrice);
		
		int likes1 = shoe1.getLikes();
		int likes2 = shoe2.getLikes();
		int likes3 = shoe3.getLikes();
		int likes4 = shoe4.getLikes();

		double totalLikes = likes1 + likes2 + likes3 + likes4;
		double averageLikes = totalLikes/4;
		
		System.out.println("Average number of likes: " + averageLikes);
	
/* Output:
Please enter the manufacturer of the 4th shoe:
Puma
Please enter the name of the 4th shoe:
Speedcat OG
Please enter the price of the 4th shoe:
100
Please enter the SKU number of the 4th shoe:
13579


----------------------------
Shoe information before changes:
Manufacturer: Adidas
Name: Samba
Price: $50.0
SKU: 12345
Number of likes: 40
----------------------------
Manufacturer: Reebok
Name: Club C
Price: $100.0
SKU: 67890
Number of likes: 40
----------------------------
Manufacturer: Skechers
Name: Jade
Price: $40.0
SKU: 24689
Number of likes: 40
----------------------------
Manufacturer: Puma
Name: Speedcat OG
Price: $100.0
SKU: 13579
Number of likes: 0

Shoe information after changes:
Manufacturer: Adidas
Name: Samba
Price: $29.99
SKU: 12345
Number of likes: 40
----------------------------
Manufacturer: Reebok
Name: Club C
Price: $80.0
SKU: 67890
Number of likes: 39
----------------------------
Manufacturer: Skechers
Name: Jade
Price: $32.0
SKU: 24689
Number of likes: 45
----------------------------
Manufacturer: Puma
Name: Speedcat OG
Price: $80.0
SKU: 13579
Number of likes: 1
Total price of all 4 shoes: $269.99
Average number of likes: 31.25	
 */
	
	
	
	}

}
