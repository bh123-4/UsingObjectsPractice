public class CircleRunner {
        public static void main(String[] args) throws Exception {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(40);
        Circle c3 = new Circle(100);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c2 = c1;

        c3.setRadius(c1.getRadius());
        System.out.println("\nAfter the change");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
         
        System.out.println("C1 is equal to C2: " + (c1 == c2));
        System.out.println("C2 is equal to C3: " + (c2 == c3));
        System.out.println("C1 is equal to C3: " + (c1 == c3));
    }
   
}


