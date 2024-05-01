import javax.crypto.Cipher;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;

public class LogoApp {
	public static void Main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Logo Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            JPanel canvas = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    Graphics2D g2d = (Graphics2D) g;

                    // Draw sun
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(50, 50, 100, 100);
                    
                    // Draw sun rays
                    g2d.setColor(Color.BLUE);
                    for (int i = 0; i < 360; i += 45) {
                        double radian = Math.toRadians(i);
                        int x1 = 100 + (int) (Math.cos(radian) * 50);
                        int y1 = 100 + (int) (Math.sin(radian) * 50);
                        int x2 = 100 + (int) (Math.cos(radian) * 80);
                        int y2 = 100 + (int) (Math.sin(radian) * 80);
                        g2d.drawLine(x1, y1, x2, y2);
                    }

                    // Draw smiley face
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(75, 75, 50, 50);
                    g2d.setColor(Color.BLUE);
                    g2d.drawArc(80, 90, 40, 20, -180, 180);

                    // Draw Eyes on the Sun
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(80, 80, 10, 10);
                    g2d.fillOval(110, 80, 10, 10);

                    // Draw a square House to the bottom right of the sun
                    g2d.setColor(Color.GRAY);
                    g2d.fillRect(190, 170, 40, 40);

                    // Draw red door
                    g2d.setColor(Color.BLACK);
                    g2d.fillRect(200, 180, 10, 20);
                    // Draw door outline

                    g2d.setColor(Color.RED);
                    g2d.fillOval(300, 300, 100, 100);
                    g2d.setColor(Color.WHITE);
                    g2d.fillOval(300, 300, 90, 90);

                    g2d.setColor(Color.RED);
                    g2d.drawLine(320, 340, 320, 370);
                    g2d.drawLine(320, 355, 335, 355);
                    g2d.drawLine(335, 340, 335, 370);



                }
            };

            frame.add(canvas);
            frame.setVisible(true);
        });
	}
}