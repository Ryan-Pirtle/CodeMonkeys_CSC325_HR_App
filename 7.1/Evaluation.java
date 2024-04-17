public class Evaluation 
{
    //Setting variables
    private String evaluator;
    private String dateEval;
    private String mentalState;
    private String notes;


    //Base constructor
    Evaluation(String evaluator, String dateEval, String mentalState, String notes)
    {
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
}
