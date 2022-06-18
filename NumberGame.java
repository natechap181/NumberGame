//This program will help the user with their math skills
import java.util.*;

public class NumberGame { 
   public static final int MAX = 100;//max variable is 100, and minimum of 0
 
   public static void main(String[] args) {//main method
   
      Scanner console = new Scanner(System.in); //console made
      Random r = new Random(); //random number made
      int answer;//class constant
   
   
      String truth = gameDescription(console);// brief description of the game followed by a prompt whether or not you want to play
      if (truth.equals("y")) {//will play game if answer is "y"
         problem(console, r); // generates a random problem that it asks the user to solve
      } else {
         System.out.println("have a good day!!");//if they say "n" code will end
      }
   
   
   }
   
   public static String gameDescription(Scanner console) {//game intro method, will promt the user
      System.out.println("This game will give you an addition or subtraction equation that you");
      System.out.println("will be able to solve it will tell you if you got it right or wrong");
      System.out.println("when you are done playing, the program will promt you with your game stats");
      System.out.println();
      System.out.println("HAVE a WICKED TIME");
      System.out.println();
      System.out.println("do you want to play");
      System.out.print("y for yes / n for no ");//will play if they respond with "y"
      String play = console.nextLine();
      return play;
   }
   
   public static void problem(Scanner console, Random r) {//this method is where the problem is made
      
      int number = r.nextInt(MAX) + 1;//int 1 is made
      int number2 = r.nextInt(MAX) + 1;//int 2 is made
      int answer;
      String opp = "0";
      
      boolean b = r.nextBoolean();//random if adding or subtraction
   
      
      if (b == true) {//adding equation
         opp = "+";
         answer = number + number2;
         
      } else { //subtraction equation
         opp = "-";
         answer = number - number2;
      
      }
      
      System.out.println("Okay, here is your question");
      System.out.println(number + " " + opp + " " + number2 + " = ?");//promts the user with the problem
      String userAnswer = console.nextLine();
      if (Integer.parseInt(userAnswer) == answer) {
         System.out.println("Correct!");//if user got the equation right
      } else {
         System.out.println("that is wrong:(");//if user got the equation wrong
         System.out.println("the right answer is" + " " + answer);
        }            
      
   }
}

   System.out.println("Thank you for playing, come back again!");//promts the user with final words
