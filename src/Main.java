// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle2x3=new Rectangle(2,3);
        Rectangle rectangle4x5=new Rectangle(4,5);

        System.out.println("Area of Rectangle1 :"+rectangle2x3.calculateArea());
        System.out.println("Circumference of Rectangle1 :" +rectangle2x3.calculatePerimeter());
        System.out.println("Area of Rectangle2 :" +rectangle4x5.calculateArea());
        System.out.println("Circumference of Rectangle2 :" +rectangle4x5.calculatePerimeter());

    }
}
class Rectangle{
    double Length,Breadth;
    public Rectangle(double Length,double Breadth){
        this.Length=Length;
        this.Breadth=Breadth;
    }
    double calculateArea(){
        return Length*Breadth;
    }

    double calculatePerimeter(){
        return 2*(Length+Breadth);
    }
}