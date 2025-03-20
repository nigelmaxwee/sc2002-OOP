class Sphere {
    private Circle base; 
    public Sphere(double radius) {
        this.base = new Circle(radius);
    }

    public double calculateSurfaceArea() { 
        return 4 * base.calculateArea();
    }
}
