import java.lang.*;
import java.util.*;
import classes.*;
import fileio.*;
import interfaces.*;

public class Start{
	
	public static void main(String[] args){
		FoodCourt f = new FoodCourt();
		FileReadWriteDemo rw = new FileReadWriteDemo();
		Scanner input = new Scanner(System.in);
		
		boolean Loop = true;
		
		System.out.println("=======================================================");
		System.out.println("WELCOME TO");
		System.out.println("FOOD COURT MANAGEMENT SYSTEM");
		System.out.println("=======================================================");
		System.out.println("\n");
		
		while(Loop){
			
			System.out.println("==================================================================================");
			System.out.println("What do you want to choose");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. Restaurant FoodItem Management");
			System.out.println("4. FoodItem Quantity Add-Sell");
			System.out.println("5. Exit");
			
			System.out.println("\n");
			System.out.print("Enter your choice: ");
			int ch = input.nextInt();
			
			System.out.println("==================================================================================");
			System.out.println("\n");
			
			
			switch(ch){
				
				case 1:{
					System.out.println("=======================================================");
					System.out.println("YOU HAVE CHOSEN EMPLOYEE MANAGEMENT");
					System.out.println("=======================================================");
					
					System.out.println("Choose options from below\n");
					
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove Existing Employee");
					System.out.println("3. Show All Employee");
					System.out.println("4. Search An Employee");
					System.out.println("5. Go Back");
					System.out.println("=======================================================");
					System.out.println("\n");
					
					System.out.print("Enter your choice: ");
					int ch1 = input.nextInt();
					
					switch(ch1){
						case 1:{
							System.out.println("=======================================================");
							System.out.println("YOU HAVE CHOSEN INSERT NEW EMPLOYEE");
							System.out.println("=======================================================");
							System.out.println();
							
							System.out.print("Enter Employee ID: ");
							String empId1 = input.next();
							System.out.print("Enter Employee Name: ");
							String name1a = input.nextLine();
							String name1 = input.nextLine();
							System.out.print("Enter Employee Salary: ");
							double salary1 = input.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpID(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							f.insertEmployee(e1);
						
							System.out.println();
							
							break;
							
						}
						
						case 2:{
							
							System.out.println("=======================================================");
							System.out.println("YOU HAVE CHOSEN REMOVE EXISTING EMPLOYEE");
							System.out.println("=======================================================");
							System.out.println();
							
							System.out.print("Enter Employee Id: ");
							String empId2 = input.next();
							
							Employee e2 = f.searchEmployee(empId2);
							
							if(e2 != null){
								if(f.removeEmployee(e2)){
									System.out.println("Employee ID: " +e2.getEmpId());
									System.out.println("Employee Successfully Removed...");
								}
								else{
									System.out.println("Something went wrong. Try again...");
								}
							}
							else{
								System.out.println("Something went wrong or no employee found. Try again...");
							}
							
							System.out.println();
							
							break;
						}
						
						case 3:{
							System.out.println("=======================================================");
							System.out.println("YOU HAVE CHOSEN SHOW ALL EMPLOYEES");
							System.out.println("=======================================================");
							System.out.println();
							
							f.showAllEmployees();
							
							break;
						}
						
						case 4:{
							System.out.println("=======================================================");
							System.out.println("YOU HAVE CHOSEN SEARCH AN EMPLOYEE");
							System.out.println("=======================================================");
							System.out.println();
							
							System.out.print("Enter Employee ID: ");
							String empId3 = input.next();
							
							Employee e3 = f.searchEmployee(empId3);
							
							if(e3 != null){
								System.out.println("Employee Found...");
								System.out.println("=======================================================");
								System.out.println("Employee Details");
								System.out.println("=======================================================");
								System.out.println("Employee ID: " +e3.getEmpId());
								System.out.println("Employee Name: " +e3.getName());
								System.out.println("Employee Salary: " +e3.getSalary());
							}
							else{
								System.out.println("Something went wrong or no employee found. Try again...");
							}
							
							System.out.println();
							break;
						}
						
						case 5:{
							System.out.println("=======================================================");
							System.out.println("Going back to the main menu...");
							System.out.println("=======================================================");
							System.out.println();
							break;
						}
						
						default:{
							System.out.println("=======================================================");
							System.out.println("Invalid Choice. Try again...");
							System.out.println("=======================================================");
							break;
						}
					}
					
					System.out.println();
					break;
				}
				
				case 2:{
					
					System.out.println("=======================================================");
					System.out.println("YOU HAVE CHOSEN RESTAURENT MANAGEMENT");
					System.out.println("=======================================================");
					
					System.out.println("=======================================================");
					System.out.println("Choose option from below\n");
					System.out.println("=======================================================");
					System.out.println("1. Insert New Restaurant");
					System.out.println("2. Remove Existing Restaurant");
					System.out.println("3. Show All Restaurants");
					System.out.println("4. Search a Restaurant");
					System.out.println("5. Go Back");
					System.out.println("=======================================================");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int ch2 = input.nextInt();
					
					switch(ch2){
						case 1:{
							
							System.out.println("=======================================================");
							System.out.println("YOU HAVE CHOSEN INSERT NEW RESTAURENT");
							System.out.println("=======================================================");
							System.out.println();
							
							System.out.print("Enter the restaurant ID: ");
							String rid1 = input.next();
							System.out.print("Enter the restaurant's name: ");
							String name2 = input.next();
							
							Restaurant r1 = new Restaurant();
							
							r1.setRid(rid1);
							r1.setName(name2);
							
							if(f.insertRestaurant(r1)){
								System.out.println("Restaurant Inserted...");
								System.out.println("Restaurant ID: " +r1.getRid());
							}
							else{
								System.out.println("Something went wrong. Try again...");
							}
							System.out.println();
							
							break;
						}
						
						case 2:{
							System.out.println("=======================================================");
							System.out.println("YOU HAVE CHOSEN REMOVE EXISTING RESTAURANT");
							System.out.println("=======================================================");
							System.out.println();
							
							System.out.print("Enter Restaurant Id: ");
							String rid2 = input.next();
							
							Restaurant r2 = f.searchRestaurant(rid2);
							
							if(rid2 != null){
								if(f.removeRestaurant(r2)){
									System.out.println("Restaurant ID: " +r2.getRid());
									System.out.println("Restaurant Successfully Removed...");
								}
								else{
									System.out.println("Something went wrong. Try again...");
								}
							}
							else{
								System.out.println("Something went wrong or no restaurant found. Try again...");
							}
							
							System.out.println();
							
							break;
						}
						
						case 3:{
							System.out.println("=======================================================");
							System.out.println("YOU HAVE CHOSEN SHOW ALL RESTAURANTS");
							System.out.println("=======================================================");
							System.out.println();
							
							f.showAllRestaurants();
							
							break;
						}
						
						case 4:{
							System.out.println("=======================================================");
							System.out.println("YOU HAVE CHOSEN SEARCH A RESTAURANT");
							System.out.println("=======================================================");
							System.out.println();
							
							System.out.print("Enter Restaurant ID: ");
							String rid3 = input.next();
							
							Restaurant r3 = f.searchRestaurant(rid3);
							
							if(r3 != null){
								System.out.println("Restaurant Found...");
								System.out.println("=======================================================");
								System.out.println("Restaurant Details");
								System.out.println("=======================================================");
								System.out.println("Restaurant ID: " +r3.getRid());
								System.out.println("Restaurant Name: " +r3.getName());
								
							}
							else{
								System.out.println("Something went wrong or no restaurant found. Try again...");
							}
							
							System.out.println();
							break;
						}
						
						case 5:{
							
							System.out.println("=======================================================");
							System.out.println("Going back to main menu...");
							System.out.println("=======================================================");
							System.out.println();
							
							break;
						}
						
						default:{
							
							System.out.println("=======================================================");
							System.out.println("Invalid Choice. Try Again...");
							System.out.println("=======================================================");
							System.out.println();
							break;
						}
					}
				}
				
				
				case 3:{
					
					System.out.println("=======================================================");
					System.out.println("YOU HAVE CHOSEN RESTAURANT FOODITEM MANAGEMENT");
					System.out.println("=======================================================");
					System.out.println();
					
					System.out.println("=======================================================");
					System.out.println("Choose option from below\n");
					System.out.println("=======================================================");
					System.out.println("1. Insert New Fooditem");
					System.out.println("2. Remove Existing Fooditem");
					System.out.println("3. Show All Fooditems");
					System.out.println("4. Search a Fooditem");
					System.out.println("5. Go Back");
					System.out.println("=======================================================");
					System.out.println();
					
					
					System.out.print("Enter your choice: ");
					int ch3 = input.nextInt();
					
					switch(ch3){
						
						case 1:{
							
							System.out.println("=======================================================");
							System.out.println("YOU HAVE CHOSEN INSERT NEW FOODITEM");
							System.out.println("=======================================================");
							System.out.println();
							
							System.out.println("There are two types of Fooditem");
							System.out.println("1. Appitizers");
							System.out.println("2. Main Dish");
							System.out.println("3. Go Back");
							
							System.out.print("Enter your choice: ");
							int Fitem = input.nextInt();
							
							FoodItem fi = null;
							
							if(Fitem == 1){
								System.out.println("YOU HAVE CHOSEN APPITIZERS");
								
								
								System.out.print("Enter Appitizer name: ");
								String apname = input.next();
								System.out.print("Enter the Size of the Appitizer: ");
								String aps = input.next();
								System.out.print("Enter the Appitizer's ID: ");
								String apid = input.next();
								System.out.print("Enter the quantity: ");
								int apQuantity = input.nextInt();
								System.out.print("Price of the Appitizer: ");
								double apPrice = input.nextDouble();
								
								Appitizers ap1 = new Appitizers();
								
								ap1.setFid(apname);
								ap1.setSize(aps);
								ap1.setFid(apid);
								ap1.setAvailableQuantity(apQuantity);
								ap1.setPrice(apPrice);
								
								
								fi = ap1;
							}
							
							else if(Fitem == 2){
								
								System.out.println("YOU HAVE CHOSEN MAIN DISH");
								
								System.out.print("Enter the ID of the dish: ");
								String mdid = input.next();
								System.out.print("Enter name of the dish: ");
								String mdname = input.next();
								System.out.print("Enter the category of the dish: ");
								String mdcat = input.next();
								System.out.print("Enter the quantity: ");
								int mdQuantity = input.nextInt();
								System.out.print("The price: ");
								double mdprice = input.nextDouble();
								
								MainDish mdish = new MainDish();
								
								mdish.setFid(mdid);
								mdish.setName(mdname);
								mdish.setCategory(mdcat);
								mdish.setAvailableQuantity(mdQuantity);
								mdish.setPrice(mdprice);
								
								fi = mdish;
							
							}
							
							else if(Fitem == 3){
								System.out.println("Going back....");
							}
							
							else{
								
								System.out.println("Invalid type......");
							}
							
							if(fi != null){
								
								try {
									System.out.print("Enter Restaurant ID: ");
									String rid4 = input.next();

									f.searchRestaurant(rid4).insertFoodItem(fi);
								}
								catch (NullPointerException insertRestFood){
									insertRestFood.printStackTrace();
									System.out.println("Opps! Restaurant ID Not Found. Try again...");
								}
							}
							
							System.out.println();
							break;
						}
						
						case 2:{
							
							try {

								System.out.println("=======================================================");
								System.out.println("YOU HAVE CHOSEN REMOVE EXISTING FOODITEM");
								System.out.println("=======================================================");

								System.out.print("Enter Restaurant ID: ");
								String rid5 = input.next();
								System.out.print("Enter Food Item Number: ");
								String foodItemNumber3 = input.next();

								
								Restaurant cc = f.searchRestaurant(rid5);
								FoodItem aa = cc.searchFoodItem(foodItemNumber3);

								if (aa == null) {
									System.out.println("Food Item ID Not Found!");
									break;
								}
								cc.removeFoodItem(aa);
							}
							catch (NullPointerException remove){
								remove.printStackTrace();
							}
							
							System.out.println();
							
							break;
						}
						
						case 3:{
							System.out.println("=======================================================");
							System.out.println("YOU HAVE CHOSEN SHOW ALL FOOD ITEM");
							System.out.println("=======================================================");
							System.out.println();
							
							System.out.print("Enter restaurant ID: ");
							String rid6 = input.next();
							
							f.searchRestaurant(rid6).showAllFoodItems();
						
							break;
							
						}
						
						case 4:{
							
							try {

								System.out.println("=======================================================");
								System.out.println("YOU HAVE CHOSEN SEARCH A FOOD ITEM");
								System.out.println("=======================================================");

								System.out.print("Enter Restaurant ID: ");
								String rid7 = input.next();
								System.out.print("Enter Food Item Number: ");
								String foodNumber = input.next();


								FoodItem foodSearchObj = f.searchRestaurant(rid7).searchFoodItem(foodNumber);

								if (foodSearchObj != null) {
									foodSearchObj.showInfo();
								}else{
									System.out.println("Food Item Not Found!");
								}
							} catch (NullPointerException searchFoodExp){
								searchFoodExp.printStackTrace();
								System.out.println("ID Not Found, Error. Try again...");
							}
							
						}
						case 5:{
							System.out.println("=======================================================");
							System.out.println("Going back...");
							System.out.println("=======================================================");
							System.out.println();
							
							break;
						}
						
						default:{
							System.out.println("=======================================================");
							System.out.println("Invalid choice...");
							System.out.println("=======================================================");
							break;
						}
						
					}
					
					System.out.println();
					break;
					
				}
				
				case 4:{
					System.out.println("=======================================================");
					System.out.println("YOU HAVE CHOSEN FOODITEM QUANTITY ADD-SELL");
					System.out.println("=======================================================");
					
					System.out.println("Choose your option from below\n");
					System.out.println("=======================================================");
					System.out.println("1. Add FoodItem");
					System.out.println("2. Sell FoodItem");
					System.out.println("3. Show Add Sell History");
					System.out.println("4. Go Back");
					System.out.println("=======================================================");
					System.out.println();
					
					System.out.print("Enter your choice: ");
					int ch4 = input.nextInt();
					
					switch(ch4){
						case 1:{
							
							System.out.println("=======================================================");
							System.out.println("YOU HAVE CHOSEN ADD FOODITEM");
							System.out.println("=======================================================");
							System.out.println();
							
							System.out.print("Enter the Restaurant ID: ");
							String resid1 = input.next();
							System.out.print("Enter the food ID: ");
							String fid = input.next();
							System.out.print("Add Quantity: ");
							int amount1 = input.nextInt();
							
							if(amount1>0){
								try{
									f.searchRestaurant(resid1).searchFoodItem(fid).addQuantity(amount1);
									rw.writeInFile("Quantity added :" +amount1+ " in Food Item ID: " +fid);
								}
								
								catch(NullPointerException fileioexp1){
									fileioexp1.printStackTrace();
								
									if(f.searchRestaurant(resid1) == null){
										System.out.println("Restaurant ID not found.");
									}
									else{
										System.out.println("Food Item not found...");
									}
								}
							}
							
							System.out.println();
							break;
						}
						
						case 2:{
							System.out.println("=======================================================");
							System.out.println("YOU HAVE CHOSEN SELL FOODITEM");
							System.out.println("=======================================================");
							System.out.println();
							
							System.out.print("Enter the restaurant ID: ");
							String rid8 = input.next();
							System.out.print("Enter food ID: ");
							String an2 = input.next();
							System.out.print("Enter Sell Quantity: ");
							int amount2 = input.nextInt();
							
							try{
								if(amount2>0 && amount2<=f.searchRestaurant(rid8).searchFoodItem(an2).getAvailableQuantity()){
									f.searchRestaurant(rid8).searchFoodItem(an2).sellQuantity(amount2);
									
									rw.writeInFile("Quantity sold: " +amount2);
								}
							}
							catch(NullPointerException fileioexp2){
								fileioexp2.printStackTrace();
								
								if(f.searchRestaurant(rid8) == null){
									System.out.println("Restaurant ID not found");
								}
								else{
									System.out.println("Food ID not found");
								}
							}
							
							System.out.println();
							break;
						}
						
						case 3:{
							
							System.out.println("=======================================================");
							System.out.println("YOU AHVE CHOSEN SHOW ADD SELL HISTORY");
							System.out.println("=======================================================");
							System.out.println();
							
							rw.readFromFile();
							
							System.out.println();
							
							break;
						}
						
						case 4:{
							System.out.println("=======================================================");
							System.out.println("Going back...");
							System.out.println("=======================================================");
							System.out.println();
							break;
						}
						
						default:{
							
							System.out.println("=======================================================");
							System.out.println("Invalid choice...");
							System.out.println("=======================================================");
							break;
						}
					}
					
					System.out.println();
					break;
				}
				
				case 5:{
					
					Loop = false;
					System.out.println("=======================================================");
					System.out.println("THANK YOU VERY MUCH");
					System.out.println("FOR USING FOODCOURT MANAGEMENT SYSTEM");
					System.out.println("=======================================================");
					System.out.println();
					
					break;
				}
				default:{
					System.out.println("=======================================================");
					System.out.println("Invalid Choice...");
					System.out.println("=======================================================");
					System.out.println();
					break;
				}
			}
		}
	}
}