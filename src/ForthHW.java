/*** class AreaOfIsoscelesTriangle
 [ B/4√((4*a*a)-(b*b)) ]

 * Created by JANVI on 30/08/2019.
 */
import java.util.*;
public class ForthHW {
    double len; double side;
    public static void main(String[] args){

        ForthHW wf=new ForthHW();              //created an object for method
        wf.obj();                                    ////call instance in static method to execute

    }
    public void obj(){
        Scanner sr=new Scanner(System.in);           //created an object for scanner
        System.out.println("Enter the lenght of same sided::");
        double len=sr.nextDouble();

        System.out.println("Enter the side2 of the Triangle::");
        double side=sr.nextDouble();

        double area=(side/4)*Math.sqrt((4*len*len)-(side*side));  //formula
        System.out.println("Area of Isosceles Triangle is:"+ area);
    }


}











