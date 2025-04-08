import java.awt.*;
import javax.swing.*;

public class DesktopP {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JDesktopPane Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 500);
            
            JDesktopPane desktopPane = new JDesktopPane();
            frame.setContentPane(desktopPane);
            
            JInternalFrame internalFrame1 = createInternalFrame("Frame1", "Click Button 1", "Button 1", 50, 50);
            JInternalFrame internalFrame2 = createInternalFrame("Frame2", "Click Button 2", "Button 2", 300, 50);
            
            desktopPane.add(internalFrame1);
            desktopPane.add(internalFrame2);
            
            frame.setVisible(true);
        });
    }

    private static JInternalFrame createInternalFrame(String title, String labelText, String buttonText, int x, int y) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setSize(250, 150);
        internalFrame.setLayout(new FlowLayout());
        internalFrame.setLocation(x, y);
        
        JLabel label = new JLabel(labelText);
        JButton button = new JButton(buttonText);
        
        internalFrame.add(label);
        internalFrame.add(button);
        
        internalFrame.setVisible(true);
        return internalFrame;
    }
}
