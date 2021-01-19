/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 * <p>
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 *
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 * Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {


    public static void main(String[] args) {
       if(args.length == 2){
       int argN = 0;
       int argD = 0;
        try {
          argD = Integer.parseInt(args[0]);
          argN = Integer.parseInt(args[1]);
        } catch (Exception e)
        {
           System.out.println("The arguments you passed " + args[0] + " and " + args[1] + " are not integers");
           System.exit(1);
        }
       System.out.println(" Thank you for using this program to create your fraction. " +
               "\n Here is your Fraction " + argN + " / " + argD);
        }else{
          System.out.println("You need to add only two arguments to create this fraction. " +
                  "You have either add not enough or one to many.");
       }
    }

}