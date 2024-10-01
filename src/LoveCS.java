import java.util.Scanner;
// 4/5 no sum
public class LoveCS
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int LIMIT = input.nextInt();

    int count = 1;

    while (count <= LIMIT)
    {
      System.out.println(count + " I love Computer Science!!" );
      count++;
    } 
  }
}
