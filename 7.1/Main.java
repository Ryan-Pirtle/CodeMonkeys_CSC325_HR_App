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

        //Logan Owens
        tempArrays.addItemToArray(1, new Evaluation("Dr. Jaxon", "4-12-2024", "Psychotic", "Likes his water bottle too much!"));
        tempArrays.addItemToArray(1, new Evaluation("Dr. Jaxon", "3-26-2022", "Perfect", "Perfect Employee!"));
        tempArrays.addItemToArray(1, new Evaluation("Dr. Tennyson", "2-25-2024", "Mentally Sound", "Is eagerly awaiting a promotion, very relentless about it."));


        // Edit an item in the second array
       // tempArrays.editItemInArray(1, 1, "d");

        // Delete an item from the first array
       // tempArrays.deleteItemFromArray(0, 1);

        // Read items from the first array
        tempArrays.readItemsInArray(0);

        // Read items from the second array
       // tempArrays.readItemsInArray(1);

      // tempArrays.deleteItemFromArray(0, 0);

       tempArrays.addItemToArray(0, new Employee(6, "Ty", "McMullen"));
       tempArrays.readItemsInArray(0);


    }
}
