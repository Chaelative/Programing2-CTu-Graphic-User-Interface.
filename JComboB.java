import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JComboB extends JFrame {
    
    // Components
    private final JComboBox<String> monthComboBox;
    private final JComboBox<Integer> dayComboBox;
    private final JComboBox<Integer> yearComboBox;
    private final JButton setButton;
    
    // Months and Years
    private final String[] months = {"January", "February", "March", "April", "May", "June", "July", 
                               "August", "September", "October", "November", "December"};
    private final Integer[] days = new Integer[31];
    private final Integer[] years = new Integer[101]; // Adjust this as per your requirement   
    
    public JComboB() {
        setTitle("ComboBox");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Initialize days and years
        for (int i = 0; i < 31; i++) {
            days[i] = i + 1; 
        }
        for (int i = 0; i < 101; i++) {
            years[i] = 1920 + i; // Modify this to set the starting year
        }
        
        // Month ComboBox
        monthComboBox = new JComboBox<>(months);
        add(new JLabel("Month:"));
        add(monthComboBox);
        
        // Day ComboBox
        dayComboBox = new JComboBox<>(days);
        add(new JLabel("Day:"));
        add(dayComboBox);
        
        // Year ComboBox
        yearComboBox = new JComboBox<>(years);
        add(new JLabel("Year:"));
        add(yearComboBox);
        
        // Set Button
        setButton = new JButton("Set");
        setButton.setBackground(Color.GREEN);
        setButton.addActionListener(new SetButtonListener());
        add(setButton);
    }

    // Action Listener for set button
    private class SetButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedMonth = (String) monthComboBox.getSelectedItem();
            Integer selectedDay = (Integer) dayComboBox.getSelectedItem();
            Integer selectedYear = (Integer) yearComboBox.getSelectedItem();
            JOptionPane.showMessageDialog(JComboB.this, 
                "Selected Birth Date: " + selectedDay + " " + selectedMonth + " " + selectedYear);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JComboB comboBoxApp = new JComboB();
            comboBoxApp.setVisible(true);
        });
    }
}