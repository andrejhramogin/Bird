import java.util.Arrays;

public class Observation {

    Bird bird=new Bird();
    public Bird[] observationsArray = new Bird[2];

    public void addObservation() {
        for (int i = 0; i < observationsArray.length; i++) {
            bird.setDate();
            bird.setSpecies();
            observationsArray[i] = new Bird(bird.getDate(), bird.getSpecies());
        }
    }

    public void print(Bird[] array) {
        for(Bird value : array){
            System.out.println(value.getDate()+" "+ value.getSpecies());
        }
    }
}
