import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class TextP {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JTextPane Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            
            JTextPane textPane = new JTextPane();
            textPane.setEditable(false);
            StyledDocument doc = textPane.getStyledDocument();
            
            addStyledText(doc, "Heading 1\n", 20, Color.BLACK, true);
            addStyledText(doc, "Heading 2\n", 18, Color.BLUE, true);
            addStyledText(doc, "Heading 3\n", 16, Color.RED, true);
            addStyledText(doc, "This is normal text.\n", 14, Color.BLACK, false);
            
            JScrollPane scrollPane = new JScrollPane(textPane);
            frame.add(scrollPane);
            
            frame.setVisible(true);
        });
    }

    private static void addStyledText(StyledDocument doc, String text, int size, Color color, boolean bold) {
        Style style = doc.addStyle("", null);
        StyleConstants.setFontSize(style, size);
        StyleConstants.setForeground(style, color);
        StyleConstants.setBold(style, bold);
        try {
            doc.insertString(doc.getLength(), text, style);
        } catch (BadLocationException e) {
        }
    }
}
