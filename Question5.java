import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an integer:");
    int integer = in.nextInt();
    ArrayList<Integer>number_set = new ArrayList<Integer>();
    Integer[] array = {};
    System.out.println(integer);
    for(int i = 0; i < integer; i++)
    {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an integer:");
      int set = input.nextInt();
      number_set.add(set);
      }
    array = number_set.toArray(array);
    int maxCount = 0, maxValue = 0;
    for(int i = 1; i<array.length; i++)
    {
      int count = 0;
      for(int j = 1; j<array.length; j++)
      {
        if(array[j] == array[i]) count++;
        if(count>maxCount){
          maxCount = count;
          maxValue = array[i];
        }
      }
    }
    System.out.print(maxValue);
    
  }
}
