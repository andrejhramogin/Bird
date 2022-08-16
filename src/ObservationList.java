import java.util.ArrayList;
import java.util.List;

public class ObservationList {
    List<Bird> listOfObservation = new ArrayList<>();
    int index1 = 0;
    int index2 = 0;
    Bird bird = new Bird();
    Methods methods = new Methods();

    public void addObservationToList(Bird val) {
        listOfObservation.add(index1, val);
        index1++;
    }

    public void addObservationToList2(){
        int quantityOfObservations;
        System.out.println(UiMessage.ENTER_THE_QUANTITY_OF_OBSERVATIONS);
        quantityOfObservations = methods.scanInteger();
        for(int i = 0; i<quantityOfObservations;i++) {
            bird.setLocDate();
            bird.setSpecies();
            bird.setSex();
            listOfObservation.add(new Bird(bird.getLocDate(), bird.getSpecies(), bird.getSex()));
            index2++;
        }
    }

    public void printObservationList(List<Bird> list){
        for (int i =0; i<list.size();i++) {
            System.out.println(list.get(i).getLocDate() + " " + list.get(i).getSpecies() + " " +
                    list.get(i).getSex());
        }
    }

    public void printObservListByIndex(List<Bird>list, int i){
        System.out.println(list.get(i).getLocDate()+" "+list.get(i).getSpecies()+" "+
                list.get(i).getSex());
    }
}
