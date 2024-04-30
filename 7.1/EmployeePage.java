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
    JButton clearButton;
    JButton addButton;
    JButton closeBtn;
    JButton evaluationBtn;
    JButton jobHistoryBtn;
    JButton deleteButton;

    Object[] employeeArray;

    public EmployeePage(TempArrays array){
        AllArray = array;
        employeeArray =  AllArray.getArray(0);

        setTitle("Employee Page");
        setSize(900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        //JPanels

        //inputPanel will contain the all the buttons at the bottom of the page
        inputPanel = new JPanel();
        inputPanel.setBackground(Color.CYAN);
        inputPanel.setBounds(100, 630, 700, 30);
        inputPanel.setLayout(null);
        add(inputPanel);
        
        //infopanel will contain the list of employees and all the textboxes/labels
        //in the center of the page
        infoPanel = new JPanel();
        infoPanel.setBackground(Color.CYAN);
        infoPanel.setBounds(100, 25, 700, 500);
        infoPanel.setLayout(null);
        add(infoPanel);

        //components for infoPanel
        //labels and corresponding textboxes
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

        String[] ex = new String[5];
        for(int i = 0; i<employeeArray.length; i++){
            ex[i] = employeeArray[i].toString();
        }
        

        myList = new JList<String>(getIDandNameOfAll());
        myList.setBounds(335, 85, 300, 300);
        myList.addListSelectionListener(new ListSelectionListener() {
            //whenever an employee in the list is clicked on get the index of 
            //that employee and set the textfields to that employees data
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
        //use the contents of the textbox to save changes to an employee whenever clicked
        saveBtn.addActionListener(e -> {
            editEmployee(myList.getSelectedIndex());
        });

        jobHistoryBtn = new JButton("Job History");
        jobHistoryBtn.setBounds(100,0,100,30);

        evaluationBtn = new JButton("Evaluation");
        evaluationBtn.setBounds(200,0,100,30);
        evaluationBtn.addActionListener(e -> {
            EvaluationPage page = new EvaluationPage(AllArray);
        });

        closeBtn = new JButton("Close");
        closeBtn.setBounds(300, 0, 100, 30);
        closeBtn.addActionListener(e -> {
            dispose(); // Close frame
        });

        addButton = new JButton("Add");
        addButton.setBounds(400, 0, 100, 30);
        //use the contents of the textboxes to create a new employee whenever clicked
        addButton.addActionListener(e -> {
            addEmployee();
        });
        
        clearButton = new JButton("Clear fields");
        clearButton.setBounds(500, 0, 100, 30);
        clearButton.addActionListener(e -> {
            //sets text field to empty and deselcts current jlist index
            clearFields();
            myList.clearSelection();
        });

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(600, 0, 100, 30);
        deleteButton.addActionListener(e -> {
            //delte employee at the selected index in the jlist
            deleteEmployee(myList.getSelectedIndex());
        });
   
        //input panel adds
        inputPanel.add(saveBtn);
        inputPanel.add(jobHistoryBtn);
        inputPanel.add(evaluationBtn);
        inputPanel.add(closeBtn);        
        inputPanel.add(addButton);
        inputPanel.add(clearButton);
        inputPanel.add(deleteButton);
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

        //loop through and get the id, first name, and last name of each employee
        for(int i = 0; i<employeeArray.length; i++){

            String[] aSplitEmployee = getASplitEmployee(i);
            String firstThree = aSplitEmployee[0] + " " + aSplitEmployee[1] + " " +  aSplitEmployee[2];
            eStrings.add(firstThree);

        }
        
        //get arraylist as string
        String employees = eStrings.toString();
        //clean list
        employees = employees.replace("[", "");
        employees = employees.replace("]", "");
        //split string into individual employees
        String[] allEmployees = employees.split(", ");
        
        return allEmployees;
    }

    public Employee createNewEmployee(){
        //create new employee object with data in textfields
        Employee newItem = new Employee(Integer.parseInt(idField.getText()), firstNameField.getText(), 
        lastNameField.getText(), addressField.getText(), cityField.getText(), stateField.getText(), 
        zipcodeField.getText(), phoneField.getText(), emailField.getText());

        return newItem;
    }

    public void editEmployee(int itemIndex){
        //create new employee object with data in textfields
        Employee newItem = createNewEmployee();
        
        //use the method in the tempArrays class to relpace old employee
        AllArray.editItemInArray(0, itemIndex, newItem);
        //update current array
        employeeArray =  AllArray.getArray(0);
    }
    
    public void clearFields(){
        // empty the text fields
        idField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        addressField.setText("");
        cityField.setText("");
        stateField.setText("");
        zipcodeField.setText("");
        phoneField.setText("");
        emailField.setText("");
    }
    
    public void addEmployee(){
        //new employee created using data from textfields
        Employee newEmployee = createNewEmployee();
        //use the method from temparrays to add a new employee object to the array
        AllArray.addItemToArray(0, newEmployee);
        //update current array
        employeeArray = AllArray.getArray(0);
        //update list with new employee
        myList.setListData(getIDandNameOfAll());
    }

    public void deleteEmployee(int index){
        //use method from temparrays to delete an employee
        AllArray.deleteItemFromArray(0, index);
        //maybe add this?
        // AllArray.deleteItemFromArray(1, index);
        // AllArray.deleteItemFromArray(2, index);
        //update curent array
        employeeArray = AllArray.getArray(0);
        //update list
        myList.setListData(getIDandNameOfAll());

    }
}

