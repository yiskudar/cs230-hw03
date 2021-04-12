package cs230.yiskudaryan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int method01(int a, int b)
    {
        if(b <= 0)
            return a;
        if(a < 0)
            return (b - a);
        else if(a > 0) return (b + a);
        return b;
    }

    public static String method02(int a)
    {
        if(a >= 1 && a < 15)
            return "Young Adolescent";
        else if(a >= 15 && a <= 64)
            return "Working Age";
        else if(a >= 65) return "Pensioner";
        return "";
    }

    public static char method03(int a)
    {
        if (a > 64 && a < 91)
            return (char) (a+32);
        if (a > 96 && a < 123)
            return (char) (a-32);
        else return '?';

    }

    public static boolean method04(int a)
    {
        if(a < 0)
            return false;
        else if(a >= 0 && a < 10)
            return true;
        else if(a >= 10 && a < 20)
            return false;
        else return true;
    }



}
