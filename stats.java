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
                        System.out.println("Hilarious");
                    break;
                case 2:
                        System.out.println("Just placeholder text");
                    break;
                default:
                        System.out.print("Oops! That wasn't an option. Please renter");

            }
        }    
    }
}