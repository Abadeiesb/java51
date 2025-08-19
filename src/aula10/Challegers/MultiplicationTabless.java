package aula10.Challegers;

public class MultiplicationTabless {
    public static void main(String[] args) {
        int total =0;
        for(int i=1;i<=10; i++){
            System.out.println("Table "+i);
            for(int j=1;j<=10;j++){
                total= i*j;
                System.out.println(i+" x "+ j+ " = "+total);
            }
        }

    }
}
