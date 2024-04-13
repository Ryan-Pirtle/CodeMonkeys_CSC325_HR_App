import java.util.ArrayList;
//Ryan Pirtle

public class TempArrays {
    private ArrayList<Object[]> arrays;

    public TempArrays() {
        arrays = new ArrayList<>();
    }

    // Method to add an item to an array 
    public void addItemToArray(int arrayIndex, Object item) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
                //if the last place in the array is not null then increase the length of the array
                //by 1 in order to open up a spot for it
                if(arrays.get(arrayIndex)[arrays.get(arrayIndex).length - 1] != null){
                    expandArrayCapacity(arrayIndex, item);
                }else{
                    //always adds to the end of an array
                    arrays.get(arrayIndex)[arrays.get(arrayIndex).length - 1] = item;           
                }
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    //Method to expand the capacity of an array - Ryan Pirtle
    private void expandArrayCapacity(int arrayIndex, Object item){
                Object[] array = arrays.get(arrayIndex);
                Object[] newArray = new Object[array.length + 1];
                int newIndex = 0;
                for (int i = 0; i < array.length; i++) {
                        newArray[newIndex++] = array[i];
                }
                arrays.set(arrayIndex, newArray);
                addItemToArray(arrayIndex, item);
    }

    // Method to edit an item in an array
    public void editItemInArray(int arrayIndex, int itemIndex, Object newItem) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            if (itemIndex >= 0 && itemIndex < arrays.get(arrayIndex).length) {
                arrays.get(arrayIndex)[itemIndex] = newItem;
            } else {
                System.err.println("Item index out of bounds");
            }
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    // Method to delete an item from an array
    public void deleteItemFromArray(int arrayIndex, int itemIndex) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            if (itemIndex >= 0 && itemIndex < arrays.get(arrayIndex).length) {
                Object[] array = arrays.get(arrayIndex);
                Object[] newArray = new Object[array.length - 1];
                int newIndex = 0;
                for (int i = 0; i < array.length; i++) {
                    if (i != itemIndex) {
                        newArray[newIndex++] = array[i];
                    }
                }
                arrays.set(arrayIndex, newArray);
            } else {
                System.err.println("Item index out of bounds");
            }
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    // Method to read all the items in an array
    public void readItemsInArray(int arrayIndex) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            Object[] array = arrays.get(arrayIndex);
            System.out.print("Items in array " + arrayIndex + ": ");
            for (Object item : array) {
                System.out.print(item + " ");
            }
            System.out.println();
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    // Method to add a new array
    //new arrays shuold start as length 1
    public void addArray(Object[] newArray) {
        arrays.add(newArray);
    }
}
