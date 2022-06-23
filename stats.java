import java.util.Scanner;

public class stats {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int checker;
        while(5 < 6) {

            System.out.println("Welcome to Zeb's Formulas!\n Here we have built multiple modules that will run quick as easy calculations on your needless and extensive (and probably teacher given) data.\n You will be presented with options below. Please enter the number corresponding to the option you so desire! \n");
            System.out.println("1. Basic Mean Median and Mode Calculations");
            System.out.println("2. Nothing Yet");

            checker = scnr.nextInt();

            switch(checker) {
                case 1:
                        calcBasic(scnr);
                        System.out.println("Hilarious\n");
                    break;
                case 2:
                        System.out.println("Just placeholder text\n");
                    break;
                default:
                        System.out.println("Oops! That wasn't an option. Please renter\n");

            }
        }    
    }

    public static void calcBasic(Scanner scnr) {
            double mean;
            double median;
            double mode;

            String str = scnr.nextLine();
            String[] arrOfStr = str.split(",");
            int[] numbers = new int[str.length()];

            for(int i = 0; i < arrOfStr.length; i++) {
                numbers[i] = Integer.parseInt(arrOfStr[i]);
                System.out.print("hi");
            }


    }
}