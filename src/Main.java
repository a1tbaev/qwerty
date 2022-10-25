import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("your number:");
        System.out.println(meth(input.nextInt(),  1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18));


    }
    public static boolean meth(int q, int ... w){
        boolean rr = false;
        for (int aa:w) {
            if (q == aa){
                rr = true;
            }
        }
        return rr;
    }
}