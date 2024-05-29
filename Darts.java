// my game is darts (solianna's version)!
// i ask the player for their name and stored that as a string,

import java.util.Scanner;

public class Darts {

   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      String nameOfPlayer;
     
      System.out.print("What is your name? ");
      nameOfPlayer = s.nextLine();
      
      System.out.print("How long did it take you to throw your dart? ");
      double timeOfDart = s.nextDouble();
      
      System.out.println("What number did your dart land on? (0-20): ");
      int score = s.nextInt();
      String dartLand = s.nextLine();
      
      System.out.println("Where did your dart land? ('single area', 'double ring', 'triple ring', 'outer bull', or 'bull'?) ");
      dartLand = s.nextLine();
      
      
      if (dartLand.equals("single area"))
      {
         score = score;
         
         System.out.println(nameOfPlayer+", your score is " + score);
         System.out.println("Your time is " + timeOfDart);
            }
            
      if (dartLand.equals("double ring"))
      {
         score = score *= 2.0;
         
         System.out.println(nameOfPlayer+", your score is " + score);
         System.out.println("Your time is " + timeOfDart);
            }
            
      if (dartLand.equals("triple ring"))
      {
         score = score *= 3.0;
         System.out.println(nameOfPlayer+", your score is " + score);
         System.out.println("Your time is " + timeOfDart);
            }
            
      if (dartLand.equals("outer bull"))
      {
         score = 25;
         System.out.println(nameOfPlayer+", your score is " + score);
         System.out.println("Your time is " + timeOfDart);
         }
         
      if (dartLand.equals("bull"))
      {
         score = 50;
         System.out.println(nameOfPlayer+", your score is " + score);
         System.out.println("Your time is " + timeOfDart);
         }
      
     
      
      }
     
      }