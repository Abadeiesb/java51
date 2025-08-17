package aula10;

import java.util.Scanner;

public class BreakANdContinue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum=0,n=0;
        //sout("User 1");

        for(int i=1 ; i<=10;i++ ){
            sout("User 1");
            n = s.nextInt();
            sum += n;
            if (n == 0){
                break;
            }
            sout("Valor de sum:"+sum);
            //sout(n);
        }


    }

    static void sout(String text){
        System.out.println(text);
    }

           /* sout("User 1");
        int iputText1 = s.nextInt();
        sout("User 2");
        int iputText2 = s.nextInt();
        sout("User 2");
        int iputText3 = s.nextInt();
        sout("User 2");
        int iputText4 = s.nextInt();
        sout("User 2");
        int iputText5 = s.nextInt();
        sout("User 2");
        int iputText6 = s.nextInt();
        sout("User 2");
        int iputText7 = s.nextInt();
        sout("User 2");
        int iputText8 = s.nextInt();
        sout("User 2");
       int iputText9 = s.nextInt();
        sout("User 2");
        int iputText10 = s.nextInt();*/
}
