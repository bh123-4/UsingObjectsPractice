public class Main {
    public static void main(String[] args) 
    {
        for (int i = 0; i < 5; i++)
        {
            double num = MyTools.readDouble("Enter a integer: ");
            System.out.println("The number entered was: " + num);
        }
    }
    
}
