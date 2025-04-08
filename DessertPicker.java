import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DessertPicker extends JFrame {

    public DessertPicker() {
        setTitle("Dessert Picker");
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Add Question Label
        JLabel questionLabel = new JLabel("WHAT IS YOUR FAVORITE DESSERT?", JLabel.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        questionLabel.setForeground(new Color(0, 102, 204)); // Blue color
        add(questionLabel, BorderLayout.NORTH);

        // Buttons Panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
        String[] desserts = {"neither", "ice cream", "pie", "cake"};
        for (String dessert : desserts) {
            JButton button = new JButton(dessert);
            button.setFont(new Font("Arial", Font.BOLD, 14));
            button.setBackground(new Color(173, 216, 230)); // Light blue
            button.setForeground(Color.BLACK);
            button.addActionListener(new DessertButtonListener(dessert));
            buttonPanel.add(button);
        }
        add(buttonPanel, BorderLayout.CENTER);
    }

    private class DessertButtonListener implements ActionListener {
        private final String dessert;

        public DessertButtonListener(String dessert) {
            this.dessert = dessert;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if ("neither".equals(dessert)) {
                String input = JOptionPane.showInputDialog(
                    DessertPicker.this,
                    "Tell us What's your favorite dessert :>",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
                );
                if (input != null && !input.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        DessertPicker.this,
                        "Oh, your favorite dessert is " + input + "!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
            } else {
                JOptionPane.showMessageDialog(
                    DessertPicker.this,
                    "Your Favorite Dessert is " + dessert.substring(0, 1).toUpperCase() + dessert.substring(1) + "!",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DessertPicker dessertPicker = new DessertPicker();
            dessertPicker.setVisible(true);
        });
    }
}
