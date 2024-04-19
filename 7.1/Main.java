public class Main {
    public static void main(String[] args) {
        // Instantiate TempArrays
        TempArrays tempArrays = new TempArrays();

        // Add some arrays
        tempArrays.addArray(new Employee[1]);
       
        
        // Add an item to the first array
        tempArrays.addItemToArray(0, new Employee(5, "Ryan", "Pirtle") );
        //tempArrays.readItemsInArray(0);
        tempArrays.addItemToArray(0, new Employee(3, "Logan", "Owens") );


    

        // Read items from the first array
        //tempArrays.readItemsInArray(0);

        // Read items from the second array
       // tempArrays.readItemsInArray(1);


       tempArrays.addItemToArray(0, new Employee(6, "Ty", "McMullen"));
      // tempArrays.readItemsInArray(0);

       EmplooyePage page = new EmplooyePage(tempArrays);
       page.setVisible(true);
    }
}
