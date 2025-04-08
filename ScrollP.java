import java.awt.*;
import javax.swing.*;

public class ScrollP {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("JScrollPane Exercise");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to populate with lines
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add components to the panel
        panel.add(new JLabel("Scroll DOWN to see how the number 3 went out."));
        panel.add(new JLabel("START"));
        panel.add(Box.createVerticalStrut(10)); // Add space

        // Adding multiple lines with number 3
        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0) {
                panel.add(new JLabel("I " + (i % 3 == 0 ? "3" : " ") + " _______________________________"));
            } else {
                panel.add(new JLabel("| _______________________________"));
            }
        }

        panel.add(Box.createVerticalStrut(10)); // Add space
        panel.add(new JLabel("END"));

        // Create a JScrollPane and add the panel to it
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setPreferredSize(new Dimension(300, 300)); // Set preferred size of scroll pane

        // Add the scroll pane to the frame
        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true); // Make the frame visible
    }
}