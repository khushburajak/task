//Write a function to add 2 numbers.
import java.util.Scanner;

public class CalculateSum{
    public static double Sum(double a,double b){
       double sum=a+b;
            return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a first number: ");
        double num1=sc.nextDouble();
        System.out.println("Enter a second number: ");
        double num2=sc.nextDouble();
       double s= Sum(num1,num2);
       System.out.println("The sum of "+num1+" and "+num2+ " is "+s);


    }
}