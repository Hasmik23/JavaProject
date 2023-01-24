package JavaProject1;

public class primeNumTask7 {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scan.nextInt();

        if (number%2==0) {
            System.out.println("The number you entered is a Prime number");
        }else
            System.out.println("The number you entered is not a prime number");
    }
}

