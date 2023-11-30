class Circle {
    public Circle(float r){
        System.out.println("Circle area is : " + (3.14*r*r));
    }
}

class Rectangle {
    public Rectangle(int h, int b){
        System.out.println("Rectangle area is: " + (h*b));
    }
}

class Square {
    public Square(int h){
        System.out.println("Rectangle area is: " + (h*h));
    }
}



public class Pconstructor {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        Rectangle r = new Rectangle(2, 3);
        Square s = new Square(2);
    }
}
