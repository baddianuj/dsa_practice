package introduction.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes triangle = new Triangle(); // checking  at runtime what to call


        shapes.area();
         circle.area();
         square.area();
         triangle.area();


    }
}
