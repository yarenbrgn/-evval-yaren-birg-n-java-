package yrn;
import java.util.ArrayList;
import java.util.Scanner;
public class yaren {
	

	
	    public static void main(String[] args) {
	        System.out.println("");
	        ArrayList<String> list = new ArrayList<>();
	        ArrayList<String> list2 = new ArrayList<>();
	        ArrayList<String> list3 = new ArrayList<>();
	        
	        while (true) {
	            
	        

	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Please enter your email");
	        String email = scanner.nextLine();

	        System.out.print("Please enter your password");
	        String password = scanner.nextLine();

	        System.out.print("Please enter your address");
	        String address = scanner.nextLine();

	        System.out.println("Your email is " + email + "Your password is " + password + "Your address is " + address);

	        System.out.print("Please enter your adressname");
	        String addressname = scanner.nextLine();

	        System.out.print("Please enter your city");
	        String city = scanner.nextLine();

	        System.out.print("Please enter your town");
	        String town = scanner.nextLine();
	        
	        
	       
	        
	        list.add(email);
	        list.add(password);
	        list.add(address);
	        list2.add(addressname);
	        list2.add(city);
	        list2.add(town);
	        
	        list3.addAll(list);
	        list3.addAll(list2);
	        
	       
	        String i = "q";
	        while (true) {
	            System.out.println(i);
	            

	            if (i == "q") {
	                break;
	            }
	        }
 

	        System.out.println(list3);
	        

	    
	}
  }
}	   
