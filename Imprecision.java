
/**
 * Program to show Imprecision.
 * @author Kathleen Kim, kkim001@student.sdccd.edu
 * @version v1.0
 * @since 9/12/2025
 */
public class Imprecision{
 public static void main (String [ ] args){
    double x = 12345.6789e200, y, z;
    y=1/x;
    z=x*y;

    System.out.println("The value of x is: " + x);
    System.out.println("The value of y is: " + y);
    System.out.println("The value of z is: " + z);
    System.out.println("The value of 1-z is: " + (1-z));
}
}