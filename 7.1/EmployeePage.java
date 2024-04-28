import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;
//import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class EmployeePage extends JFrame{
    public TempArrays AllArray;
    JPanel inputPanel;
    JPanel infoPanel;
    JList<String> myList;
    
    JLabel idLabel;
    JLabel nameLabel;
    JLabel emailLabel;
    JLabel addressLabel;
    JLabel cityLabel;
    JLabel stateLabel;
    JLabel zipcodeLabel;
    JLabel phoneLabel;
    
    JTextField idField;
    JTextField firstNameField;
    JTextField lastNameField;
    JTextField emailField;
    JTextField addressField;
    JTextField cityField;
    JTextField stateField;
    JTextField zipcodeField;
    JTextField phoneField;

    JButton saveBtn;

    Object[] employeeArray;

    public EmployeePage(TempArrays array){
        AllArray = array;
        employeeArray =  AllArray.getArray(0);

        setTitle("Employee Page");
        setSize(900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        AllArray.readItemsInArray(0);

        //JPanels
        inputPanel = new JPanel();
        inputPanel.setBackground(Color.CYAN);
        inputPanel.setBounds(100, 630, 700, 30);
        inputPanel.setLayout(null);
        add(inputPanel);
        
        infoPanel = new JPanel();
        infoPanel.setBackground(Color.CYAN);
        infoPanel.setBounds(100, 25, 700, 500);
        infoPanel.setLayout(null);
        add(infoPanel);

        //componets for infoPanel
        //labels and correspoinding textboxes
        idLabel = new JLabel("ID: ");
        idLabel.setBounds(30,15,100,30);

        idField = new JTextField();
        idField.setBounds(130,15,200,30);

        nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(30,50,100,30);

        firstNameField = new JTextField();
        firstNameField.setBounds(130,50,200,30);

        lastNameField = new JTextField();
        lastNameField.setBounds(335,50,200,30);
        
        phoneLabel = new JLabel("Phone: ");
        phoneLabel.setBounds(30,85,100,30);

        phoneField = new JTextField();
        phoneField.setBounds(130,85,200,30);

        emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(30,120,100,30);

        emailField = new JTextField();
        emailField.setBounds(130,120,200,30);
        
        addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(30,155,100,30);

        addressField = new JTextField();
        addressField.setBounds(130,155,200,30);
        
        cityLabel = new JLabel("City: ");
        cityLabel.setBounds(30,190,100,30);

        cityField = new JTextField();
        cityField.setBounds(130,190,200,30);

        stateLabel = new JLabel("State: ");
        stateLabel.setBounds(30,225,100,30);

        stateField = new JTextField();
        stateField.setBounds(130,225,200,30);

        zipcodeLabel = new JLabel("Zipcode: ");
        zipcodeLabel.setBounds(30,260,100,30);

        zipcodeField = new JTextField();
        zipcodeField.setBounds(130,260,200,30);

        myList = new JList<String>(getIDandNameOfAll());
        myList.setBounds(335, 85, 300, 300);
        myList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e){
                int index = myList.getSelectedIndex();
                setFieldsToEmployee(index);
            }
        });
        infoPanel.add(myList);
        
        //adds for the infoPanel
        //labels
        infoPanel.add(idLabel);
        infoPanel.add(nameLabel);
        infoPanel.add(phoneLabel);
        infoPanel.add(emailLabel);
        infoPanel.add(addressLabel);
        infoPanel.add(cityLabel);
        infoPanel.add(stateLabel);
        infoPanel.add(zipcodeLabel);

        //fields
        infoPanel.add(idField);
        infoPanel.add(lastNameField);
        infoPanel.add(firstNameField);
        infoPanel.add(phoneField);
        infoPanel.add(emailField);
        infoPanel.add(addressField);
        infoPanel.add(zipcodeField);
        infoPanel.add(cityField);
        infoPanel.add(stateField);


        //components for the inputPanel
        saveBtn = new JButton("Save");
        saveBtn.setBounds(0,0,100,30);
        saveBtn.addActionListener(e -> {
            editEmployee(myList.getSelectedIndex());
        });

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

    //get a specific employee
    public String getEmployee(int index){
        return employeeArray[index].toString();
    }

    //split up a specific empolyee into an array of strings
    public String[] getASplitEmployee(int index){
        String aEmployee = getEmployee(index);
        String[] aSplitEmployee = aEmployee.split(" ");
        return aSplitEmployee;
    }

    //set the texboxes equal to an employees data
    public void setFieldsToEmployee(int index){
        String[] splitEmployee = getASplitEmployee(index);

        idField.setText(splitEmployee[0]);
        firstNameField.setText(splitEmployee[1]);
        lastNameField.setText(splitEmployee[2]);
        addressField.setText(splitEmployee[3]);
        cityField.setText(splitEmployee[4]);
        stateField.setText(splitEmployee[5]);
        zipcodeField.setText(splitEmployee[6]);
        phoneField.setText(splitEmployee[7]);
        emailField.setText(splitEmployee[8]);
    }

    //get the id, first name, and last name of every employee
    public String[] getIDandNameOfAll(){
        ArrayList<String> eStrings = new ArrayList<String>();

        for(int i = 0; i<employeeArray.length; i++){

            String[] aSplitEmployee = getASplitEmployee(i);
            String firstThree = aSplitEmployee[0] + " " + aSplitEmployee[1] + " " +  aSplitEmployee[2];
            eStrings.add(firstThree);

        }
        
        String employees = eStrings.toString();
        employees = employees.replace("[", "");
        employees = employees.replace("]", "");
        String[] allEmployees = employees.split(", ");
        
        return allEmployees;
    }

    public void editEmployee(int itemIndex){
        Employee newItem = new Employee(Integer.parseInt(idField.getText()), firstNameField.getText(), lastNameField.getText(), addressField.getText(), cityField.getText(), stateField.getText(), zipcodeField.getText(), phoneField.getText(), emailField.getText());

        AllArray.editItemInArray(0, itemIndex, newItem);
        employeeArray =  AllArray.getArray(0);
    }

}

