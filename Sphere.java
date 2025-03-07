// Sphere.java
class Sphere implements Volume {
    private double radius;
    
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}