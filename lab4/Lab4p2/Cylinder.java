class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * Math.PI * base.getRadius() * height + 2 * base.calculateArea();
    }
}
