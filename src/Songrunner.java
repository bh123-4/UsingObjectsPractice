import java.util.Scanner;
public class Songrunner {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        String setName = name.substring(0, 1).toLowerCase();

        if (setName.equals("a") || setName.equals("e") ||  setName.equals("i") ||  setName.equals("o") ||  setName.equals("u")){
            System.out.println( name + " " + name + " bo b" + name + " bannana fana fo f" + name + "fee fi mo M" + name + ", " + name);
        }
        else{
            System.out.println( name + " " + name + " bo b" + name.substring(1) + " bannana fana fo f" + name.substring(1) + " fee fi mo M" + name.substring(1) + ", " + name);
        }
    }
}

