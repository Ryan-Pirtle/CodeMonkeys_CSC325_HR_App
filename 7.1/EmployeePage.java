import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;
//import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EmployeePage extends JFrame{
    private int employeeSelected = 0;
    public EmployeePage(TempArrays array){
        
        setTitle("Employee Page");
        setSize(900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        array.readItemsInArray(0);

        //JPanels
        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(Color.CYAN);
        inputPanel.setBounds(100, 630, 700, 30);
        inputPanel.setLayout(null);
        add(inputPanel);
        
        JPanel infoPanel = new JPanel();
        infoPanel.setBackground(Color.CYAN);
        infoPanel.setBounds(100, 25, 700, 500);
        infoPanel.setLayout(null);
        add(infoPanel);

        //componets for infoPanel
        //labels and correspoinding textboxes
        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(30,50,100,30);

        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(130,50,200,30);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(335,50,200,30);
        
        JLabel phoneLabel = new JLabel("Phone: ");
        phoneLabel.setBounds(30,85,100,30);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(130,85,200,30);

        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(30,120,100,30);

        JTextField emailField = new JTextField();
        emailField.setBounds(130,120,200,30);
        
        JLabel addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(30,155,100,30);

        JTextField addressField = new JTextField();
        addressField.setBounds(130,155,200,30);
        
        JLabel cityLabel = new JLabel("City: ");
        cityLabel.setBounds(30,190,100,30);

        JTextField cityField = new JTextField();
        cityField.setBounds(130,190,200,30);

        JLabel stateLabel = new JLabel("State: ");
        stateLabel.setBounds(30,225,100,30);

        JTextField stateField = new JTextField();
        stateField.setBounds(130,225,200,30);

        JLabel zipcodeLabel = new JLabel("Zipcode: ");
        zipcodeLabel.setBounds(30,260,100,30);

        JTextField zipcodeField = new JTextField();
        zipcodeField.setBounds(130,260,200,30);

        JLabel testLabel = new JLabel("display: ");
        testLabel.setBounds(30,295,200,30);
        infoPanel.add(testLabel);

        JList<Object> myList = new JList<Object>(array.getArray(0));
        myList.setBounds(335, 85, 300, 300);
        myList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e){
            
                int index = myList.getSelectedIndex();
                Object[] employeeArray = array.getArray(0);
                testLabel.setText(employeeArray[index].toString());

                String aEmployee = employeeArray[index].toString();
                System.out.println(aEmployee + " before split");

                String[] aSplitEmployee = aEmployee.split(" ");
                System.out.println(aSplitEmployee[0] + " after split");
            }
        });
        infoPanel.add(myList);
        
        
        //adds for the infoPanel
        infoPanel.add(nameLabel);
        infoPanel.add(phoneLabel);
        infoPanel.add(emailLabel);
        infoPanel.add(addressLabel);
        infoPanel.add(cityLabel);
        infoPanel.add(stateLabel);
        infoPanel.add(zipcodeLabel);

        infoPanel.add(lastNameField);
        infoPanel.add(firstNameField);
        infoPanel.add(phoneField);
        infoPanel.add(emailField);
        infoPanel.add(addressField);
        infoPanel.add(zipcodeField);
        infoPanel.add(cityField);
        infoPanel.add(stateField);


        //components for the inputPanel
        JButton saveBtn = new JButton("Save");
        saveBtn.setBounds(0,0,100,30);

        JButton jobHistoryBtn = new JButton("Job History");
        jobHistoryBtn.setBounds(175,0,100,30);

        JButton evaluationBtn = new JButton("Evaluation");
        evaluationBtn.setBounds(425,0,100,30);

        JButton closeBtn = new JButton("Close");
        closeBtn.setBounds(600, 0, 100, 30);
        closeBtn.addActionListener(e -> {
            dispose(); // Close frame
        });

        JButton displayButton = new JButton("Display Employee");
        displayButton.setBounds(275, 0, 100, 30);

       
        //input panel adds
        inputPanel.add(saveBtn);
        inputPanel.add(jobHistoryBtn);
        inputPanel.add(evaluationBtn);
        inputPanel.add(closeBtn);        
        inputPanel.add(displayButton);


    }

    

}

