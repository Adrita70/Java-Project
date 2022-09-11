package classes;


import java.lang.*;
import interfaces.*;


public class FoodCourt implements EmployeeOperations, RestaurantOperations{
	
	Restaurant restaurents[] = new Restaurant[50000];
	Employee employees[] = new Employee[50000];
	
	
	//EmployeeOperations
	
	public boolean insertEmployee(Employee e){
		
		boolean flag = false;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null){
				if(employees[i].getEmpId().equals(e.getEmpId())){
					System.out.println("This ID already exists. Try another ID.");
					break;
				}
			}
			
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = true;
				break;
			}
		}
		if(flag == true){
			System.out.println("Employee inserted...");
		}
		else{
			System.out.println("Empployee cannot be inserted...");
		}
		return flag;
	}
	
	public boolean removeEmployee(Employee e){
		
		boolean flag = false;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = true;
				break;
			}
		}
		if(flag == true){
			System.out.println("Employee removed");
		}
		else{
			System.out.println("Employee cannot be removed or ID does not exist. Try again...");
		}
		return flag;
	}
	
	public Employee searchEmployee(String empId){
		
		Employee e = null;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
	public void showAllEmployees(){
		System.out.println("=================================================");
				
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				System.out.println("=================================");
				System.out.println("Employee ID: " + employees[i].getEmpId());
				System.out.println("Employee Name: " + employees[i].getName());
				System.out.println("Employee Salary: " + employees[i].getSalary());
				System.out.println();
			}
		}
	}
	
	
	
	//RestaurantOperations
	
	
	public boolean insertRestaurant(Restaurant r){
		boolean flag = false;
		
		for(int i=0; i<restaurents.length; i++)
		{
			
			if(restaurents[i] != null){
				if(restaurents[i].getRid().equals(r.getRid())){
					System.out.println("The restaurent ID already exists");
					break;
				}
			}
			
			if(restaurents[i] == null)
			{
				restaurents[i] = r;
				flag = true;
				break;
			}
		}
		
		if(flag == true){
			System.out.println("Restaurant successfully inserted...");
		}
		else{
			System.out.println("Restaurant already exists. Try again...");
		}
		return flag;
	}
	
	public boolean removeRestaurant(Restaurant r){
		boolean flag = false;
		
		for(int i=0; i<restaurents.length; i++)
		{
			if(restaurents[i] == r)
			{
				restaurents[i] = null;
				flag = true;
				break;
			}
		}
		if(flag == true){
			System.out.println("Restaurant removed...");
		}
		else{
			System.out.println("Restaurant cannot be removed. Try again...");
		}
		return flag;
	}
	
	public Restaurant searchRestaurant(String rid){
		Restaurant r = null;
		for(int i=0; i<restaurents.length; i++)
		{
			if(restaurents[i] != null)
			{
				if(restaurents[i].getRid().equals(rid))
				{
					r = restaurents[i];
					break;
				}
			}
		}
		return r;
	}
	
	public void showAllRestaurants(){
		System.out.println("=================================================");
				
		for(int i=0; i<restaurents.length; i++)
		{
			if(restaurents[i] != null)
			{
				System.out.println("=================================");
				System.out.println("Restaurant ID: " + restaurents[i].getRid());
				System.out.println("Restaurant Name: " + restaurents[i].getName());
				
			}
		}
	}
}