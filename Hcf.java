import java.util.Scanner;

class Hcf{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Boolean flag = true;
        String temp;
        telephone [] emp = new telephone[10];
        System.out.println("How many emp are there");
        int n = s.nextInt();
        System.out.println("___Enter name and phone ");
        String n_t, ph_t,key;
        for(int i= 0; i<n;i++){
            System.out.println("Name and phone of emp "+(i+1));
            n_t = s.next();
            ph_t = s.next();
            emp[i] = new telephone(n_t,ph_t);
        }
        System.out.println("Enter the name to search in list ");
        key = s.next();
        temp = ".*"+key+".*";
        for(int i=0;i<n;i++){
            if( emp[i].name.matches(temp))
            {
                emp[i].display();
                flag =false;
            }
        }
        if (flag){
            System.out.println(key+" is not present in the list");
        }
    }
}