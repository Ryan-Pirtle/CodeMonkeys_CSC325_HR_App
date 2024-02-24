public class HardSkill extends Job{
    private String skill;
    private String level;

    HardSkill(String name, int age,String title, int experience, String skill, String level){
        super(name, age, title, experience);
        this.skill = skill;
        this.level = level;
    }

    //mutators
    public void setSkill(String newskill){
        skill = newskill;   
    }
    public void setLevel(String newLevel){   
        level = newLevel;
    }
    //accessors
    public String getLevel(){
        return(level);    
    }
    public String getskill(){
        return(skill);    
    }
    //display currnet and parent class properties
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.print("-- Hard Skills --\n"+
                            "skill: " + getskill() +
                            "\nExperience: " + getLevel());
    }

}
