import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("enter a positive integer ");
            number = input.nextInt();

            if (number >= 0){
                break;
            } else {
                System.out.println("a positive integer is required");
            }
        }
        long factorial = 1;
        int i = 1;
        while(i <= number) {
            factorial += i;
            i++;
        }
        System.out.println("the factorial of " + number + " is " + factorial);
        
    }
}
