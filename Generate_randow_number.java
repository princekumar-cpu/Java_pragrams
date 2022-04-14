

import java.util.Random;
import java.util.Scanner;

public class Generate_randow_number {
    public static void main(String args[]) {
        Random r = new Random();
        int i;
        float f;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to generate a number   :   ");
        int x = s.nextInt();
        for(i = 0;i<5;i++){
            f = x*r.nextFloat();
            System.out.println("Random Number "+(i+1)+" is\t:\t"+f);
        }
    }
}
