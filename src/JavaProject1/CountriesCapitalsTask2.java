package JavaProject1;

public class CountriesCapitalsTask2 {

    public static void main(String[] args) {
        /*Using Scanner create an array of countries. When an array is created, retrieve all values from it and while
        retrieving those values print capital for each country. (use 2 different loops).*/


        System.out.println("Please enter Countries");
        String[] countries={"Nigeria","Luxembourg","Switzerland","France"}; // collection of objects of type string
        String[] capitals=new String[4]; // empty String array , which has ability to hold 4 String type
        capitals[0]="Abuja";
        capitals[1]="Luxembourg";
        capitals[2]="Bern";
        capitals[3]="Paris"; // 4-1 = 3
        int count =0;
        for(String x: countries){ // countires has 4 entry and one by one the value goes to x
            //count =count ;
            int j = count;
            System.out.print("The capital of "+x);
            System.out.println("Count is :: "+count);
            for(int i =j ;i<capitals.length;i++) {
                if(i<=j) {   // 1st  i =0 , j =0 // 2nd i =1 , j =1 // 3rd i =3, j =3
                    System.out.println(" is "+capitals[i]);
                    break;
                }
            }
            count++;
            /*
             * for(String y: capitals1){ // count ++; System.out.println(" is "+y); //
             * Nigeria and Abuja if(count==1) { } break; }
             */
        }
        System.out.println();
    }
}




}
