class Cuboid {
    private Rectangle face1, face2, face3; 

    public Cuboid(double length, double width, double height) {
        this.face1 = new Rectangle(length, width);
        this.face2 = new Rectangle(width, height);
        this.face3 = new Rectangle(height, length);
    }

    public double calculateSurfaceArea() {
        return 2 * (face1.calculateArea() + face2.calculateArea() + face3.calculateArea());
    }
}
