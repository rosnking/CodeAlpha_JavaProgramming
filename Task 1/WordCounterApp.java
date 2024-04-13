import javax.swing.*;
import java.awt.*;

public class WordCounterApp extends JFrame 
{
    private JTextArea textArea;
    private JButton countButton;

    public WordCounterApp() 
    {
        setTitle("Word Counter");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        countButton = new JButton("Count Words");
        setLayout(null); 

        textArea.setBounds(10, 10, 580, 300);
        countButton.setBounds(250, 320, 120, 30);

        add(textArea);
        add(countButton);

        countButton.addActionListener(e -> {
            String inputText = textArea.getText();
            String[] words = inputText.split("\\s+");
            int wordCount = words.length;
            JOptionPane.showMessageDialog(null, "Word Count : " + wordCount);
        });
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> {
            WordCounterApp app = new WordCounterApp();
            app.setVisible(true);
        });
    }
}
