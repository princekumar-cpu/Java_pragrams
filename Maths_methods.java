import java.math.*;
import java.util.Random;

public class Maths_methods {
    public static void main(String aStrings[]){
        double a= 56.34,b = 6.58334, c = -34.4265;
        Random r = new Random();
        System.out.println("1) Random Nummber is \t\t\t\t"+r.nextFloat());
        System.out.println("2) Absolute value of c is \t\t\t"+Math.abs(c));
        System.out.println("3) Square Root of "+a+ "is \t\t\t"+Math.sqrt(a));
        System.out.println("4) Maximum value between "+a+" and "+b+" is \t"+Math.max(a, b));        
        System.out.println("5) "+a+" power "+b+ " is \t\t\t"+Math.pow(a, b));
        System.out.println("6) Round of "+a+ " is \t\t\t\t"+Math.round(a));
        System.out.println("7) Square Root of a^2 + b^2 "+a+ "is \t\t"+Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
        System.out.println("8) Floor Value of  "+b+" and "+c+ " is \t"+Math.floor(b)+" and "+Math.floor(c));
        System.out.println("9) Ceil Value of  "+b+" and "+c+ " is \t"+Math.ceil(b)+" and "+Math.ceil(c));
        System.out.println("10) Round of  "+b+" and "+c+ " is \t\t"+Math.round(b)+" and "+Math.round(c));
        System.out.println("11) Radian value of "+a+ "is \t\t\t"+Math.toRadians(a));
        System.out.println("12) sin value of  "+a+" is \t\t\t"+Math.sin(a));
    }
}