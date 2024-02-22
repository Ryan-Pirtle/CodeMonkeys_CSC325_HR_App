public class Job
{   
    //Variables instantiated 
    private String Title;
    private int experience;

    //Constructor for Job class
    public Job (String Title, int experience)
    {
        this.Title = Title;
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

    // Displays the details of title and experience in terms of Months
    public void displayDetails() 
    {
        System.out.println("-- Jobs --");
        System.out.println("Job Title: " + Title);
        System.out.println("Experience: " + experience + " months");
    }

    
}
