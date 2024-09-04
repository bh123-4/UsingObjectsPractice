public class RectangleRunner {

    public static void main(String[] args) throws Exception {
        Rectangle R1 = new Rectangle();
        System.out.println(R1.toString());
        
        // TODO 1 Instantiate a rectangle with 10x10 dimensions
        
        // TODO 2 print info about the rectangle

        
        // TODO 3 Instantiate a rectangle with w=4 and h=8
        Rectangle R2 = new Rectangle(4, 8);
        // TODO 4 print info about the 2nd rectangle
        System.out.println(R2);

        // TODO 5 create a 3rd rectangle with a w=8 and h=10
        Rectangle R3 = new Rectangle(2, 10);
        // TODO 6 print the 3rd rectangles information
        System.out.println(R3);

        // TODO 7 Modify the `toString` in the Rectangle Class to include the area
        // This will update all of the print statements above.

        // TODO 8 Use the setter method to change the 1st rectangle's width to a random 
        // integer value between 5 and 10.
        int newWidth = (int)(Math .random() * 6 + 5);
        R1.setWidth(newWidth);
        // TODO 8b print a single line of code that says "Rectangle 1 width is: <width>"
        // where <width> is the new width that was just assigned. You need to use a getter method.
        System.out.println( "Rectangle 1 width is: " + R1.getWidth());
        // TODO 9a Use the setter method to change the 2nd rectangle's height to a random 
        // integer value between 5 and 10.
        int newHeight = (int)(Math .random() * 6 + 5);
        R2.setHeight(newHeight);
        // TODO 9b print a single line of code that says "Rectangle 2 ht is: <height>"
        // where <height> is the new height that was just assigned. You need to use a getter method.
        System.out.println( "Rectangle 2 height is: " + R2.getHeight());
        // TODO 10 Use the setter method to change the 3rd rectangle's width and height to random 
        // integer values between 5 and 10.
        int newHeight2 = (int)(Math .random() * 6 + 5);
        R3.setHeight(newHeight2);
        int newWidth2 = (int)(Math .random() * 6 + 5);
        R3.setWidth(newWidth2);

        // TODO 11 Reprint all rectangle information (in order of how they were created 1st, 2nd, 3rd)
        System.out.print( "Rectangle 3's height is: " + R3.getHeight() + " and ");
        System.out.println( "Rectangle 3's width is: " + R3.getWidth());


        
        // TODO 12 Reprint all rectangle information (in order from smallest to largest)
        // Note, this might not be easy...
        

    }
}
