package JavaProject1;

public class evenOddTask5 {

    public static void main(String[] args) {

          /*Create a 2D array of integers. Develop a program which will
        calculate the sum of  even and odd numbers for that array.*/

        int[][] arr = {{10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100}};
        int evensum = 0;
        int oddsum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evensum+=arr[i][j];

                } else {
                    oddsum+=arr[i][j];
                }

            }
            System.out.println("Sum of even numbers  =" + evensum);
            System.out.println("Sum of odd numbers  =" + oddsum);


        }

    }
}
