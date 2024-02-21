import com.example.HR_AppJava.models.HardSkill;

public class Main{
    public static void main(String[] args){
        Person person = new Person("Ryan", 20);
        Job job = new Job("Student", 5);
        HardSkill skill = new HardSkill("learning", 0);

        System.out.println("---Personal Details---\n" +
                            person.displayDetails(); +); 
    }
}