package assignment6;


/** The object that our threads would access synchronized */
class OneLetter{
	Character ch;
	
	public OneLetter(Character name) {
		this.ch = name;
	}
	
}

/** The thread to print letter individually*/
class LetterThreads extends Thread{
	OneLetter name;//the letter object would be printed
	OneLetter next;//the letter object would be printed next
	
	LetterThreads(OneLetter letter, OneLetter next){
		this.name = letter;
		this.next = next;
	}
	
	public void run(){
		while(true){
			synchronized (name) {
				System.out.print(this.name.ch+" ");
				synchronized (next) {
					next.notify();//awake next thread print this letter object
				}
				try {
					name.wait();
					//this thread print this letter object would wait until some thread awake it
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try{
				sleep(100);
			}catch(Exception e){
				e.getMessage();
			}
		}
	}
}


public class FiveThreads {
	
	public static void main(String[] args) {
		
		OneLetter[] letters = {new OneLetter('A'), new OneLetter('B'),new OneLetter('C'), new OneLetter('D'),new OneLetter('E')};
		
		
		LetterThreads one = new LetterThreads(letters[0], letters[1]);
		LetterThreads two = new LetterThreads(letters[1], letters[2]);
		LetterThreads three = new LetterThreads(letters[2], letters[3]);
		LetterThreads four = new LetterThreads(letters[3], letters[4]);
		LetterThreads five = new LetterThreads(letters[4], letters[0]);
		
		//After each thread start, it will sleep for a while then start next thread
		try {
			one.start();
			one.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			two.start();
			two.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			three.start();
			three.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			four.start();
			four.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		five.start();
	}

}
