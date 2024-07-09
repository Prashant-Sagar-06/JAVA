package OOPs;

class Cylinder {
    private int radius ;
    private int height ;
    private double volume ;
    private double surfaceArea ;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double getVolume() {
        return volume;
    }
    
    public void setVolume(double d) {
        this.volume = (int) d;
    }
    public double getSurfaceArea() {
        return surfaceArea;
    }
    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

}

public class CylinderMeasurement {
    public static void main(String[] args) {
        Cylinder shape = new Cylinder();
        shape.setHeight(90);
        shape.setRadius(10);
        shape.setVolume(3.14 * shape.getRadius() * shape.getRadius() * shape.getHeight());
        shape.setSurfaceArea(2 * 3.14 * shape.getRadius() * (shape.getRadius() + shape.getHeight()));
        System.out.println("The radius of Cylinder is: " + shape.getRadius());
        System.out.println("The height of Cylinder is: " + shape.getHeight());
        System.out.println("The surface area of Cylinder is: " + shape.getSurfaceArea());
        System.out.println("The volume of Cylinder is: " + shape.getVolume());
    }
}