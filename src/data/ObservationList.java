package data;

import methods.ScanMethod;
import observations.Bird;
import uidata.UiMessage;

import java.util.ArrayList;
import java.util.List;

public class ObservationList {
    public List<Bird> listOfObservation = new ArrayList<>();
    int index1 = 0;

    Bird bird = new Bird();
    ScanMethod scanMethod = new ScanMethod();

    public void addObservationToList(Bird val) {
        listOfObservation.add(index1, val);
        index1++;
    }

    public void addObservationToList2(Bird val) {
        listOfObservation.add(val);
    }

    public void addObservationToList2(){
        int quantityOfObservations;
        quantityOfObservations = scanMethod.scanInteger(UiMessage.ENTER_THE_QUANTITY_OF_OBSERVATIONS);
        for(int i = 0; i<quantityOfObservations;i++) {
            enterObservationData();
            listOfObservation.add(new Bird(bird.getDate(), bird.getSpecies(), bird.getSex()));
        }
    }

    public void enterObservationData(){
        bird.setDate();
        bird.setSpecies();
        bird.setSex();
    }
}