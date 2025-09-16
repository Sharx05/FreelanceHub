package Freelance;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FreelanceHub");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        frame.setSize(width, height);

        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        ImageIcon icon = new ImageIcon(Main.class.getResource("/images/freelance-removebg-preview.png"));
        JLabel label1 = new JLabel(icon);
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextPane text = new JTextPane();
        text.setContentType("text/html");
        text.setText("<html><div style='text-align:center;font-family:Times New Roman;font-size:34'>"
                + "<strong> FreelanceHub </strong> is a Java-based project built to explore how<br>"
                + "projects can be organized and managed through software.<br>"
                + "It focuses on basics of object-oriented programming concepts<br>"
                + "along with database connectivity.<br><br>"
                + "Though not a commercial product, <strong>FreelanceHub</strong> serves as a<br>"
                + "learning project that demonstrates how logic can be applied<br>"
                + "to real-world scenarios.<br><br>"
                + "</div></html>");
        text.setEditable(false);
        text.setBackground(Color.LIGHT_GRAY);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.LIGHT_GRAY);
        JButton button=new JButton("Login !!");
        JButton button2=new JButton("Register!!");
        button.setBackground(Color.CYAN);   
        button.setOpaque(true);             
        button.setBorderPainted(false);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(500, 50));
        button.setFont(new Font ("Times New Roman",Font.BOLD,20));
        button2.setMaximumSize(new Dimension(500, 50));
        button2.setFont(new Font ("Times New Roman",Font.BOLD,20));
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label1);
        panel.add(button);
        panel.add(Box.createVerticalStrut(20));
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
