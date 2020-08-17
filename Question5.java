/*class complex {
    double real, img;

    complex(double r, double i) {
        this.real = r;
        this.img = i;
    }
}
    public complex sum(complex c1, complex c2){
        complex temp=new complex(0,0);
        temp.real=c1.real+c2.real;
        temp.img=c1.img+c2.img;
        System.out.println("Sum: "+temp);
    }
    */


import java.util.Scanner;

class ComplexNumber
{
    private final double real;
    private final double imaginary;
    public ComplexNumber(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
public ComplexNumber sum(ComplexNumber other)
    {
        double r = this.real + other.real;
        double i = this.imaginary + other.imaginary;
        return new ComplexNumber(r, i);
    }
public ComplexNumber difference(ComplexNumber other)
{
    double r = this.real - other.real;
    double i = this.imaginary - other.imaginary;
    return new ComplexNumber(r, i);
}
public ComplexNumber product(ComplexNumber other)
{
        double r = this.real * other.real;
        double i = this.imaginary * other.imaginary;
        return new ComplexNumber(r, i);
}
    @Override
    public String toString()
    {
        return real + " + " + imaginary + "i";
    }
}
public class Question5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int real1=sc.nextInt();
        int imaginary1=sc.nextInt();
        int real2=sc.nextInt();
        int imaginary2=sc.nextInt();

        ComplexNumber c1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber c2 = new ComplexNumber(real2, imaginary2);
        ComplexNumber sum = c1.sum(c2);
        ComplexNumber difference = c1.difference(c2);
        ComplexNumber product = c1.product(c2);
        System.out.println("first complex number: " + c1);
        System.out.println("second complex number: " + c2);
        System.out.println("sum of two complex numbers: " + sum);
        System.out.println("difference of two complex numbers: " + difference);
        System.out.println("product of two complex numbers: " + product);
    }
}