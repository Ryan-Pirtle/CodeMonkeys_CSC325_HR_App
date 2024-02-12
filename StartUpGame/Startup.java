import java.util.ArrayList;
public class Startup {
    private ArrayList<String> locationCells;

    //set location to passed in arrayList
    private void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }
    //if hit remove index of hit and if miss return that
    //if locationCells becomes empty return kill
    private String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
            }else{
                result = "hit";
            }
        }
        return result;
    }
}
