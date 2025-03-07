// EquilateralPyramid.java
class EquilateralPyramid implements Volume {
    private double base, height;
    
    public EquilateralPyramid(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double calculateVolume() {
        return (1.0 / 3) * Math.pow(base, 2) * height;
    }
}