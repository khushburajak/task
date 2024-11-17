// public class factorial{
//     public static void main(String[] args) {
//        int factorial=1;
//        int a=8;
//        for(int i=1;i<=a;i++){
//         factorial*=i;       
//        }
//        System.out.println("The factorial of " +a +" is "+factorial);
       

//     }

// }

public class factorial{
    int facto=1;
    int fact(int a){
        for(int i=1;i<=a;i++)
        facto*=i;
        return facto; 
    }
    public static void main(String[] args) {
        factorial fact=new factorial();
        int facto=fact.fact(5);
        System.out.println(facto);
    }
}

