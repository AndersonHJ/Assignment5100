package assignment5;

import java.util.Arrays;


/** 
 * The hashMap designed with array
 *  */
public class MyHashMap<K, V> {

	private Object[] keySet = null;
	private Object[] valueSet = null;
	private int size;
	
	/** Constructer of class MyHashMap */
	public MyHashMap() {
		this.size = 0;
		keySet = new Object[size];
		valueSet = new Object[size];
	}
	
	/** 
	 * Constructer of class MyHashMap
	 * 
	 * @param size the size of hashMap
	 *  */
	public MyHashMap(int size) {
		if(size < 0)
			throw new IllegalArgumentException();
		this.size = 0;
		keySet = new Object[size];
		valueSet = new Object[size];
	}
	
	/** Get the size of this hashMap */
	public int size(){
		return this.size;
	}
	
	/** 
	 * Get the value of specified key
	 * 
	 * @param key the key would be searched in the map
	 * @return value of this key if find the key-value, null if not find the value
	 *  */
	public V getValue(Object key){
		if(key == null)
			throw new NullPointerException();
		if(size == 0)
			throw new ArrayIndexOutOfBoundsException();
		
		int i = 0;
		for(i = 0; i<this.size; i++)
			if(keySet[i].equals(key) || key.hashCode() == keySet[i].hashCode())
				break;
		
		if(i == this.size)
			return null;
		else
			return (V)valueSet[i];
	}
	
	/** 
	 * Judging if map contains the key
	 * 
	 * @param key the key would be searched in the map
	 * @return true if find the key, false if not
	 *  */
	public boolean containsKey(Object key) {
		if(key == null)
			throw new NullPointerException();
		if(size == 0)
			throw new ArrayIndexOutOfBoundsException();
		
		int i = 0;
		for(i = 0; i<this.size; i++)
			if(keySet[i].equals(key) || key.hashCode() == keySet[i].hashCode())
				break;
		
		if(i == this.size)
			return false;
		else
			return true;
	}
	
	/** 
	 * Judging if map contains the value
	 * 
	 * @param value the value would be searched in the map
	 * @return true if find the value, false if not
	 *  */
	public boolean containsValue(Object value) {
		if(value == null)
			throw new NullPointerException();
		if(size == 0)
			throw new ArrayIndexOutOfBoundsException();
		
		int i = 0;
		for(i = 0; i<this.size; i++)
			if(valueSet[i].equals(value) || value.hashCode() == valueSet[i].hashCode())
				break;
		
		if(i == this.size)
			return false;
		else
			return true;
	}
	
	/** 
	 * Add the key-value onto the map, if the key has exist, 
	 * the new value will replace the old value
	 * 
	 * @param key the key would be appended in the map
	 * @param value the value would be appended in the map
	 * @return value of key associated with this key-value
	 *  */
	public V put(Object key, Object value){
		if(key == null)
			throw new NullPointerException();
		
		for(int i = 0; i<this.size; i++)
			if(keySet[i].equals(key) || key.hashCode() == keySet[i].hashCode()){
				valueSet[i] = value;
				return (V)value;
			}
		
		size++;
        keySet = Arrays.copyOf(keySet, size);
        keySet[size-1] = key;
        valueSet = Arrays.copyOf(valueSet, size);
        valueSet[size-1] = value;
        return (V)value;
	}
	
	/** 
	 * Remove the key-value of the map
	 * 
	 * @param key the key would be appended in the map
	 * @return value of this new key, null if the key is not exist in the map
	 *  */
	public V remove(Object key){
		if(key == null)
			throw new NullPointerException();
		if(size == 0)
			throw new ArrayIndexOutOfBoundsException();
		
		int oldSize = this.size;
		int i = 0;
		for(; i<this.size; i++)
			if(keySet[i].equals(key) || key.hashCode() == keySet[i].hashCode()){
				size--;
				for(int l = i; l<oldSize; l++){
					keySet[i] = keySet[i+1];
					valueSet[i] = valueSet[i+1];
				}
				System.arraycopy(keySet, 0, keySet, 0, size);
				System.arraycopy(valueSet, 0, valueSet, 0, size);
				break;
			}
		
		if(i == oldSize)
			return null;
		else
			return (V)valueSet[i];
	}
	
}
