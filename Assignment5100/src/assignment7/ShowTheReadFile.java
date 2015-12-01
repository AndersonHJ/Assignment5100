package assignment7;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** Show the string of the arraylist on the screen */
public class ShowTheReadFile extends JFrame{
	JButton button;//the button on the screen
	JTextField textShow;//the textarea on the screen
	ReadFile reader;//file reader
	int i;
	
	public ShowTheReadFile() throws IOException {
		create();
		add();
		addListeners();
		display();
	}

	/** create the component and filereader */
	private void create() throws FileNotFoundException {
		button = new JButton("Read a line");
		textShow = new JTextField(5);
		reader = new ReadFile();
		i = 0;
	}

	/** add the component to the screen and read the file */
	private void add() throws IOException {
		Container con = getContentPane();
		JPanel pcon = new JPanel();
		con.add(pcon, BorderLayout.CENTER);
		pcon.add(button);
		con.add(textShow, BorderLayout.NORTH);
		reader.readTheFile("D:\\yuandaima\\javawork\\git\\Assignment5100\\output.txt");
	}

	/** add the action listener */
	private void addListeners() {
		button.addActionListener(new ButtonActionListener());
	}

	/** the class for the click action */
	class ButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			textShow.setText(reader.storeBox.get(i++));
		}
		
	}

	/** display the screen */
	public void display() {
		setSize(900, 200);
		button.setPreferredSize(new Dimension(300, 30));
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		try {
			new ShowTheReadFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
