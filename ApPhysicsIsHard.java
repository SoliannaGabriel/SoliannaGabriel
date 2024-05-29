import java.util.Scanner; 

public class ApPhysicsIsHard{
 public static void main (String[]args){
      char Force = 'f';
      char Weight = 'w';
      char Velocity = 'v';
      char yes = 'a';
      char no = 'b';
      
      boolean i = true;
      
      
      Scanner x = new Scanner(System.in);
      
while (i = true){
      System.out.println("Hello, welcome to ApPhysicsIsHard, the virtual Physics Calculator!");
      System.out.println("Type the letter of the value you're solving for: ");
      System.out.println("f (Force)");
      System.out.println("w (Weight)");
      System.out.println("v (Velocity)");
      
      char choice = x.next().charAt(0);
      
      if (choice == Force){
      System.out.println("What is your mass?");
      double m = x.nextDouble();
      
      System.out.println("What is your acceleration?");
      double a = x.nextDouble();
      
      double forceValue = m * a;
      
      System.out.println("Your force = " + forceValue);
      
      
      System.out.println("Do you want to calculate something else?");
      System.out.println("type the letter of yes or no");
      System.out.println("a (yes)");
      System.out.println("b (no)");
      
      char answer = x.next().charAt(0);
      
      if(answer == no){
      break;
      }
      
      }else if (choice == Weight){
      System.out.println("What is your mass?");
      double ma = x.nextDouble();
      
      System.out.println("What is your acceleration due to gravity?");
      double g = x.nextDouble();
      
      double weightValue = ma * g;
      
      System.out.println("Your weight = " + weightValue);
      
      System.out.println("Do you want to calculate something else?");
      System.out.println("type the letter of yes or no");
      System.out.println("a (yes)");
      System.out.println("b (no)");
      
      char answer = x.next().charAt(0);
      
      if (answer == no){
      break;
      }
      
     }else if (choice == Velocity){
        System.out.println("What is your displacement?");
        double disp = x.nextDouble();
        
        System.out.println("What is your time?");
        double t = x.nextDouble();
        
        double velocityValue = disp/t;
        
        System.out.println("Your velocity = " + velocityValue);
        
        System.out.println("Do you want to calculate something else?");
        System.out.println("type the letter of yes or no");
        System.out.println("a (yes)");
        System.out.println("b (no)");
        
        char answer = x.next().charAt(0);
        
         if(answer == 'b'){
         
         break;
         }
         
         
       }
    }
    }
    }
    
   

        
      