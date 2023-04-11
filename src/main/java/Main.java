import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TryCatch an = new TryCatch();
        Integer[] xyz = an.creatRandom();
        Scanner ac= new Scanner(System.in);
        System.out.println("\n input a random number");
        int x= ac.nextInt();
        try {
            System.out.println(" The value of index 5: " + x + " is: " + xyz[x]);
            System.out.println(xyz[x] + " alo");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Your input out of limit index");
        }
    }
}
