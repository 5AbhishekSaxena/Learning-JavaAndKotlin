package tech.developingdeveloper.java.Learning;

/**
 * @author Abhishek Saxena
 * @since 01/08/19 1:21 AM
 */

abstract class Shape {

    private String objectName = "";

    public Shape(String objectName) {
        this.objectName = objectName;
    }

    protected void move(int x, int y){
        System.out.println("The object " + objectName + " has been moved from " + x + " to " + y );
    }

    protected abstract void area();

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}
