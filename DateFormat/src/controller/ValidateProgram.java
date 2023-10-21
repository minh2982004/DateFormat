
package controller;

import common.Algorithm;
import view.Menu;


public class ValidateProgram extends Menu<String>{
    static String[] options = {"Check phone number", "Check email", "Check date", "Exit"};
    Algorithm ar;
    public ValidateProgram() {
        super("===== VALIDATE PROGRAM =====", options);
        ar = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1: ar.checkPhoneNumber();
            break;
            case 2: ar.checkEmail();
            break;
            case 3: ar.checkDate();
            break;
            case 4: System.exit(0);
            break;
        }
    }
}