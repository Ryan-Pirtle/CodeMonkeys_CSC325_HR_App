public class Main{
    public static void main(String[] args){
        Person person = new Person("Ryan", 20);
        Job job = new Job("Student", 5);
        HardSkill skill = new HardSkill("Learning", "Low");

        person.displayDetails();
        System.out.println("");
        job.displayDetails( );
        System.out.println("");
        skill.displayDetails();
    }
}