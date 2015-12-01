package assignment7;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/** Read the file line by line */
public class ReadFile {
	File file;
	FileInputStream inputStr;
	InputStreamReader inputReader; 
	BufferedReader readBuffer;
	String result;//Store one line read from file
	ArrayList<String> storeBox;//String list to store the file string
	
	public ReadFile() throws FileNotFoundException {
		storeBox = new ArrayList<>();
	}
	
	/** 
	 * Reading the file and storing the lines as strings into the arraylist 
	 * 
	 * @param filePath the path of the file
	 * @return true if the file is read correctly, false if the file is not exist
	 * 
	 * */
	public boolean readTheFile(String filePath) throws IOException {
		if(filePath == null)
			return false;
		
		file = new File(filePath);
		inputStr = new FileInputStream(file);
		inputReader = new InputStreamReader(inputStr);
		readBuffer = new BufferedReader(inputReader);

		while((result = readBuffer.readLine()) != null){
			if(!result.isEmpty())
				storeBox.add(result);
		}
		return true;
	}
	
	/** Print the string stored in the arraylist reversely */
	public void printReadString(){
		for(int i = storeBox.size()-1; i>=0;i--)
			System.out.println(storeBox.get(i));
	}
	
	
	public static void main(String[] args) {

		try {
			ReadFile exec = new ReadFile();
			
			exec.readTheFile("D:\\yuandaima\\javawork\\git\\Assignment5100\\output.txt");
			
			exec.printReadString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
