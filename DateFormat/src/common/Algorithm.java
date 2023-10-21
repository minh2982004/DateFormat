package common;

import java.util.Scanner;




public class Algorithm {
    Library l;
    Validation val;

    public Algorithm() {
        l = new Library();
        val = new Validation();
    }
    
    public void checkPhoneNumber() {
      Scanner scanner = new Scanner(System.in);
        String s;
        while (true) {
            System.out.print("Phone number: ");
            s = scanner.nextLine();
            
            if (s.matches("[0-9]+")) {
                if (s.length() == 10) {
                    System.out.println("Successful");
                    break;
                } else {
                    System.out.println("Phone number must be 10 digits.");
                }
            } else {
                System.out.println("Phone number must be numeric. Please enter numbers only.");
            }
        }
    }

    public void checkEmail() {
        String s = l.getString("Email: ");
        while (val.checkEmail(s) == null) {
            System.out.println("Invalid format. Please input again.");
            s = l.getString("Email: ");
        }
        System.out.println("Successful");
    }
    public void checkDate() {
        String s = l.getString("Date: ");
        while (val.checkDate(s) == null) {
            System.out.println("Invalid format (dd/mm/yyyy). Please input again.");
            s = l.getString("Date: ");
        }
        System.out.println("Successful");
    }
}
