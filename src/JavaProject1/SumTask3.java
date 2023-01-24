package JavaProject1;

public class SumTask3 {

    public static void main(String[] args) {

        /*Create a 2D array of integer values. Print the sum of all numbers.*/

        int[][] values = {{1, 2, 3, 4,}, {5, 6, 7, 8}};


        int sum = 0;


        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                sum = sum + values[i][j];
            }

        }
        System.out.println(sum);
    }
}

