/**
 * Roberto Andino
 * Version 1
 * Program is done in Java programming language
 * 
 * This monster.java class creates a monster with the current attributes
 * It has get and set methods to update and display the attributes of any of the
 * monsters, and it has a toString method to display all the data of the monster
 * when it is required.
 */
package monsterproject;

public class monster {

    //attributes of monster
    private String myName;
    private String myHeight;
    private String myGender;
    private String mySpecies;
    private int myTeethCount;
    private int myAge;

    //Constructor of monster class that receives monster information
    public monster(String name, String height, String gender,
                   String species, int teethCount, int age) 
    {
        myName = name;
        myHeight = height;
        myGender = gender;
        mySpecies = species;
        myTeethCount = teethCount;
        myAge = age;
    }

    //Get methods of monster object
    public String getName() {
        return myName;
    }

    public String getHeight() {
        return myHeight;
    }

    public String getGender() {
        return myGender;
    }

    public String getSpecies() {
        return mySpecies;
    }

    public int getTeethCount() {
        return myTeethCount;
    }

    public int getAge() {
        return myAge;
    }

    //Setter methods for the Monster object
    public void setName(String newName) {
        myName = newName;
    }

    public void setHeight(String newHeight) {
        myHeight = newHeight;
    }

    public void setGender(String newGender) {
        myGender = newGender;
    }

    public void setSpecies(String newSpecies) {
        mySpecies = newSpecies;
    }

    public void setTeethCount(int newTeethCount) {
        myTeethCount = newTeethCount;
    }

    public void setAge(int newAge) {
        myAge = newAge;
    }

    //Setter methods to update attributes using formula
    public void birthday(int newAge) {
        myAge += newAge;
    }

    public void teeth(int newTeeth) {
        myTeethCount += newTeeth;
    }

    //String method to diplay all monster data
    public String toString() {

        return "Monster name: " + myName + " \n"
                + "Gender: " + myGender
                + "\nSpecies: " + mySpecies
                + "\nAge: " + myAge + " old"
                + "\nHeight: " + myHeight + " tall"
                + "\nNumber of teeth: " + myTeethCount + "\n\n";

    }
    
    //end of monster class

}
