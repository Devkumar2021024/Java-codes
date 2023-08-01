// import java.util.*;

// abstract class Shape {
//     float area;

//     abstract public void Input();

//     abstract public void compute();

//     public void Display() {
//         System.out.println("Area is : " + area);
//     }
// }

// class Rectangle extends Shape {
//     float length;
//     float breadth;

//     public void Input() {
//         System.out.println("Calculation of Rectangle area : ");
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the length of the reactangle : ");
//         length = sc.nextFloat();
//         System.out.print("Enter the breadth of the reactangle : ");
//         breadth = sc.nextFloat();

//     }

//     public void compute() {
//         area = length * breadth;
//     }

// }

// class Square extends Shape {
//     float length;

//     public void Input() {
//         System.out.println("Calculation of Square area : ");
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the length of the Square : ");
//         length = sc.nextFloat();
//     }

//     public void compute() {
//         area = length * length;
//     }

// }

// class Circle extends Shape {
//     float radius;

//     public void Input() {
//         System.out.println("Calculation of Circle area : ");
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the raduis of the circle : ");
//         radius = sc.nextFloat();
//     }

//     public void compute() {
//         area = (float) (radius * (3.14) * radius);
//     }

// }

// class Geometry {
//     public void show(Shape s) {
//         s.Input();
//         s.compute();
//         s.Display();
//     }
// }

// public class Application {
//     public static void main(String[] args) {
//         Rectangle r = new Rectangle();
//         Square s = new Square();
//         Circle c = new Circle();

//         Geometry g = new Geometry();
//         g.show(r);
//         g.show(s);
//         g.show(c);

//     }
// }
