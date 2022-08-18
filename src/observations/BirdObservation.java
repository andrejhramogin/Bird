package observations;

import data.ObservationArray;
import data.ObservationList;
import methods.PrintMethods;
import methods.SortMethods;

public class BirdObservation {

    PrintMethods printMethods = new PrintMethods();
    SortMethods sortMethods = new SortMethods();
    ObservationArray observationArray = new ObservationArray();
    ObservationList observationList = new ObservationList();

    public void birdObservArray(){
        observationArray.addObservationToArray();
        printMethods.printObservationArray(observationArray.observationsArray);
    }

    public void birdObservList(){
        observationList.addObservationToList2();
        printMethods.printObservationList(observationList.listOfObservation);
        sortMethods.sortList(observationList.listOfObservation, "sw");
    }
}
