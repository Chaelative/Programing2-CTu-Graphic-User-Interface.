import java.awt.*;
import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridBagLayout()); // Use GridBagLayout for better alignment

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add padding between components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Username label and text field
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        usernameField.setPreferredSize(new Dimension(150, 25)); // Set preferred size

        // Password label and password field
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(150, 25)); // Set preferred size

        // Submit button
        JButton submitButton = new JButton("Submit");

        // Result label
        JLabel resultLabel = new JLabel("Result: ");

        // Action Listener for the button
        submitButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            resultLabel.setText("Result: " + username); // Display username as result
        });

        // Add components to the frame with proper alignment
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(usernameLabel, gbc);

        gbc.gridx = 1;
        frame.add(usernameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(passwordLabel, gbc);

        gbc.gridx = 1;
        frame.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        frame.add(submitButton, gbc);

        gbc.gridy = 3;
        frame.add(resultLabel, gbc);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}