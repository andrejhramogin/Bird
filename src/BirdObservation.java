public class BirdObservation {

    ObservationArray observationArray = new ObservationArray();
    ObservationList observationList = new ObservationList();

    public void birdObservArray(){
        observationArray.addObservationToArray();
        observationArray.printObservationArray(observationArray.observationsArray);
    }

    public void birdObserv2(Bird[]arr){// Почему не работает? NullPointerException
        observationArray.addObservationToArray();
        observationArray.printObservationArray(arr);
    }

    public void birdObservList(){
        observationList.addObservationToList2();
        observationList.printObservationList(observationList.listOfObservation);
    }
}
