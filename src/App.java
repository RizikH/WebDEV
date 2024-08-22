import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int x , y = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 whole numbers that when added equal 10!!");

        x = in.nextInt();
        y = in.nextInt();

        boolean answer = x + y == 10? true:false;

        System.out.println(answer == true? "Correct" : "Wrong");
    }
}
