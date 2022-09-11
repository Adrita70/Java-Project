package classes;

import java.lang.*;

public class Appitizers extends FoodItem{
	
	private String size;
	private String fid;
	private String name;
	private int availableQuantity;
	private double price;
	
	public Appitizers(){
		
	}
	
	public Appitizers(String name, String size, String fid, int availableQuantity, double price){
		super();
		this.name = name;
		this.size = size;
		this.fid = fid;
		this.availableQuantity = availableQuantity;
		this.price = price;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setSize(String size){
		this.size = size;
	}
	public String getSize(){
		return size;
	}
	public void setFid(String fid){
		this.fid = fid;
	}
	public void setAvailableQuantity(int quantity){
		super.setAvailableQuantity(quantity);
		this.availableQuantity = quantity;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getFid(){
		return fid;
	}
	public int getAvailableQuantity(){
		return availableQuantity;
	}
	public double getPrice(){
		return price;
	}
	
	
	public void showInfo(){
		System.out.println("Appitizer's ID: " +fid);
		System.out.println("Available quantity of the food: " +availableQuantity);
		System.out.println("Food's price: " +price);
		System.out.println("Size of the appitizers: " +size);
		System.out.println();
	}
	
	
	
}