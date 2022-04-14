/*
Write a Java program to get n numbers from the user and display the number of
positive, negative and zeroes.
*/
import java.util.Scanner;

public class count_no_of_pos_neg_zeroes{
    public static void main(String[] args) {
        int[] num = new int[20];
        int n,pos = 0,neg = 0,zeroes=0;
        System.out.print("How many number you want enter : ");
        Scanner s =new Scanner(System.in);
        n = s.nextInt();
        System.out.print("\nEnter Number : ");
        for(int i = 0; i < n;i++)
        {
            num[i] = s.nextInt();
        }
        for(int i = 0; i < n;i++)
        {
            if(num[i] > 0)
                pos++;
            else if(num[i] < 0 )
                neg++;
            else
                zeroes++;
        }
        System.out.println("\nNumber of positive number \t: "+pos+"\nNumber of negative number \t: "+neg+"\nNumber of zeroes \t\t: "+zeroes);
    }
}