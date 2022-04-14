/*
. Write a Java program to find the sum of the series:
x - x2/2! + x3/3! - x4/4! +….+ xn/n!
*/
import java.util.Scanner;
public class sum_of_series {
    public static int fac (int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }
    public static float float_round(float num,int digit) {
        int temp = 1;
        for (int i = 1; i <= digit; i++){
            temp *= 10;
        }
        num = (float)Math.round(num * temp)/((float)temp);
        return num;
    }
    public static void main(String[] args) {
        float sum = 0;
        boolean flag = true;
        System.out.print("How many terms are their in the series '1+2/2!+3/3!...n/n!' : "); 
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            if (flag){
                sum = sum + ((float)i)/((float)fac(i));
                flag = !flag;
            }
            else{
                sum = sum - ((float)i)/((float)fac(i));
                flag = !flag;
            }
        }
        // sum = (float)Math.round(sum*100)/((float)100);
        System.out.println("Sum of the serie is "+ float_round(sum, 2));
    }
}
