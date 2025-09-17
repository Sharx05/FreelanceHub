package Freelance;
import java.util.*;
import java.awt.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FreelanceHub");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        frame.setSize(width, height);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        ImageIcon icon = new ImageIcon(Main.class.getResource("/images/freelance2-Photoroom.png"));
        JLabel label1 = new JLabel(icon);
        label1.setBackground(Color.LIGHT_GRAY);
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        label1.setSize(200,200);

        JTextPane text = new JTextPane();
        text.setContentType("text/html");
        text.setText("<html><div style='text-align:center;font-family:Times New Roman;font-size:24'>"
                + "<strong> FreelanceHub </strong> is a Java-based project built to explore how"
                + "projects can be organized and managed through software.<br>"
                + "It focuses on basics of object-oriented programming concepts"
                + "along with database connectivity.<br><br>"
                + "Though not a commercial product, <strong>FreelanceHub</strong> serves as a<br>"
                + "learning project that demonstrates how logic can be applied<br>"
                + "to real-world scenarios."
                + "</div></html>");
        text.setEditable(false);
        text.setBackground(Color.LIGHT_GRAY);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.LIGHT_GRAY);
        JButton button=new JButton("Login !!");
        JButton button2=new JButton("Register!!");
        button.setBackground(Color.CYAN);   
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(500, 50));
        button.setFont(new Font ("Times New Roman",Font.BOLD,20));
        button2.setMaximumSize(new Dimension(500, 50));
        button2.setFont(new Font ("Times New Roman",Font.BOLD,20));
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createVerticalStrut(5));
        panel.add(label1);  
        panel.add(Box.createVerticalStrut(20));
        panel.add(button);
        panel.add(Box.createVerticalStrut(10));
        panel.add(button2);
        panel.add(text);
        
        

        JScrollPane scroll = new JScrollPane(panel);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        frame.add(scroll);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
