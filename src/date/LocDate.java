package date;

import java.time.LocalDate;
import methods.PrintMethods;
import methods.ScanMethods;
import uidata.UiMessage;

public class LocDate implements Date{

    PrintMethods printMethods = new PrintMethods();
    ScanMethods scanMethods = new ScanMethods();

    @Override
    public LocalDate setDate(){
        LocalDate date;
        int year, month, dayOfTheMonth;
        printMethods.printMessage(UiMessage.ENTER_THE_DATE_OF_OBSERVATION);
        year = scanMethods.scanInteger(UiMessage.ENTER_THE_YEAR);
        month = scanMethods.scanInteger(UiMessage.ENTER_THE_MONTH);
        dayOfTheMonth = scanMethods.scanInteger(UiMessage.ENTER_THE_DAY);
        return LocalDate.of(year, month, dayOfTheMonth);
    }
}
