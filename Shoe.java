/*
 * Name: Juliana Bruno
 * Project: 2
 * Title: Shoe.java
 * Summary: declares variables and constructors for shoes 
 * Date: 11/30/24
 */
public class Shoe {

	//instance variables
	private String manufacturer;
	private String name;
	private double price;
	private int SKU;
	private int numOfLikes;
	
	//constructors
	//default constructor
	public Shoe() {
		manufacturer = "";
		name = "";
		price = 0;
		SKU = 0;
		numOfLikes = 0;
	}
	
	//overloaded constructors
	public Shoe(String m, String n, double p, int s, int nu) {
		manufacturer = m;
		name = n;
		price = p;
		SKU = s;
		numOfLikes = nu;
	}
	
	public Shoe(String m, String n, double p, int s) {
		manufacturer = m;
		name = n;
		price = p;
		SKU = s;
		numOfLikes = 0;
	}
	
	//toString()
	public String toString() {
		String x = "Manufacturer: " + manufacturer + "\nName: " + name + "\nPrice: $" + price + "\nSKU: " + SKU + "\nNumber of likes: " + numOfLikes;
		return x;
	}
	
	//accessor and mutator methods
	public void setPrice(double p) {
		price = p;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getLikes() {
		return numOfLikes;
	}
	
	//like method
	public void like() {
		numOfLikes = numOfLikes + 1;
	}
	
	public void like(int nu) {
		numOfLikes = numOfLikes + nu;
	}
	
	
}
