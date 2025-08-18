package aula10;

import java.util.Scanner;

public class FactorialChallenger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
      int sumTotal=0;
      int factorial  = 1;
      for(int i=1; i<=n;i++){
          factorial*=i;
          //System.out.println(i);
          System.out.println(factorial);
      }

        System.out.println(factorial);
    }
}
