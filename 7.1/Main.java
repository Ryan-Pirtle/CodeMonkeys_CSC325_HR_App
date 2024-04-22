//Adapted from code in Class, proper credit to Dr. Jason Owen
public class Main {
    public static void main(String[] args) {
        // Instantiate TempArrays
        TempArrays tempArrays = new TempArrays();

        // Add some arrays
        tempArrays.addArray(new Employee[1]);
        tempArrays.addArray(new Evaluation[1]);
       // tempArrays.addArray(new String[]{"a", "b", "c"});
    
       // Employee e = new Employee(9999997, "Ryan", "null");
       // System.out.println(e.toString());
        
        // Add an item to the first array
        tempArrays.addItemToArray(0, new Employee(5, "Ryan", "Pirtle") );
        tempArrays.readItemsInArray(0);
        tempArrays.addItemToArray(0, new Employee(3, "Logan", "Owens") );

        //Arrays for Evaluation - Logan Owens
        //Array format (arrayIndex, new Evaluation(int employeeID, String evaluator, String dateEval,  String mentalState, String notes))
        tempArrays.addItemToArray(1, new Evaluation(1100,"Dr. Jaxon", "4-12-2024", "Psychotic", "Likes his water bottle too much!"));
        tempArrays.addItemToArray(1, new Evaluation(1101,"Dr. Dresner", "3-26-2022", "Perfect", "Perfect Employee!"));
        tempArrays.addItemToArray(1, new Evaluation(1102,"Dr. Tennyson", "2-25-2024", "Mentally Sound", "Is eagerly awaiting a promotion, very relentless about it."));
        

        //Logan Owens
        tempArrays.readItemsInArray(1);

        // Read items from the second array
       // tempArrays.readItemsInArray(1);

      // tempArrays.deleteItemFromArray(0, 0);

       tempArrays.addItemToArray(0, new Employee(6, "Ty", "McMullen"));
       tempArrays.readItemsInArray(0);


    }
}
