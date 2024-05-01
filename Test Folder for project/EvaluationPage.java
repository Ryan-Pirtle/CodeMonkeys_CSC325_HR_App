
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class EvaluationPage extends JFrame implements ActionListener 
{

    public TempArrays everyArray;
    Object[] evalArray;
    JList<Integer> evaluationList;
    JTextField txtID;
    JTextField txtEvaluator;
    JTextField txtDateEval;
    JTextField txtMentalState;
    JTextField txtNotes;

    public EvaluationPage(TempArrays everyArray)
    {
        this.everyArray = everyArray;
        evalArray = everyArray.getArray(1);


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
        txtID = new JTextField();
        txtID.setBounds(220, 15, 200, 30);
        txtID.setEditable(false);
        panel.add(txtID);

        txtEvaluator = new JTextField();
        txtEvaluator.setBounds(220, 50, 200, 30);
        txtEvaluator.setEditable(false);
        panel.add(txtEvaluator);

        txtDateEval = new JTextField();
        txtDateEval.setBounds(220, 85, 200, 30);
        txtDateEval.setEditable(false);
        panel.add(txtDateEval);

        txtMentalState = new JTextField();
        txtMentalState.setBounds(220, 120, 200, 30);
        txtMentalState.setEditable(false);
        panel.add(txtMentalState);

        txtNotes = new JTextField();
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
        evaluationList = new JList<>();
        evaluationList.setBounds(100, 200, 200, 30);
        
        evaluationList.addListSelectionListener(new ListSelectionListener() 
        {
            @Override
            public void valueChanged(ListSelectionEvent e){
                int index = evaluationList.getSelectedIndex();
                setFieldsToEval(index);
            }
        }); 
        
        panel.add(evaluationList);


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

            everyArray.addItemToArray(0, evaluation);

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

    public String getEval(int index)
    {
        return evalArray[index].toString();
    }

    public String[] getASplitEvaluation(int index)
    {
        String anEval = getEval(index);
        String[] aSplitEvaluation = anEval.split(" ");
        return aSplitEvaluation;
    }

    public void setFieldstoEval(int index)
    {
        String[] splitEval = getASplitEvaluation(index);

        txtID.setText(splitEval[0]);
        txtEvaluator.setText(splitEval[1]);
        txtDateEval.setText(splitEval[2]);
        txtMentalState.setText(splitEval[3]);
        txtNotes.setText(splitEval[4]);
    }

    public String[] getID()
    {
        ArrayList<String> evStrings = new ArrayList<String>();

        for(int i = 0; i < evalArray.length; i++)
        { 
            String[] aSplitEvaluation = getASplitEvaluation(i);
            String evalID = aSplitEvaluation[0] + " " + aSplitEvaluation[1] + " " + aSplitEvaluation[2];
            evStrings.add(evalID);
        }

        //Get arraylist as string
        String evaluations = evStrings.toString();
        //Clean list
        evaluations = evaluations.replace("[", "");
        evaluations = evaluations.replace("]", "");
        //Split string into individual Evaluations
        String[] allEvaluations = evaluations.split(", ");
        
        return allEvaluations;
    }

}
