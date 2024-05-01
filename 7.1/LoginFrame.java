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
        //Set frame properties
        setTitle("HR Solutions Login Page");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.GREEN);

        //Create components
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(15, 15, 100, 30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(15, 45, 100, 30);

        JLabel managerKeyLabel = new JLabel("Manager Key:");
        managerKeyLabel.setBounds(15,75, 100, 30);

        JLabel titleLabel = new JLabel("Welcome to HR Solutions!");
        titleLabel.setBounds(45, 170, 210, 50);
        titleLabel.setFont(new Font("Serif",Font.BOLD,15));

        txtUsername = new JTextField();
        txtUsername.setBounds(135, 15, 150, 30);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(135, 45, 150, 30);

        txtManagerKey = new JTextField();
        txtManagerKey.setBounds(135, 75, 150, 30);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 130, 100, 30);

        //Logo Design
        JPanel logoPanel = new JPanel() 
        {
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillRect(10, 10, getWidth() - 20, getHeight() - 20); // Adjusted size and position
                g.setColor(Color.BLACK);
                int[] xPoints = {30, 50, 50, 70, 70, 50, 30, 30}; // Adjusted coordinates
                int[] yPoints = {30, 30, 50, 50, 70, 70, 50, 50}; // Adjusted coordinates
                int nPoints = xPoints.length;
                g.fillPolygon(xPoints, yPoints, nPoints);
                g.fillOval(40, 20, 20, 20); // head (smaller)
                g.fillOval(45, 40, 5, 5); // eye (smaller)
            }
        };
        logoPanel.setBounds(100, 280, 80, 80); // Adjusted position and size


        // Add components to panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(userLabel);
        panel.add(txtUsername);
        panel.add(passLabel);
        panel.add(txtPassword);
        panel.add(managerKeyLabel);
        panel.add(txtManagerKey);
        panel.add(titleLabel);
        panel.add(btnLogin);
        panel.add(logoPanel);

        //Set button action listener
        btnLogin.addActionListener(this);

        //Add panel to frame
        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //Handle login button click
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        String managerKey = txtManagerKey.getText();

        //Validate credentials (you can add your own logic here)
        if (username.equals("tEmployee325") && password.equals("407Sucks") && managerKey.equals("25654")) 
        {
            JOptionPane.showMessageDialog(this, "Login successful!");
        } //Redirect to the main application page
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