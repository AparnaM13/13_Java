import java.util.Scanner;

class OverloadDemo {
    void Area(float x){
        System.out.println("The area of Square is : "+(x*x));
    }

    void Area(float x,float y){
        System.out.println("The area of Rectangle is : "+(x*y));
    }

    void Area(double x){
        double z=Math.PI*x*x;
        System.out.println("The area of the Circle is : "+z);
    }
}
public class Overload {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        OverloadDemo obj=new OverloadDemo();

        float SqSide;
        float Length;
        float Breadth;
        double Radius;

        System.out.println("Enter the Side of the Square : ");
        SqSide=sc.nextFloat();
        System.out.println("Enter the Length of the Rectangle : ");
        Length=sc.nextFloat();
        System.out.println("Enter the Breadth of the Rectangle : ");
        Breadth=sc.nextFloat();
        System.out.println("Enter the Radius of the Circle : ");
        Radius=sc.nextDouble();

        obj.Area(SqSide);
        obj.Area(Length,Breadth);
        obj.Area(Radius);
    }
}