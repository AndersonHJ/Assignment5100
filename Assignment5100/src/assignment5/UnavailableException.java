package assignment5;


/**
 *  Thrown when a String is illegal. These include:
 *  -An array has unavailable character. 
 *  -The length of String is odd.
 *  -The String is empty.
 *  */
public class UnavailableException extends Exception {
	
	String mes;
	
	public UnavailableException(String type) {
		if(type == "Uneven")
			mes = "The string's length should be even"; 
		else if(type == "Unvalid character")
			mes = "The string contains unavailable characters, the character must be '('')''['']''{''}'";
		else if(type == "Empty string")
			mes = "The string should be unempty";
		else
			mes = "Unvalid exception type";
	}
	
	@Override 
	public String getMessage() {
		return mes;
	}
}
