import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EvaluationPage extends JFrame implements ActionListener 
{
    //Got to add TempArrays tempArrays in parameter
    public EvaluationPage(TempArrays tempArrays)
    {
        setTitle("Evaluation Page");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //array.readItemsInArray(1);
        
        //Panel and buttons being added
        JPanel panel = new JPanel(new GridLayout(6, 2));
        JButton btnAddEdit = new JButton("Add/Edit");
        JButton btnClose = new JButton("Close");
        JButton btnSaveEdits = new JButton("Save");
        JButton btnReadEval = new JButton("Read Eval");

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

        //Allows the textfields to be editied
        btnAddEdit.addActionListener(e ->
        {
            txtEvaluator.setEditable(true);
            txtDateEval.setEditable(true);
            txtMentalState.setEditable(true);
            txtnotes.setEditable(true);
        });

        //Save the changes made by edit
        btnSaveEdits.addActionListener(e ->
        {
            txtEvaluator.setEditable(false);
            txtDateEval.setEditable(false);
            txtMentalState.setEditable(false);
            txtnotes.setEditable(false);

            Evaluation evaluation = new Evaluation(1100, txtEvaluator.getText(), txtDateEval.getText(), txtMentalState.getText(), txtnotes.getText());

            tempArrays.addItemToArray(0, evaluation);
        });

        btnReadEval.addActionListener(e -> 
        {
            // Read items from the Evaluation array
            tempArrays.readItemsInArray(1);
        });

        //Closes the panel
        btnClose.addActionListener(e ->
        {
            dispose();
        });


        txtEvaluator.setEditable(false);
        txtDateEval.setEditable(false);
        txtMentalState.setEditable(false);
        txtnotes.setEditable(false);

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
        panel.add(btnSaveEdits);
        panel.add(btnReadEval);
        add(panel);

        //Sets the panel to visible
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                TempArrays tempArrays = new TempArrays();
                tempArrays.addArray(new Evaluation[1]);
                new EvaluationPage(tempArrays);
            }
        });
    }

}
