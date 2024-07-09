package OOPs;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

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
}

public class Construct_Cylinder {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(67, 73);
        System.out.println("The radius of Cylinder is : " + cylinder.getRadius());
        System.out.println("The radius of Cylinder is : " + cylinder.getHeight());
    }
}