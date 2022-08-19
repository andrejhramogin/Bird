package data;

import methods.ScanMethod;
import observations.Bird;
import uidata.UiMessage;

import java.util.ArrayList;
import java.util.List;

public class ObservationList   {

    public int index1 = 0;
    public List<Bird> listOfObservation = new ArrayList<>();
    Bird bird = new Bird();
    ScanMethod scanMethod = new ScanMethod();

    public void addToList(Bird val) {
        listOfObservation.add(val);
    }

    public void addToList(){
        int quantityOfObservations;
        quantityOfObservations = scanMethod.scanInteger(UiMessage.ENTER_THE_QUANTITY_OF_OBSERVATIONS);
        for(int i = 0; i<quantityOfObservations;i++) {
            enterData();
            addToList(new Bird(bird.getDate(), bird.getSpecies(), bird.getSex()));
        }
    }

    public void enterData(){
        bird.setDate();
        bird.setSpecies();
        bird.setSex();
    }

    public void addObservationToList(Bird val) {
        listOfObservation.add(index1, val);
        index1++;
    }
}