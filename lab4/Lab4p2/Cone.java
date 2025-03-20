class Cone {
    private Circle base;
    private double slantHeight;

    public Cone(double radius, double slantHeight) {
        this.base = new Circle(radius);
        this.slantHeight = slantHeight;
    }

    public double calculateSurfaceArea() {
        return Math.PI * base.getRadius() * slantHeight + base.calculateArea();
    }
}
