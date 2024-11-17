import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args) {
        Number();

    }
    static void Number(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number");
        int num=sc.nextInt();

        if (num<0){
            System.out.println("The enter number is negative");
        }else{
            System.out.println("Entered number is positive");
        }
    }
}