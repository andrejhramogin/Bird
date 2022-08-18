import methods.SortMethod;
import observations.Bird;
import observations.BirdObservation;
import uidata.Place;
import uidata.Species;

import java.time.LocalDate;

public class BirdMain {
    public static void main(String[] args) {

        BirdObservation birdObservation = new BirdObservation();
        SortMethod sortMethod = new SortMethod();


//        birdObservation.birdObservArray();
        birdObservation.birdObservList();



    }
}
