package methods;

import java.util.Scanner;

public class ScanMethods {

    PrintMethods printMethods = new PrintMethods();
    public final Scanner SCAN = new Scanner(System.in);

    public String scanString(){
         return SCAN.nextLine();
    }

    public Integer scanInteger(){
        int i;
        i = SCAN.nextInt();
        SCAN.nextLine();
        return i;
    }

    public Integer scanInteger(String str){
        printMethods.printMessage(str);
        return scanInteger();
    }

    public String scanString(String str){
        printMethods.printMessage(str);
        return scanString();
    }
}
