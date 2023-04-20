import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
      Scanner reader = new Scanner (System.in);
      System.out.println("Enter your height:");
      double height = reader.nextDouble();
      System.out.println("Enter your weight:");
      double weight = reader.nextDouble();
      double bmi = (weight/((height * height)));
      System.out.printf("Your Bmi is: %f%n", bmi);
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
  }
}
