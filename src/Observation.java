public class Observation {

    Bird bird=new Bird();
    public Bird[] observationsArray = new Bird[2];

    public void addObservation() {
        for (int i = 0; i < observationsArray.length; i++) {
            bird.setDate();
            bird.setSpecies();
            bird.setSex2(bird.SCAN.nextLine());
            observationsArray[i] = new Bird(bird.getDate(), bird.getSpecies(), bird.getSex());
        }
    }

    public void print(Bird[] array) {
        for(Bird value : array) {
            System.out.println(value.getDate() + " " + value.getSpecies()+" "+value.getSex());
        }
    }
}
