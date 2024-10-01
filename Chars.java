import java.util.Scanner;
public class Chars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string of characters");
        String chars = input.nextLine();
        for(int a = 0; a <= chars.length() - 1; a++){
            String sub = chars.substring(a ,a + 1);
            System.out.println(sub);
        }

    }
}
