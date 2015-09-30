import java.util.*;

public class Telivision {

	public String name;
	public long Channels;
	private final boolean TURN_ON = true;
	private final boolean TURN_OFF = false;
	
	public void Turn_on_off(boolean command){
		if(command)
			System.out.println("TV is on...");
		else
			System.out.println("TV is off...");
	}
	
	public void Telecast(long channel){
		System.out.println("Displaying..."+ channel);
	}
}

