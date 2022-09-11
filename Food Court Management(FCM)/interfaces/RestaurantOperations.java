package interfaces;

import java.lang.*;
import classes.*;

public interface RestaurantOperations{
	
	public boolean insertRestaurant(Restaurant r);
	public boolean removeRestaurant(Restaurant r);
	public Restaurant searchRestaurant(String rid);
	public void showAllRestaurants();
	
}