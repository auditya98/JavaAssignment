class Circle{
    private
    double radius=1.0;
    String color="red";
    public Circle() {

    }
    public Circle(double radius) {

    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 2*3.14*radius;
    }
}
public class Question4 {
    public static void main(String[] args) {
        Circle c=new Circle();
        System.out.println("radius = "+c.getRadius());
        System.out.println("area = "+c.getArea());
    }
}