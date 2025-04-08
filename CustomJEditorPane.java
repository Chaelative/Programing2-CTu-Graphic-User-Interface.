import javax.swing.*;

public class CustomJEditorPane { // Renamed class to avoid conflict
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Headings Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JEditorPane editorPane = new JEditorPane();
            editorPane.setContentType("text/html");
            editorPane.setEditable(false);

            String content = "<html>"
                    + "<h1>Heading 1</h1>"
                    + "<h2>Heading 2</h2>"
                    + "<h3>Heading 3</h3>"
                    + "<h4>Heading 4</h4>"
                    + "<h5>Heading 5</h5>"
                    + "</html>";

            editorPane.setText(content);

            JScrollPane scrollPane = new JScrollPane(editorPane);
            frame.add(scrollPane);

            frame.setVisible(true);
        });
    }
}