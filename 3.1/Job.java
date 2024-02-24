public class Job extends Person
{   
    //Variables instantiated 
    private String Title;
    private int experience;

    //Constructor for Job class
    public Job (String name, int age, String title, int experience)
    {
        super(name, age);
        this.Title = title;
        this.experience = experience;
    }

    //Sets the title variable
    public void setTitle(String Title)
    {
        this.Title = Title;
    }

    //Sets the experience variable
    public void setExperience(int experience)
    {
        this.experience = experience;
    }

    //Getter Method for Title
    public String getTitle()
    {
        return Title;
    }

    //Getter method for Experience
    public int getExperience()
    {
        return experience;
    }
    //Displays parent methods results as well
    // Displays the details of title and experience in terms of Months
    @Override
    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("-- Jobs --");
        System.out.println("Job Title: " + Title);
        System.out.println("Experience: " + experience + " months");
    }

    
}
