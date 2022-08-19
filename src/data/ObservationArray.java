package data;

import observations.Bird;

public class ObservationArray {

    Bird bird=new Bird();
    public Bird[] observationsArray = new Bird[2];

    public void addObservationToArray() {
        for (int i = 0; i < observationsArray.length; i++) {
            enterData();
            observationsArray[i] = new Bird(bird.getDate(), bird.getSpecies(), bird.getSex());
        }
    }

    private void enterData(){
        bird.setDate();
        bird.setSpecies();
        bird.setSex();
    }
  }