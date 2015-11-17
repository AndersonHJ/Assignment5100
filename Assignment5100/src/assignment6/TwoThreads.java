package assignment6;

/** The first way to realize two threads problem */

/** The counter that two thread would access synchronized */
class Counter{
	int count;
	
	public Counter(){
		count = 1;
	}
	/** Increase the count number */
	public void increase(){
		synchronized (this) {
			count++;
		}
	}
	/** Checking the count to determine if the thread should print*/
	public int checking() {
		synchronized (this) {
			if(count%3==0)
				return 1;
			else
				return 0;
		}
	}
}

/** The thread to print the number */
class NumberThread extends Thread{
	int number;
	Counter numCounter;
	
	public NumberThread(Counter counter) {
		this.number = 1;
		numCounter = counter;
		this.start();
	}
	
	public void run(){
		while(true){
			if(numCounter.checking()==0){//if result of checking is 0, number thread can print
				System.out.print(" " + number++);
				numCounter.increase();
			}
			if(number>52)
				return;
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

/** The thread to print the letter */
class LetterThread extends Thread{
	Character letter;
	Counter letterCounter;
	
	public LetterThread(Counter counter) {
		this.letter = 'A';
		letterCounter = counter;
		this.start();
	}
	
	public void run(){
		while(true){
			if(letterCounter.checking()==1){//if result of checking is 1, letter thread can print
				System.out.print(" " + letter++);
				letterCounter.increase();
			}
			if(letter>'Z')
				return;
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class TwoThreads {
	
	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		NumberThread num = new NumberThread(counter);
		LetterThread letter = new LetterThread(counter);
		
	}
	
}
