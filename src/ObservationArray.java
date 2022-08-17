
public class ObservationArray {

    Bird bird=new Bird();
    public Bird[] observationsArray = new Bird[2];

    public void addObservationToArray() {
        for (int i = 0; i < observationsArray.length; i++) {
            enterObservationData();
            observationsArray[i] = new Bird(bird.getLocDate(), bird.getSpecies(), bird.getSex());
        }
    }

    private void enterObservationData(){
        bird.setLocDate();
        bird.setSpecies();
        bird.setSex();
    }

  }