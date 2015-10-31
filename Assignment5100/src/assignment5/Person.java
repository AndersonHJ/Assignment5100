package assignment5;


/** A person who could be compared */
public class Person implements Comparable {
	
	private String firstName;
	private String lastName;
	
	/** Constructer of class Person
	 *  
	 *  @param firstName Person's firstname
	 *  @param lastName Person's lastname
	 * */
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/** Get the first name of person*/
	public String getFirstName() {
		return firstName;
	}

	/** Set the first name of person
	 * 
	 * @param firstName the person's first name would be set
	 * */
	public void setFirstName(String firstName) {
		if(firstName == null)
			throw new NullPointerException();
		this.firstName = firstName;
	}

	/** Get the last name of person*/
	public String getLastName() {
		return lastName;
	}

	/** Set the last name of person
	 * 
	 * @param lastName the person's last name would be set
	 * */
	public void setLastName(String lastName) {
		if(lastName == null)
			throw new NullPointerException();
		this.lastName = lastName;
	}

	@Override
	public int compareTo(Object o) {
		if(o == null)
			throw new NullPointerException();
		Person P = (Person) o;
		if(this.firstName.compareTo(P.getFirstName())==0)
			return this.lastName.compareTo(P.getLastName());
		else
			return this.firstName.compareTo(P.getFirstName());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj == this)
			return true;
		Person P = (Person) obj;
		return (this.firstName.equals(P.getFirstName()) && this.lastName.equals(P.getLastName()));
	}

	/** 
	 *  Returns a hash code value for the object. 
	 *  This integer value would be distinct if the object is distinct
	 *  */
	@Override
	public int hashCode() {
		int hashNumber = 1; //using a prime number to avoid conflict of hash computing
		//Accroding to the s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		hashNumber = 31 * hashNumber + (this.firstName == null? 0: this.firstName.hashCode());
		hashNumber = 31 * hashNumber + (this.lastName == null? 0: this.lastName.hashCode());
		return hashNumber;
	}

	@Override
	public String toString() {
		
		return "first name : " + this.firstName+ "\tlast name : " + this.lastName;
	}
	
}
