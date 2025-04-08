import java.awt.*;
import javax.swing.*;

public class List extends JFrame {

    public List() {
        setTitle("JList");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2, 10, 10));

        // MIS Code List
        String[] misCodes = {"AS1097", "AS1098", "AS1099", "AS1100", "AS1101", "CS89", "CS91", "CS93"};
        JList<String> misCodeList = new JList<>(misCodes);
        misCodeList.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane misCodeScrollPane = new JScrollPane(misCodeList);
        JPanel misCodePanel = new JPanel(new BorderLayout());
        misCodePanel.add(new JLabel("MIS Code", JLabel.CENTER), BorderLayout.NORTH);
        misCodePanel.add(misCodeScrollPane, BorderLayout.CENTER);

        // Subject List
        String[] subjects = {"GEC-PC", "GEC-STS", "GEC-US", "GEE-GSPS", "PATHFIT 2", "CC 123", "CC 123L", "PC 121"};
        JList<String> subjectList = new JList<>(subjects);
        subjectList.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane subjectScrollPane = new JScrollPane(subjectList); // Ensure scrollable
        JPanel subjectPanel = new JPanel(new BorderLayout());
        subjectPanel.add(new JLabel("SUBJECT", JLabel.CENTER), BorderLayout.NORTH);
        subjectPanel.add(subjectScrollPane, BorderLayout.CENTER); // Add scroll pane

        // Add Panels to Frame
        add(misCodePanel);
        add(subjectPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            List listApp = new List();
            listApp.setVisible(true);
        });
    }
}
