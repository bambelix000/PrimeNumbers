import java.util.Scanner;

public class Main extends IsPrime{
    public static void main(String[] args)  {
        int check;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        check = scan.nextInt();
        isPrimeNumber(check);
    }

}