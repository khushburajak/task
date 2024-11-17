import java.util.Scanner;

public class Ascii {
    static void asci(char a){
            System.out.println("The ascii num is "+(int)a );
    
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter character:");
            char a=sc.next().charAt(0);
            
            asci(a);
    }
}
