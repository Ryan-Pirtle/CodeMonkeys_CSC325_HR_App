//every type of employee will implement this class since they are share these traits
//In their own classes they will have additional information if needed
public abstract class BaseEmployee {
   private int employeeID;
   private String firstName;
   private String lastName;
   private String streetAddress;
   private String city;
   private String state;
   private String zipcode;
   private String phone;
   private String email;

    //test constructor
    BaseEmployee(int id, String fName, String lName){
        employeeID = id;
        firstName = fName;
        lastName = lName;
    }
    //base constructor needed for all employees 
    BaseEmployee( int employeeID, String firstName, String lastName, String streetAddress, String city, String state, String zipcode, String phone, String email  ){
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phone = phone;
        this.email = email;
    }

    //get data
    public int getEmployeeID(){
        return employeeID;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getStreetAddress(){
        return streetAddress;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public String getZipcode(){
        return zipcode;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    //set data
    public void setEmployeeID(int id){
        employeeID = id;
    }

    public void setFirstName(String name){
        firstName = name;
    }

    public void setLastName(String name){
        lastName = name;
    }

    public void setStreetAddress(String address){
        streetAddress = address;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setState(String state){
        this.state = state;
    }

    public void setZipcode(String zip){
        zipcode = zip;
    }

    public void setPhone(String number){
        phone = number;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
