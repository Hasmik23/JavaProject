package JavaProject1;

public class SecondMaxTask10 {

    public static void main(String[] args) {

        //Write a java program to find the second largest number in the array

        int[] secMax = {1, 2, 3, 4};

        Arrays.sort(secMax);

        System.out.println("The second largest number is " + secMax[secMax.length - 2]);


        //  System.out.println("The first largest number is " + secMax[secMax.length - 1]);
    }
}

