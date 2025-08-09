package Aula07;

public class Castings {
    //Implicit Casting
    //Explicit Casting

    //Iplicit Casting
    //Converting from lower data type into higher data type

    int n = 100;
    long x = n;
    //ex 2
    byte b = 35;
    double d = b;
    //ex 3
    char c = 'A';
    char h = c;
    long s = 100;

    //Explicit Casting
    //Converting a higher data type into a lower data type;
    int v = (int)s;
    public static void main(String[] args) {
        Castings casting = new Castings();
        Long z = casting.x;
       double d = casting.b;
       char c = casting.h;
       int k = casting.v;
        System.out.println();
    }
}
