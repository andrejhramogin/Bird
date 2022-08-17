public class BirdObservation {

    PrintMethods printMethods = new PrintMethods();
    ObservationArray observationArray = new ObservationArray();
    ObservationList observationList = new ObservationList();

    public void birdObservArray(){
        observationArray.addObservationToArray();
        printMethods.printObservationArray(observationArray.observationsArray);
    }

    public void birdObserv2(Bird[]arr){// Почему не работает? NullPointerException
        observationArray.addObservationToArray();
        printMethods.printObservationArray(arr);
    }

    public void birdObservList(){
        observationList.addObservationToList2();
        printMethods.printObservationList(observationList.listOfObservation);
    }
}
