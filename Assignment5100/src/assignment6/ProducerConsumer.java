package assignment6;

import java.util.LinkedList;

/** Class of product list, this is the product would be produced and consumed */
class Product{
	LinkedList<Integer> products;
	int numberOfProducts;//the max number of product could stored
	
	public Product(int length) {
		this.products = new LinkedList<Integer>();
		numberOfProducts = length;
	}
	
	/** The method of producing a product */
	public void produce() {		
		products.add(100);
		System.out.println("Produce a product: size of product-->" + products.size());
	}
	
	/** The method of consuming a product */
	public void consume(String name) {
		products.poll();
		System.out.println(name + " Consume a product: size of product-->" + products.size());

	}
	
	public int getSize(){
		return products.size();
	}
}

/** Thread of producer */
class Producer extends Thread{
	Product products;
	
	public Producer(Product products) {
		this.products = products;
		this.start();
	}
	
	public void run(){
		while(true){
			synchronized (products) {
				if (products.getSize() <= products.numberOfProducts - 1) {
				//if the store is not full, produce a product	
					products.produce();
					if(products.getSize()==1)//Once the store is not empty, notify all the thread
						products.notifyAll();
				} 
				else if (products.getSize() > products.numberOfProducts - 1) {
					try {
						System.out.println("Product list is full");
						sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}	
			}
			try {
				sleep(4);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/** Thread of consumer */
class Consumer extends Thread{
	Product products;
	String name;
	
	public Consumer(Product products) {
		this.products = products;
		this.name = super.getName();
		this.start();
	}
	
	public void run() {
		while(true){
			synchronized (products) {
				if (products.getSize() > 0) {//if store is not empty, consume a product
					products.consume(this.name);
				} else {
					try {
						System.out.println(this.name + " said that product list is empty");
						products.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ProducerConsumer {

	public static void main(String[] args) {
		Product prodt = new Product(7);
		
		Producer producer = new Producer(prodt);
		Consumer consumer = new Consumer(prodt);
		Consumer consumer2 = new Consumer(prodt);
		Consumer consumer3 = new Consumer(prodt);
	}

}
