package aula01;

public class Aula01 {
    /*
    * A method is a subprogram which is used to do a specifc task.
    *
    * int areaRect (int length, int breadth){
    *
        * int area;
        * area = length * breadth;
        * return area;
    *
    * }
    *
    * */
   // public  int length;
   // public  int breadth;

    public static void main(String[] args) {
        Method method = new Method();
        int calc = method.areaRect(10, 50);
        System.out.println(calc);
       // method.areaRect(10, 50);
    }
}
