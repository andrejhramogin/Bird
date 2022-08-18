package data;

import methods.ScanMethods;
import observations.Bird;
import uidata.UiMessage;

import java.util.ArrayList;
import java.util.List;

public class ObservationList {
    public List<Bird> listOfObservation = new ArrayList<>();
    int index1 = 0;
    int index2 = 0;
    Bird bird = new Bird();
    ScanMethods scanMethods = new ScanMethods();

    public void addObservationToList(Bird val) {
        listOfObservation.add(index1, val);
        index1++;
    }

    public void addObservationToList2(){
        int quantityOfObservations;
        quantityOfObservations = scanMethods.scanInteger(UiMessage.ENTER_THE_QUANTITY_OF_OBSERVATIONS);
        for(int i = 0; i<quantityOfObservations;i++) {
            enterObservationData();
            listOfObservation.add(new Bird(bird.getDate(), bird.getSpecies(), bird.getSex()));
            index2++;
        }
    }

    public void enterObservationData(){
        bird.setDate();
        bird.setSpecies();
        bird.setSex();
    }
}