
public class Command_line {
    public static void main(String args[]) {
        try{
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);   
            int c = n1 + n2;
            System.out.println("Sum of "+n1+" and "+n2+" is "+c);
        }
        catch (Exception e){
            System.out.println("Please enter two integer");
        }
    }
}
