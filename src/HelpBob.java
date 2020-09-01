import java.util.Scanner;

public class HelpBob {
    public static void main(String[] args) {
       long phoneNumber;

       String areaCode;
       String firstThree;
       String lastFour;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your phone number: ");
        phoneNumber = scanner.nextLong();
        System.out.println("unformatted: " + phoneNumber);

        System.out.println("to format follow the next steps :)");
        System.out.println("enter your area code: ");
        areaCode = scanner.next();

        System.out.println("enter the first 3 digits: ");
        firstThree = scanner.next();

        System.out.println("enter the last 4 digits: ");
        lastFour = scanner.next();

        System.out.println("formatted Phone number:  " + "(" + areaCode + ")" + " " + firstThree + " - " + lastFour);
    }
}
