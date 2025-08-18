package aula10;

public class Continuee {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            if(i==5){
                i++;
                System.out.println(i);
                continue;

            }
            System.out.println(i);
            i++;
        }
    }
}
