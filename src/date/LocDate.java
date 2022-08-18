package date;

import java.time.LocalDate;
import methods.PrintList;
import methods.ScanMethod;
import uidata.UiMessage;

public class LocDate implements IDate {

    PrintList printList = new PrintList();
    ScanMethod scanMethod = new ScanMethod();

    @Override
    public LocalDate setDate(){
        LocalDate date;
        int year, month, dayOfTheMonth;
        printList.printMessage(UiMessage.ENTER_THE_DATE_OF_OBSERVATION);
        year = scanMethod.scanInteger(UiMessage.ENTER_THE_YEAR);
        month = scanMethod.scanInteger(UiMessage.ENTER_THE_MONTH);
        dayOfTheMonth = scanMethod.scanInteger(UiMessage.ENTER_THE_DAY);
        return LocalDate.of(year, month, dayOfTheMonth);
    }
}
