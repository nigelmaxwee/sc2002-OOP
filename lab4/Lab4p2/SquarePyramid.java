class SquarePyramid {
    private Rectangle base;
    private Triangle side1, side2, side3, side4;

    public SquarePyramid(double baseLength, double slantHeight) {
        this.base = new Rectangle(baseLength, baseLength); 
        this.side1 = new Triangle(baseLength, slantHeight);
        this.side2 = new Triangle(baseLength, slantHeight);
        this.side3 = new Triangle(baseLength, slantHeight);
        this.side4 = new Triangle(baseLength, slantHeight);
    }

    public double calculateSurfaceArea() {
        return base.calculateArea() + side1.calculateArea() + side2.calculateArea() + side3.calculateArea() + side4.calculateArea();
    }
}
