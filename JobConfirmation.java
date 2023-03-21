import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Confirmation extends JFrame implements ActionListener {
    // Initializing variables
    private JPanel confirmation, buttonPanel;
    private JLabel thankYouLabel, jobCompletionLabel, jobIDLabel, jobDeadlineLabel, jobDurationLabel, jobDescriptionLabel;
    private JButton close;

    /** need to fix so that user info gets printed **/
    // ------------------------------------------
    // This method creates the GUI for the JobConfirmation
    Confirmation() {

        // Assigning variables values
        // Thank you label
        thankYouLabel = new JLabel("Thank you. Your job has been submitted.", SwingConstants.CENTER);
        thankYouLabel.setForeground(Color.WHITE);
        thankYouLabel.setFont(new Font("Inter", Font.BOLD, 16));
        thankYouLabel.setBackground(new Color(217, 217, 217));
        thankYouLabel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(86, 53, 158)),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        // JobID label
        jobIDLabel = new JLabel("Job ID: " + job(jobID), SwingConstants.CENTER);
        jobIDLabel.setForeground(Color.WHITE);
        jobIDLabel.setFont(new Font("Inter", Font.BOLD, 16));
        jobIDLabel.setBackground(new Color(217, 217, 217));
        jobIDLabel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(86, 53, 158)),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        // Job Duration Label
        jobDurationLabel = new JLabel("Job Duration: ", SwingConstants.CENTER);
        jobDurationLabel.setForeground(Color.WHITE);
        jobDurationLabel.setFont(new Font("Inter", Font.BOLD, 16));
        jobDurationLabel.setBackground(new Color(217, 217, 217));
        jobDurationLabel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(86, 53, 158)),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        // Job Deadline Label
        jobDeadlineLabel = new JLabel("Job Deadline: "+ Jobs.jobDescriptionField.getText(), SwingConstants.CENTER);
        jobDeadlineLabel.setForeground(Color.WHITE);
        jobDeadlineLabel.setFont(new Font("Inter", Font.BOLD, 16));
        jobDeadlineLabel.setBackground(new Color(217, 217, 217));
        jobDeadlineLabel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(86, 53, 158)),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        // Job Description Label
        jobDescriptionLabel = new JLabel("Job Description: " , SwingConstants.CENTER);
        jobDescriptionLabel.setForeground(Color.WHITE);
        jobDescriptionLabel.setFont(new Font("Inter", Font.BOLD, 16));
        jobDescriptionLabel.setBackground(new Color(217, 217, 217));
        jobDescriptionLabel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(86, 53, 158)),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        // Job Completion Label
        jobCompletionLabel = new JLabel("Your job completion time is " + Job.sumCompletionTime(Job.completionTimes) + " hours.", SwingConstants.CENTER);
        jobCompletionLabel.setForeground(Color.WHITE);
        jobCompletionLabel.setFont(new Font("Inter", Font.BOLD, 16));
        jobCompletionLabel.setBackground(new Color(217, 217, 217));
        jobCompletionLabel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(86, 53, 158)),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        // Close button
        close = new JButton("Close");
        close.setBounds(110, 270, 100, 34);
        close.setBackground(new Color(217, 217, 217));
        close.setForeground(new Color(86, 53, 158));
        close.setFont(new Font("Inter", Font.BOLD, 16));

        // Creating confirmation panel
        confirmation = new JPanel(new GridLayout(5, 2));
        confirmation.setBackground(new Color(86, 53, 158));

        // Adding variables to the panel
        confirmation.add(thankYouLabel);
        confirmation.add(jobCompletionLabel);
        confirmation.add(jobIDLabel);
        confirmation.add(jobDurationLabel);
        confirmation.add(jobDeadlineLabel);
        confirmation.add(jobDescriptionLabel);

        add(confirmation, BorderLayout.CENTER);

        // Adding buttons to the panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(close);
        add(buttonPanel, BorderLayout.SOUTH);

        // Creating action listener for the close button
        close.addActionListener(this);

        setTitle("Confirmation");
        setSize(400, 250);
    } // <--- Confirmation() constructor ends here

    // --------------------------------------------
    // Action Listener method
    public void actionPerformed(ActionEvent e) {
        dispose();
    } // <--- actionPerformed() method ends here

    class JobConfirmation {
        public static void main(String[] args) {
            try {
                Confirmation form = new Confirmation();
                form.setVisible(true);
                form.setSize(400, 300);
    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    } // <--- main() method ends here
} // <--- JobConfirmation{} class ends here
}