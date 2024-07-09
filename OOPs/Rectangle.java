package OOPs;

class Rect {
    private int length;
    private int breadth;
    private int area;
    private int perimeter;

    public Rect() {
        // Default constructor
    }

    public Rect(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rect(int length, int breadth, int area, int perimeter) {
        this.length = length;
        this.breadth = breadth;
        this.area = area;
        this.perimeter = perimeter;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    // Getters and setters...

}

public class Rectangle {
    public static void main(String[] args) {
        Rect rect1 = new Rect(); // Using default constructor
        Rect rect2 = new Rect(5, 10); // Using constructor with length and breadth
        Rect rect3 = new Rect(5, 10, 50, 30); // Using constructor with all parameters

        System.out.println("Rectangle 1 - Length: " + rect1.getLength() + ", Breadth: " + rect1.getBreadth());
        System.out.println("Rectangle 2 - Length: " + rect2.getLength() + ", Breadth: " + rect2.getBreadth());
        System.out.println("Rectangle 3 - Length: " + rect3.getLength() + ", Breadth: " + rect3.getBreadth());
        System.out.println("Rectangle 3 - Area: " + rect3.getArea() + ", Perimeter: " + rect3.getPerimeter());
    }
}