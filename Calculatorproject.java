import java.util.Scanner;

public class Calculatorproject {

   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      String equation;


   System.out.println("What equation would you like to use? Force Equation, Velocity Equation, or Weight Equation?: ");
   equation = s.nextLine();

   if (equation.equals("Force Equation"))
   
   {
   System.out.println("What is the mass? ");
   double mass = s.nextDouble();
   
   System.out.println("What is the acceleration? ");'
   double acceleration = s.nextDouble();
   
   Double force; 
   force = mass * acceleration;
   
   System.out.println("Your force is " + force);
   }   

 
   if (equation.equals("Velocity Equation"))
 
 {
   System.out.println("What is Δx? ");
   double displacement = s.nextDouble();
   
   System.out.println("What is the Δt? ");
   double changeInTime = s.nextDouble();
   
   Double velocity; 
   velocity = displacement * changeInTime;
   
   System.out.println("Your velocity is " + velocity);

}
}
}