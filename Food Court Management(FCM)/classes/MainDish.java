package classes;

import java.lang.*;


public class MainDish extends FoodItem{
	
	private String category;
	private String fid;
	private String name;
	private int availableQuantity;
	private double price;
	
	public MainDish(){
		
	}
	public MainDish(String category, String fid, String name, int availableQuantity, double price){
		super();
		this.category = category;
		this.fid = fid;
		this.name = name;
		this.availableQuantity = availableQuantity;
		this.price = price;
	}
	
	
	public void setCategory(String category){
		this.category = category;
	}
	public String getCategory(){
		return category;
	}
	public void setFid(String fid){
		this.fid = fid;
	}
	public void setName(String name){
		this.name = name;
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
	public String getName(){
		return name;
	}
	public int getAvailableQuantity(){
		return availableQuantity;
	}
	public double getPrice(){
		return price;
	}
	
	public void showInfo(){
		System.out.println("Food ID: " +fid);
		System.out.println("Food name: " +name);
		System.out.println("Available quantity of the food: " +availableQuantity);
		System.out.println("Food's price BDT: " +price);
		System.out.println("Food category: " +category);
		System.out.println();
	}
}