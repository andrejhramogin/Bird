
public class Observation {

    Bird bird=new Bird();
    public Bird[] observationsArray = new Bird[2];

    public void addObservation() {
        for (int i = 0; i < observationsArray.length; i++) {
            bird.setLocDate();
            bird.setSpecies();
            bird.setSex();
            observationsArray[i] = new Bird(bird.getLocDate(), bird.getSpecies(), bird.getSex());
        }
    }

    public void print(Bird[] array) {
        for(Bird value : array) {
            System.out.println(value.getLocDate() + " " + value.getSpecies()+" "+value.getSex());
        }
    }
}
