import java.util.Scanner;
class Decimal_hexadecimal_octal_to_binary{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  b = s.nextInt();
        String temp;
        System.out.println("Octal : "+Integer.toOctalString(b));
        System.out.println("Binary : "+Integer.toBinaryString(b));
        System.out.println("HexaDecimal : "+Integer.toHexString(b));

        System.out.println("Binary to decimal");
        temp = s.next();
        System.out.println("Decimal : "+ Integer.parseInt(temp,2));
               
        System.out.println("Octal to decimal");
        temp = s.next();
        System.out.println("Octal : "+ Integer.parseInt(temp,8));

        System.out.println("Hexadecimal to decimal");
        temp = s.next();
        System.out.println("DHexadecimal : "+ Integer.parseInt(temp,16));
    }
}