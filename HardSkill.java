package com.example.HR_AppJava.models;

public class HardSkill{
private String title;
private String level;
HardSkill(String title, String level){
    this.title = title;
    this.level = level;
}

//mutators
void setTitle(String newTitle){
    title = newTitle;
}
void setLevel(String newLevel){   
    level = newLevel;
}
//accessors
String getLevel(){
    return(level);    
}
String getTitle(){
    return(title);    
}
//
void displayDetails(){
    System.out.print("-- Hard Skills --\n"+
                        "Title: " + getTitle() +
                        "\nExperience: " + getLevel());
}

}
