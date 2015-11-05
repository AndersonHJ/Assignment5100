package internet;

public class Browser {
	
	public String name;
	public String Url;
	
	public boolean Connect(String Url){
		System.out.println("connecting "+ Url);
		if(!Url.isEmpty()){
			System.out.println("connected");
			return true;
		}
		else{
			return false;
		}
	}
	
	public String Get_response(){
		
		String result  = "response has returned";
		
		return result;
	}
}
