public class Circle {
    private double radius;

    public void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(7);
        System.out.println("Area: " + c.getArea());
    }
}
