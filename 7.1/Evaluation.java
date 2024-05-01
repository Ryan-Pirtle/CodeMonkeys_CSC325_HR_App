public class Evaluation 
{
    //Setting variables
    private int employeeID;
    private String evaluator;
    private String dateEval;
    private String mentalState;
    private String notes;


    //Base constructor
    Evaluation(int employeeID, String evaluator, String dateEval, String mentalState, String notes)
    {
        this.employeeID = employeeID;
        this.evaluator = evaluator;
        this.dateEval = dateEval;
        this.mentalState = mentalState;
        this.notes = notes;
    }

    //Getter methods
    public String evaluator()
    {
        return evaluator;
    }

    public String dateEval()
    {
        return dateEval;
    }

    public String mentalState()
    {
        return mentalState;
    }

    public String notes()
    {
        return notes;
    }

    public int employeeID() 
    {
        return employeeID;
    }

    //Setter Methods
    public void setEvaluator(String evalName)
    {
        evaluator = evalName;
    }

    public void setDateEval(String dateEval)
    {
        this.dateEval = dateEval;
    }

    public void setMentalState(String mState)
    {
        mentalState = mState;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }

    public void setEmployeeID(int employeeID) 
    {
        this.employeeID = employeeID;
    }

    public String toString()
    {
        return this.employeeID() + " " + this.evaluator() + " " + this.dateEval() + " " + this.mentalState() + " " + this.notes();
    }
}
