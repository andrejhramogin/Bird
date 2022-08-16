import java.util.Scanner;

public class Methods {

    private final Scanner SCAN = new Scanner(System.in);

    public void printMessage(String msg){
        System.out.println(msg);
    }

    public String scanString(){
         return SCAN.nextLine();
    }

    public Integer scanInteger(){
        int i;
        i = SCAN.nextInt();
        SCAN.nextLine();
        return i;
    }
}
