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
		frame.setLayout(null);
		ImageIcon icon = new ImageIcon(Main.class.getResource("/images/freelance-removebg-preview.png"));
		JLabel label = new JLabel(icon);
		label.setBounds((width/2)-250,0, 500,300);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.add(label);
		JLabel label2=new JLabel("<html>"
				+"<div style='text-align: center;'>"
				+ "        FreelanceHub is a Java-based project built to explore how<br> freelance work can be"
				+ " organized and managed through software. It focuses on the<br> basics of handling clients,"
				+ "     projects, and tasks within a single system. The project was designed as a practical way to apply"
				+ "   object-oriented programming concepts along with database connectivity.<br> Rather than being a"
				+ "       commercial product, FreelanceHub serves as a learning project that demonstrates how programming"
				+ "      logic can be applied to real-world scenarios."
				+"</div>"
				+ "</html>");
		label2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        label2.setBounds((width/2)-300,200, 600, 400);
		frame.add(label2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
