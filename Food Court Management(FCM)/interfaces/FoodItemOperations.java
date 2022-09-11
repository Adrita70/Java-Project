package interfaces;

import java.lang.*;
import classes.*;

public interface FoodItemOperations{
	
	public boolean insertFoodItem(FoodItem f);
	public boolean removeFoodItem(FoodItem f);
	public FoodItem searchFoodItem(String fid);
	public void showAllFoodItems();
	
}