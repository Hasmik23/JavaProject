package JavaProject1;

public class MaxMinTask9 {

    public static void main(String[] args) {

        int[] num={20,50,40,70,80,};

        int max=num[0];
        int min=num[0];

        for (int i=1;i<num.length;i++){
            if (num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Maximum number is "+max);
        System.out.println();
        System.out.println("Minimum number is "+min);
    }
}



