import java.util.Scanner;

public class Table {   
    static void table0f10(int a){
            for(int i=1;i<=10;i++){
                System.out.println(a+" * "+i+" = "+(a*i));
            }
            return;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Table of: ");
            int num=sc.nextInt();
            table0f10(num);

    }
}
