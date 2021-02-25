import java.util.Scanner;

public class Null {
    static int f(int a, int b){
        if(a>b+1) return 10;
        if(a==0 || b==0) return 1;
        return f(a,b-1)+f(a-1,b-1);
    }







    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        Scanner in2= new Scanner(System.in);
        int b=in2.nextInt();
        System.out.println(f(a,b));
    }
}
