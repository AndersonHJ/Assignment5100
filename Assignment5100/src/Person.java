
public class Person {
	
	public static void main(String[] args){
		
		Telivision tv1 = new Telivision();
		Remote Re1 = new Remote();
		
		Re1.Switch_on_off(tv1, true);
		Re1.Change_channel(0, 6, 5, tv1);

		
	}
}
