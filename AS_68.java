//68. Exception Handling program for NullPointerException--thrown if the JVM attempts to perform
//        an operation on an Object that points to no data, or null

package College_Programs;

public class AS_68 {
    public static void main (String[] args)
    {
        String s = null;
        try
        {
            if (s.equals("Sanidhya"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException");
        }
    }

}
