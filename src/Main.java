import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int k=in.nextInt();
        int sum = 10;
        int count=0;
        Scanner in2= new Scanner(System.in);
        int s=in2.nextInt();
        for(int i = (int) Math.pow(10,k-1); i <(int) Math.pow(10,k); i++) {
            int z=i;
            for(int j=0; j<k; j++) {
                sum += z%10;
                z/=10;
            }
            if (sum==s){
                count++;
            }
            sum=0;
        }
        System.out.println(count);
    }
}