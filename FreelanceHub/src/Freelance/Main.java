package Freelance;

import java.awt.*; 
import javax.swing.*; 
public class Main {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("FreelanceHub");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		frame.setSize(width,height);
		frame.setVisible(true);

	}

}
