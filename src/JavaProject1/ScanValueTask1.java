package JavaProject1;

import java.util.Arrays;

public class ScanValueTask1 {

    public static void main(String[] args) {
        /*Using Scanner create an array of integer values. After the array is created,
                calculate the sum of all stored elements in that array.*/

            Scanner input=new Scanner(System.in);
            System.out.println("Please enter five values");

            int sum=0;
            int[] numbers=new int[5];
            for (int i=0;i<numbers.length;i++){
                numbers[i]=input.nextInt();

                sum=sum+numbers[i];
                System.out.println(Arrays.toString(numbers));
                System.out.println();
                System.out.println("sum = "+sum);

            }

            System.out.println("***********");

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the how many value you want to enter for array");
            int length = scan.nextInt();

            int sum1 = 0;

            int[] arr = new int[length];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter values "+"  ");
                arr[i] = input.nextInt();
                sum1 += arr[i];
            }
            System.out.println("The sum is " + sum1);

        }

    }



