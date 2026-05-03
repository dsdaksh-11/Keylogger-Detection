import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.List;

class GUI extends JFrame {

    JTextArea outputArea;
    JLabel statusLabel;

    GUI() {
        setTitle("Keylogger Detector");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Title
        JLabel title = new JLabel("Keylogger Behavior Detector", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(Color.BLUE);
        add(title, BorderLayout.NORTH);

        // Text Area
        outputArea = new JTextArea();
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scroll = new JScrollPane(outputArea);
        add(scroll, BorderLayout.CENTER);

        // Button Panel
        JPanel panel = new JPanel();

        JButton scanBtn = new JButton("Scan File");
        scanBtn.setBackground(Color.BLACK);
        scanBtn.setForeground(Color.WHITE);

        panel.add(scanBtn);
        add(panel, BorderLayout.SOUTH);

        // Status
        statusLabel = new JLabel("Status: Waiting...");
        add(statusLabel, BorderLayout.WEST);

        // Button Action
        scanBtn.addActionListener(e -> scanFile());

        setVisible(true);
    }

    void scanFile() {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();

            try {
                List<String> lines = FileHandler.readFile(file.getAbsolutePath());

                outputArea.setText("");
                int totalScore = 0;

                for (String line : lines) {
                    int score = ScannerEngine.scanLine(line);
                    totalScore += score;

                    String risk = RiskAnalyzer.getRiskLevel(score);
                    outputArea.append(line + " --> " + risk + "\n");
                }

                statusLabel.setText("Scan Complete | Score: " + totalScore);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error reading file");
            }
        }
    }
}