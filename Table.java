import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Table extends JFrame {

    public Table() {
        setTitle("Table Example");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Table Data
        String[] columnNames = {"No", "Name", "Age", "Gender"}; // Added "No" column
        Object[][] data = {
            {1, "Shann", 18, "Female"},
            {2, "Seppi", 18, "Male"},
            {3, "Beato", 18, "Female"},
            {4, "Beverly", 18, "Female"},
            {5, "Michelle", 18, "Female"},
            {6, "France", 18, "Male"}
        };

        // Table Model
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Table Customization
        table.setRowHeight(25);
        table.setBackground(new Color(240, 248, 255)); // Light blue background
        table.setForeground(Color.BLACK);
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.getTableHeader().setBackground(new Color(100, 149, 237)); // Cornflower blue header
        table.getTableHeader().setForeground(Color.WHITE);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        // Add Table to ScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Table tableApp = new Table();
            tableApp.setVisible(true);
        });
    }
}
