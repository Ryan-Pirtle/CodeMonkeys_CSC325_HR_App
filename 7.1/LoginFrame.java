import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener 
{
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JTextField txtManagerKey;
    private JButton btnLogin;

    public LoginFrame() 
    {
        // Set frame properties
        setTitle("Login Page");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.GREEN);

        // Create components
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JLabel managerKeyLabel = new JLabel("Manager Key:");
        txtUsername = new JTextField(15);
        txtPassword = new JPasswordField(15);
        txtManagerKey = new JTextField(15);
        btnLogin = new JButton("Login");

        // Add components to panel
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(userLabel);
        panel.add(txtUsername);
        panel.add(passLabel);
        panel.add(txtPassword);
        panel.add(managerKeyLabel);
        panel.add(txtManagerKey);
        panel.add(btnLogin);

        // Set button action listener
        btnLogin.addActionListener(this);

        // Add panel to frame
        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // Handle login button click
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        String managerKey = txtManagerKey.getText();

        // Validate credentials (you can add your own logic here)
        if (username.equals("admin") && password.equals("secret") && managerKey.equals("12345")) 
        {
            JOptionPane.showMessageDialog(this, "Login successful!");
        } // Redirect to the main application page
        else 
        {
            JOptionPane.showMessageDialog(this, "Invalid credentials. Please try again.");
        }
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {
            new LoginFrame().setVisible(true);
        });
    }
}
