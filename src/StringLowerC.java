/** Write a Java program to convert a given string into lowercase.
 Sample Output:
 Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 the quick brown fox jumps over the lazy dog.

 * Created by JANVI on 24/08/2019.
 */
import java.util.Scanner;
import java.util.stream.Collector;

public class StringLowerC {
    public static void main (String[]args ){
        System.out.println("Enter the String::");

        call();                                             //static to static come straight
    }

    public static void call(){
        Scanner scanner=new Scanner(System.in);        //object created for scanner
        String line=scanner.nextLine();
        line=line.toLowerCase();                       //syntext for lowercase
        //  line = Character.toUpperCase(line.charAt(0));

        System.out.println(line);

        //


    }
}
