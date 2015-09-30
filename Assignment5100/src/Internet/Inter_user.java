package Internet;

import java.util.Scanner;

public class Inter_user {

	public String user_name;
	protected String pwd;
	
	
	public boolean Login(Browser Brow){
		
		System.out.println("Please input your user name:");
		Scanner input = new Scanner(System.in);
		user_name = input.nextLine();
		System.out.println("Please input your pwd:");
		pwd = input.nextLine();
		
		Brow.Connect(user_name);
		System.out.println(Brow.Get_response());
		
		if(user_name == "Jian Hou" && pwd == "123456")
			return true;
		else
			return false;
	}
	
	public void Comment(Facebook_app facebook, Browser brow){
		Scanner scan = new Scanner(System.in);
		
		String comments = scan.nextLine();
		
		facebook.Receive(comments);
		
		facebook.Pushto();
		
		System.out.println(brow.Get_response());
		
	}
	
	
	public static void main(String[] args){
		
		Browser Brow1 = new Browser();
		Facebook_app Facebook = new Facebook_app();
		
		Inter_user Person = new Inter_user();
		
		if(Person.Login(Brow1)){
			Facebook.Validate(Person.user_name);
			Facebook.Retpost();
			System.out.println(Brow1.Get_response());
			
			Person.Comment(Facebook,Brow1);
		}
		
		
		
	}
	
}
