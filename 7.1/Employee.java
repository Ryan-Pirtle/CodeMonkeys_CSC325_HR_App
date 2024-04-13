public class Employee extends BaseEmployee {
    //this calls the BaseEmployee abstract class that contains the implementation of the default employee
    //only non standard employees such as managers will need modification

    Employee(int id, String fName, String lName){
        super(id,  fName, lName);
    }

    Employee(int employeeID, String firstName, String lastName, String streetAddress, String city, String state, String zipcode, String phone, String email){
        super(employeeID, firstName, lastName, streetAddress, city, state, zipcode, phone, email);
    }   

    public String toString(){
        return this.getEmployeeID() + " " + this.getFirstName() + " " + this.getLastName();
    }

}