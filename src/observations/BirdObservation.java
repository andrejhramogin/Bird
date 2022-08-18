package observations;

import data.ObservationArray;
import data.ObservationList;
import methods.PrintArray;
import methods.PrintList;
import methods.ScanMethod;
import methods.SortMethod;

public class BirdObservation {

    PrintList printList = new PrintList();
    PrintArray printArray = new PrintArray();
    SortMethod sortMethod = new SortMethod();
    ObservationArray observationArray = new ObservationArray();
    ObservationList observationList = new ObservationList();
    ScanMethod scanMethod = new ScanMethod();

    public void birdObservArray(){
        observationArray.addObservationToArray();
        printArray.printSome(observationArray.observationsArray);
        scanMethod.SCAN.close();
    }

    public void birdObservList(){
        observationList.addObservationToList2();
        printList.printSome(observationList.listOfObservation);
        sortMethod.sortList(observationList.listOfObservation, "sw");

        scanMethod.SCAN.close();
    }
}
