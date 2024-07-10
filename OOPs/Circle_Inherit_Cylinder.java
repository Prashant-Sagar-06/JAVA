package OOPs;

class Circle{
    int radii;
    public void radius( int radii){
        System.out.println("THe radius is : " + radii);
    }
    public void area(int radii){
        System.out.println("The area of circle  is : " + 3.14*radii*radii);
    }
}
class Cylinder extends Circle{
    int height;
    public void area(int radii ,int height){
        System.out.println("The area of Cylinder is : " + 3.14*radii*radii*height);
    }
    public void volume(int radii, int height){
        System.out.println("Volume of cylinder is : " + 2*3.24*radii*height);
    }
}

public class Circle_Inherit_Cylinder {
    public static void main(String[] args) {
        Circle rad = new Circle();
        rad.radius(4);
        rad.area(4);
        Cylinder cy = new Cylinder();
        cy.radius(8);
        cy.area(8,8);
        cy.volume(8,8);
    }
}