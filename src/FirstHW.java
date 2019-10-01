/**
 * *Write a Java program to convert seconds to hour, minute and seconds.
 * Sample Output:
 Input seconds: 86399
 23:59:59
 * Created by JANVI on 24/08/2019.
 */
import java.util.Scanner;
public class FirstHW {
    public static void main(String[] args) {
        System.out.println("Enter Input ::");
        FirstHW wf = new FirstHW();               //created object for class
        wf.call();


    }

    public void call() {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();             //cretaed object for scanner
        int a = seconds % 60;
        int b = seconds / 60;
        int c = b % 60;
        b = b / 60;
        System.out.println(b + ":" + ":" + c + ":" + ":" + a);
        System.out.println("\n");
    }

}