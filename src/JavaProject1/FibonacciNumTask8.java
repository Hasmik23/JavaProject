package JavaProject1;

public class FibonacciNumTask8 {

    public static void main(String[] args) {

        /*Write a Java Program to print the first 10 numbers of Fibonacci series.*/
        int n=500;
        int a=0;
        int b=1;
        int sum=0;

        for (int i=2;i<=200;i++){
            System.out.println("sum = "+sum);
            sum=a+b;
            a=b;
            b=sum;
        }


    }
}


