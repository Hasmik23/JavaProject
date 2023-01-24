package JavaProject1;

public class DupElementsTask11 {
    public static void main(String[] args) {

        //Write a program to print out duplicate elements from an Array of Strings

        String[] dupl = {"apple", "orange", "Banan", "apple", "blueberry"};

        for (int i = 0; i < dupl.length; i++) {
            for (int j = i + 1; j < dupl.length; j++) {
                if (dupl[i].equals(dupl[j])) {
                    System.out.println("Duplicate element is " + dupl[i]);
                }
            }
        }
    }
}

