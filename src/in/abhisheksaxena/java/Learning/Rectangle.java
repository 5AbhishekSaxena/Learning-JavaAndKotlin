package in.abhisheksaxena.java.Learning;

/**
 * @author Abhishek Saxena
 * @since 01/08/19 1:27 AM
 */

class Rectangle implements ShapeInterface {
    private int x, y;

    private Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.area();
    }

    @Override
    public void display() {
        System.out.println("Dimensions: " + x + "  " + y);
    }

    @Override
    public void area() {
        System.out.println("Area: " + x * y);
    }
}
