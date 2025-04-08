import java.awt.*;
import javax.swing.*;

public class SplitP {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JSplitPane Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            
            JPanel leftPanel = new JPanel();
            leftPanel.setBackground(Color.LIGHT_GRAY);
            leftPanel.add(new JLabel("Left Panel"));
            
            JPanel rightPanel = new JPanel();
            rightPanel.setBackground(Color.WHITE);
            rightPanel.add(new JLabel("Right Panel"));
            
            JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
            splitPane.setDividerLocation(200);
            
            frame.add(splitPane);
            frame.setVisible(true);
        });
    }
}
