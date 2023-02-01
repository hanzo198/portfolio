/*

*/
package humanproject;

public class Human {
    
   //private instance variables storing all attibutes about a human
   private String myFirstName;
   private String myLastName;
   private String myGender;
   private String myHair;
   private String myEye;
   private String myHeight;
   private String mycolor;
   private int myAge;
   private double myWeeklyPay;

   
   //constructor for the human object   
   public Human(String firstName, String lastName, String gender, String hair, 
           String eye, String height, int age, double weeklyPay, String color)
   {
      myFirstName = firstName;
      myLastName =  lastName;
      myGender = gender;
      myHair = hair;
      myEye = eye;
      myHeight = height;
      myAge = age;
      myWeeklyPay = weeklyPay;
      mycolor = color;
   }
   
   //Getter (accessor) methods for the Human object
   public String getFirstName()
   {
      return myFirstName;
   }
   
   public String getLastName()
   {
      return myLastName;
   }
   
   public String getFullName()
   {
      return myFirstName + " " + myLastName;
   }
   
   public String getGender()
   {
      return myGender;
   }
   
   public String getHair()
   {
      return myHair;
   }
   
   public String getEye()
   {
      return myEye;
   }
   
   public String getHeight()
   {
      return myHeight;
   }
   
   public int getAge()
   {
      return myAge;
   }
   
   public double getPay()
   {
      return myWeeklyPay;
   }
   
   //NEW GETTER
   public String getColor()
   {
       return mycolor;
   }
   
   //Setter (mutator) methods for the Human object
   public void setFirstName(String newFirstName)
   {
      myFirstName = newFirstName;
   }
   
   public void setLastName(String newLastName)
   {
      myLastName = newLastName;
   }
   
   public void setGender(String newGender)
   {
      myGender = newGender;
   }
   
   public void setHair(String newHair)
   {
      myHair = newHair;
   }
   
   public void setEye(String newEye)
   {
      myEye = newEye;
   }
   
   public void setHeight(String newHeight)
   {
      myHeight = newHeight;
   }
   
   public void setAge(int newAge)
   {
      myAge = newAge;
   }
   
   public void setColor(String newColor)
   {
       mycolor = newColor;
   }
   
   public void getPay(double newPay)
   {
      myWeeklyPay = newPay;
   }
  
   
   //Setter methods to update attributes
   public void haveBirthday()
   {
      myAge++;
   }
   
   public void payChange(double changeAmount)
   {
      myWeeklyPay += changeAmount;
   }

   public String toString(){
       
       String pronoun;
       
       if(getGender().equalsIgnoreCase("male"))
       {
           pronoun = "He";
       }
       else
       {
           pronoun = "She";
       }
   
       return "My friend is named: " + getFullName() + ". " +
                        pronoun +" is " + getAge() 
                        + " years old with " + getHair() + " hair and " 
                        + getEye() + " eyes. " + pronoun
                        + " is " + getHeight() + " tall "
                        + "and is " + getColor(); 
    }
    
}
