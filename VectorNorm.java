
/**
 * Write a description of class VectorNorm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VectorNorm
{
    public static void main(String [] args)  {
       
        double magnitude = norm(2, 3, 4);
        System.out.println("The magnituge is " + magnitude);
    }
    
    public static double norm(double x, double y, double z)  {
        
        double xSquared = x * x;
        double ySquared = y * y;
        double zSquared = z * z;
        
        double magnitude = Math.sqrt(xSquared + ySquared + zSquared);
        
        return magnitude;
        
    }
}
