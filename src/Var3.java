import java.util.Scanner;


public class Var3 {
    static void func(int a){
        if(a==0) return;
        func(a/10);
        int k=a%10;
        System.out.println(k+ " ");
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        func(a);

    }
}
