import javax.swing.*;
import java.awt.*;

public class Lpanel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            System.out.println("Program is running..."); // Added console message
            
            JFrame frame = new JFrame("JLayeredPane Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            frame.setLocationRelativeTo(null); // Center the frame on the screen
            
            JLayeredPane layeredPane = new JLayeredPane();
            frame.setContentPane(layeredPane);
            
            addPanel(layeredPane, Color.GREEN, "Panel 1", 200, 50, 100, 60);
            addPanel(layeredPane, Color.RED, "Panel 2", 100, 120, 100, 60);
            addPanel(layeredPane, Color.MAGENTA, "Panel 3", 300, 200, 100, 60);
            
            frame.setVisible(true);
        });
    }

    private static void addPanel(JLayeredPane pane, Color color, String text, int x, int y, int width, int height) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.setBounds(x, y, width, height);
        panel.setLayout(new BorderLayout());
        
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setForeground(Color.BLACK);
        panel.add(label, BorderLayout.CENTER);
        
        pane.add(panel);
    }
}
