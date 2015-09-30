
public class Remote {
	
	public int[] ButtonID = {0,1,2,3,4,5,6,7,8,9};
	public boolean Powerbutton;
	public int volume;
	
	public void Switch_on_off(Telivision TV, boolean order){
		if(order)
			TV.Turn_on_off(true);
		else
			TV.Turn_on_off(false);
	}
	
	public void Change_channel(int ButtonID1, int ButtonID2, int ButtonID3, Telivision TV){
		int statue = 1;
		long channel = (long)(ButtonID1*100+ButtonID2*10+ButtonID3);
		
		TV.Telecast(channel);
	}
	
	public void Mute_sound(boolean off){
		if(off){
			volume = 0;
			System.out.println("no sound");
		}
		else{
			volume = 10;
			System.out.println("volume is 10");
		}
	}
	
	
	
}
