public class BirdObservation {

    Observation observation = new Observation();

    public void birdObserv( ){
        observation.addObservation();
        observation.print(observation.observationsArray);
    }

    public void birdObserv2(Bird[]arr){// Почему не работает? NullPointerException
        observation.addObservation();
        observation.print(arr);
    }
}
