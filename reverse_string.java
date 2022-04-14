import java.util.Scanner;

public class reverse_string {
    public static void main(String args[]) {
        String s, temp = "",temp1 = "";
        int i =0 ;
        System.out.println("Enter a string to reverse it");
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        for(i = s.length() - 1;i>=0;i--){
            temp += s.charAt(i);
        }
        System.out.println("Original String \t"+s+"\nReverse String \t"+temp);
    }
}
