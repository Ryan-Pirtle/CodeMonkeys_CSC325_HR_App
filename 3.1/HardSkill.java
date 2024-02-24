public class HardSkill{
    private String title;
    private String level;

    HardSkill(String title, String level){
        this.title = title;
        this.level = level;
    }

    //mutators
    public void setTitle(String newTitle){
    title = newTitle;   
    }
    public void setLevel(String newLevel){   
        level = newLevel;
    }
    //accessors
    public String getLevel(){
        return(level);    
    }
    public String getTitle(){
        return(title);    
    }
    //
    public void displayDetails(){
        System.out.print("-- Hard Skills --\n"+
                            "Title: " + getTitle() +
                            "\nExperience: " + getLevel());
    }

}
