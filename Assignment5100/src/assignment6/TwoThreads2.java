package assignment6;

/** The second way to realize two threads problem */

/** Class counters is the basic abstract class that count number for print operation */
abstract class Counters{
	public static int count = 1;
	//set variable count to be static so that two threads only have one 'count'
	
	Counters() {}
	
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
	/** The abstract method of print */
	public abstract int printResult();
}

/** The child class of counters to print number */
class NumCounters extends Counters{
	int number;
	
	NumCounters(){
		this.number = 1;
	}
	
	/** Implement the printResult method */
	public int printResult() {
		if(super.checking()==0){
			System.out.print(" " + number++);
			super.increase();
			if(number>52)
				return 1;
			else
				return 0;
		}
		if(number>52)
			return 1;
		return -1;
	}
}

/** The child class of counters to print letter */
class LetterCounters extends Counters{
	Character letter;
	
	LetterCounters(){
		this.letter = 'A';
	}
	
	/** Implement the printResult method */
	public int printResult() {
		if(super.checking()==1){
			System.out.print(" " + (Character)letter++);
			super.increase();
			if(letter>'Z')
				return 1;
			else
				return 0;
		}
		if(letter>'Z')
			return 1;
		return -1;
	}
}


/** The thread to use Counters object */
public class TwoThreads2 extends Thread{	
	Counters oneThread;
	
	public TwoThreads2(Counters countThread) {
		oneThread = countThread;
	}
	
	public void run() {
		while(true){
			int result = oneThread.printResult();
			if(result > 0)
				return;
			else if(result == 0)
				;
			else
				continue;
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
	
	public static void main(String[] args) {
		
		TwoThreads2 numT = new TwoThreads2(new NumCounters());
		TwoThreads2 letterT = new TwoThreads2(new LetterCounters());
		
		numT.start();
		letterT.start();
		
	}

}
