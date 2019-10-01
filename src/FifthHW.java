/**
 * Created by JANVI on 01/09/2019.
 */
import java.util.Scanner;
public class FifthHW {

    public static void main(String[] args){
        FifthHW fh=new FifthHW();      //object created
        fh.obj();                       //calling object

    }
    public void obj(){               //created  instance method

        Scanner scanner=new Scanner(System.in);  //object created for scanner
        System.out.println("Enter the Radius:");
        double radius=scanner.nextDouble();

        System.out.println("Enter the Height:");
        double height=scanner.nextDouble();
        double sur=(6.28*radius*radius)+(6.28*radius*height);
        System.out.println("Total Surface Area of Cylinder is:"+sur);
    }
}
