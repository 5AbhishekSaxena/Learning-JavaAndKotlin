package in.abhisheksaxena.java.Learning;

/**
 * @author Abhishek Saxena
 * @since 01/08/19 1:24 AM
 */

class Circle extends Shape {

    private int radius;


    private Circle(String objectName) {
        super(objectName);
    }

    @Override
    protected void area() {
        System.out.println("Area: " + (3.14*radius*radius));
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Test Circle");
        circle.radius = 5;
        circle.area();
    }
}
