import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EvaluationPage extends JFrame implements ActionListener 
{
    public EvaluationPage()
    {
        setTitle("Evaluation Page");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        array.readItemsInArray(1);
        
        //Panel and buttons being added
        JPanel panel = new JPanel(new GridLayout(5, 2));
        JButton btnAddEdit = new JButton("Add/Edit");
        JButton btnClose = new JButton("Close");

        //Necessary Labels for the Evaluation page
        JLabel evaluatorLabel = new JLabel("Evaluator: ");
        JLabel dateLabel = new JLabel("Date of Evaluation: ");
        JLabel mentalLabel = new JLabel("Mental State: ");
        JLabel noteLabel = new JLabel("Notes: ");

        //Necessary Textfields for the Evaluation page
        JTextField txtEvaluator = new JTextField();
        JTextField txtDateEval = new JTextField();
        JTextField txtMentalState = new JTextField();
        JTextField txtnotes = new JTextField();

        //Adding the components together
        panel.add(evaluatorLabel);
        panel.add(txtEvaluator);
        panel.add(dateLabel);
        panel.add(txtDateEval);
        panel.add(mentalLabel);
        panel.add(txtMentalState);
        panel.add(noteLabel);
        panel.add(txtnotes);
        panel.add(btnAddEdit);
        panel.add(btnClose);
        add(panel);

        //Sets the panel to visible
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() {
                new EvaluationPage();
            }
        });
    }

}
