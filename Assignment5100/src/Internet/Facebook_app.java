package Internet;

public class Facebook_app {
	public String[] usersID = new String[10000];
	
	public void Validate(String userI){
		System.out.println("user is valiable");
	}
	
	public String Retpost(){
		String post = "returning post...";
		
		return post;
	}
	
	public boolean Receive(String comments){
		comments = "hello world";
		if(!comments.isEmpty())
			return true;
		else
			return false;
	}
	
	public void Pushto(){
		System.out.println("pushed to others");
		
	}
	
}
