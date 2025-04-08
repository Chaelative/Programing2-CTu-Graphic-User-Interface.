import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckB {
    @SuppressWarnings("Convert2Lambda")
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("CheckBox Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Checkbox 1: Empty
        JCheckBox checkBox1 = new JCheckBox("");
        JButton button1 = new JButton("Button 1");

        // Checkbox 2: Boolean String
        JCheckBox checkBox2 = new JCheckBox("Option 1");
        JButton button2 = new JButton("Button 2");

        // Checkbox 3: String + Icon
        JCheckBox checkBox3 = new JCheckBox("Female", new ImageIcon("female_icon.png")); // replace with your icon path
        JButton button3 = new JButton("Button 3");

        // Action listeners for buttons
        button1.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Button 1 pressed");
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = checkBox2.isSelected() ? "Checkbox 2 is checked" : "Checkbox 2 is unchecked";
                JOptionPane.showMessageDialog(frame, message);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button 3 pressed");
            }
        });

        // Add components to frame
        frame.add(checkBox1);
        frame.add(button1);
        frame.add(checkBox2);
        frame.add(button2);
        frame.add(checkBox3);
        frame.add(button3);

        // Set frame visibility
        frame.setVisible(true);
    }
}