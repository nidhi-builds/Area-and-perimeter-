// Shape.java
abstract class Shape {
    protected String shapeName;
    
    public Shape(String shape) {
        this.shapeName = shape;
    }
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}