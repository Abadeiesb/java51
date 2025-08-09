package Aula07;

public class prePost {

    public static void main(String[] args) {
//         pre
        int x = 5;

        int y = ++x;
        System.out.println(x);
        System.out.println(y);

        //post

        int s = 5;
        int t = x++;

        System.out.println(s);
        System.out.println(t);


    }
}
