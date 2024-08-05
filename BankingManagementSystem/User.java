package BankingManagementSystem;
import java.util.*;

public class User {
	private Scanner scanner;
	
	public void register()
	{
		System.out.println("Enter Fullname: ");
		String fullname = scanner.nextLine();
		
		System.out.println("Enter Email: ");
		String email = scanner.nextLine();
		
		System.out.println("Enter Password: ");
		String password = scanner.nextLine();
	}
	public String login()
	{
		System.out.println("Enter Email: ");
		String email = scanner.nextLine();
		
		System.out.println("Enter Password: ");
		String password = scanner.nextLine();
		
		return null;
	}
	public boolean user_exist(String email) {
		
		return false;
	}
}
