package classes;

import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperations{
	private String rid;
	private String name;
	FoodItem fooditems[];
	
	public Restaurant(){
		
		this.fooditems = new FoodItem[10];
	}
	
	public Restaurant(String rid, String name, int sizeOfArray){
		this.rid = rid;
		this.name = name;
		this.fooditems = new FoodItem[sizeOfArray];
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setRid(String rid){
		this.rid = rid;
	}
	public String getName(){
		return name;
	}
	public String getRid(){
		return rid;
	}
	
	public boolean insertFoodItem(FoodItem f){
		
		boolean flag = false;
		
		for(int i = 0; i<fooditems.length; i++){
			if(fooditems[i] == null){
				fooditems[i] = f;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeFoodItem(FoodItem f){
		
		boolean flag = false;
		
		for(int i = 0; i<fooditems.length; i++){
			if(fooditems[i] == f){
				fooditems[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public FoodItem searchFoodItem(String fid){
		
		FoodItem f = null;
		
		for(int i = 0; i<fooditems.length; i++){
			if(fooditems[i] != null){
				if(fooditems[i].getFid().equals(fid)){
					f = fooditems[i];
					break;
				}
			}
		}
		return f;
	}
	
	
	public void showAllFoodItems(){
		
		System.out.println("=====================================");
		System.out.println("Restaurent ID: " +rid);
		System.out.println("Restaurant name: " +name);
		
		for(int i = 0; i<fooditems.length; i++){
			if(fooditems[i] != null){
				System.out.println("=====================================");
				fooditems[i].showInfo();
				System.out.println();
			}
		}
		
	}
}