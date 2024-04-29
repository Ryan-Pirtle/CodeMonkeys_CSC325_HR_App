
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EvaluationPage extends JFrame implements ActionListener 
{

    public EvaluationPage(TempArrays tempArrays)
    {
        setTitle("Evaluation Page");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        //Panels for the Evaluation Page
        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        panel.setBounds(100, 30, 500, 370);
        panel.setLayout(null);
        add(panel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setBounds(100, 430, 500, 30);
        buttonPanel.setLayout(null);
        add(buttonPanel);

        //Necessary Labels for the Evaluation page
        JLabel idLabel = new JLabel("ID");
        idLabel.setBounds(20, 15, 130, 30);
        panel.add(idLabel);

        JLabel evaluatorLabel = new JLabel("Evaluator: ");
        evaluatorLabel.setBounds(20, 50, 130, 30);
        panel.add(evaluatorLabel);

        JLabel dateLabel = new JLabel("Date of Evaluation: ");
        dateLabel.setBounds(20, 85, 130, 30);
        panel.add(dateLabel);

        JLabel mentalLabel = new JLabel("Mental State: ");
        mentalLabel.setBounds(20, 120, 130, 30);
        panel.add(mentalLabel);
        

        JLabel noteLabel = new JLabel("Notes: ");
        noteLabel.setBounds(20, 155, 130, 30);
        panel.add(noteLabel);

        //Necessary Textfields for the Evaluation page
        JTextField txtID = new JTextField();
        txtID.setBounds(220, 15, 200, 30);
        txtID.setEditable(false);
        panel.add(txtID);

        JTextField txtEvaluator = new JTextField();
        txtEvaluator.setBounds(220, 50, 200, 30);
        txtEvaluator.setEditable(false);
        panel.add(txtEvaluator);

        JTextField txtDateEval = new JTextField();
        txtDateEval.setBounds(220, 85, 200, 30);
        txtDateEval.setEditable(false);
        panel.add(txtDateEval);

        JTextField txtMentalState = new JTextField();
        txtMentalState.setBounds(220, 120, 200, 30);
        txtMentalState.setEditable(false);
        panel.add(txtMentalState);

        JTextField txtNotes = new JTextField();
        txtNotes.setBounds(220, 155, 200, 30);
        txtNotes.setEditable(false);
        panel.add(txtNotes);

        //Buttons for the Evaluation Page
        JButton btnAddEdit = new JButton("Add/Edit");
        btnAddEdit.setBounds(100, 430, 100, 30);
        buttonPanel.add(btnAddEdit);

        JButton btnSaveEdits = new JButton("Save");
        btnSaveEdits.setBounds(200, 430, 100, 30);
        buttonPanel.add(btnSaveEdits);

        JButton btnClose = new JButton("Close");
        btnClose.setBounds(400, 430, 100, 30);
        buttonPanel.add(btnClose);


        JButton btnReadEval = new JButton("Read Eval");
        btnReadEval.setBounds(500, 430, 100, 30);
        buttonPanel.add(btnReadEval);

        // Create a JComboBox to display available evaluations
        JComboBox<Integer> evaluationList = new JComboBox<>();
        evaluationList.setBounds(100, 200, 200, 30);
        panel.add(evaluationList);

        // Populate the JComboBox with available evaluation IDs
        for (int i = 0; i < evaluationArray.length; i++) 
        {
            Evaluation eval = (Evaluation) evaluationArray[i];
            evaluationList.addItem(eval.getEmployeeID());
        }


        //Allows the textfields to be editied
        btnAddEdit.addActionListener(e ->
        {
            txtID.setEditable(true);
            txtEvaluator.setEditable(true);
            txtDateEval.setEditable(true);
            txtMentalState.setEditable(true);
            txtNotes.setEditable(true);
        });

        //Save the changes made by edit
        btnSaveEdits.addActionListener(e ->
        {
            txtID.setEditable(false);
            txtEvaluator.setEditable(false);
            txtDateEval.setEditable(false);
            txtMentalState.setEditable(false);
            txtNotes.setEditable(false);

            Evaluation evaluation = new Evaluation(Integer.parseInt(txtID.getText()), txtEvaluator.getText(), txtDateEval.getText(), txtMentalState.getText(), txtNotes.getText());

            tempArrays.addItemToArray(0, evaluation);

            //Clear the text fields
            txtID.setText("");
            txtEvaluator.setText("");
            txtDateEval.setText("");
            txtMentalState.setText("");
            txtNotes.setText("");

            JOptionPane.showMessageDialog(this, "Data saved!");
        });

        //Closes the panel
        btnClose.addActionListener(e ->
        {
            dispose();
        });

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
