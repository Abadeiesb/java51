package Aula07;

public class Sample {
    //Default values are applicable only to the data members(declared within a class not for local variables (declared within a method)
    int m; //data menber
    String s;
    void xxx(){
        int n;// local variable
        //System.out.println(n);// local variable n should be initialized

    }

    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s.m);
       // System.out.println(s.xxx());

        //String b;
        System.out.println(s.s);

    }


}
