public class Circle {
    //What fields would a Circle need?
    private double radius;

    //What constructor(s) will a Circle need?
    public Circle(double r){
        radius = r;
    }


    //What methods will a circle need?
    public double getDiameter(){
        return 2 * radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumfrence(){
        return 2 * Math.PI * radius;
    }
    

    public String toString() {
        return "circle with r= " + radius + ", d= " + getDiameter() + ", area = " + round(getArea(), 2) + " and the circufrence is: " + getCircumfrence();
     }

     public static double round(double num, int precision){
        double newNum = (num) * Math.pow(10, precision);
        newNum += 0.5;
        int rounded = (int)newNum;
        return rounded / Math.pow(10, precision);
    }

}
