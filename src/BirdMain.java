import observations.Bird;
import observations.BirdObservation;
import uidata.Place;
import uidata.Species;

import java.time.LocalDate;

public class BirdMain {
    public static void main(String[] args) {

        BirdObservation birdObservation = new BirdObservation();

//        birdObservation.birdObservArray();
        birdObservation.birdObservList();


//        observations.Bird[] observation = new observations.Bird[2];
//        observation[0] = new observations.Bird(LocalDate.of(2022, 8, 16), Species.СТРИЖ_ЧЕРНЫЙ, "unknown", "adult+juv", Place.HRODNA, 20, "Высотный полет поздно вечером.");
//        observation[1] = new observations.Bird(LocalDate.of(2022, 8, 16), Species.КАНАРЕЕЧНЫЙ_ВЬЮРОК, "male", "adult", Place.HRODNA, 1, "Поющий самец.");
//
//        for (observations.Bird value : observation) {
//            System.out.println(value.getDate() + ", " + value.getSpecies() + "; " + value.getSex() + ", " + value.getAge() + ", " +
//                    value.getObservationPlace() + ", " + value.getQuantity() + ", " + value.getComment());
//        }
    }
}
