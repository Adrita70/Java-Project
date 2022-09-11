package classes;

import java.lang.*;
import interfaces.*;


public abstract class FoodItem implements IQuantity{
	private String fid;
	private String name;
	private int availableQuantity;
	private double price;
	
	public FoodItem(){
		
	}
	
	public FoodItem(String fid, String name, int availableQuantity, double price){
		this.fid = fid;
		this.name = name;
		this.availableQuantity = availableQuantity;
		this.price = price;
	}
	
	public void setFid(String fid){
		this.fid = fid;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAvailableQuantity(int quantity){
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
	
	
	public boolean addQuantity(int amount){
		
		if(amount>=0){
			System.out.println("Previous Quantity: " +getAvailableQuantity());
			System.out.println("New Adding Quantity: " +amount);
			availableQuantity = availableQuantity + amount;
			System.out.println("New Total Quantity: " +availableQuantity);
			return true;
		}
		else{
			System.out.println("Error. Try Again...");
			return false;
		}
	
	}
	
	public boolean sellQuantity(int amount){
		
		if(amount>=0 && amount<=availableQuantity){
			System.out.println("Selling amount: " +amount);
			availableQuantity = availableQuantity - amount;
			System.out.println("Now available Quantity: " +availableQuantity);
			
			return true;
		}
		else{
			System.out.println("Error. Try Again...");
			return false;
		}
	}
	
	public abstract void showInfo();
	
}