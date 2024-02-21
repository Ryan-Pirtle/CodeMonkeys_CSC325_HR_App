public class Person {
    //instance variables
    private String name;
    private int age;
     
    //constructor with parameters
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    //getters
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    
    //show person to the console
    public void displayDetails(){
        System.out.println("Name: " + name + "Age: " + age);
    }
}
