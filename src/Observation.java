import java.util.Scanner;

public class Observation {

    final static Scanner SCAN = new Scanner(System.in);

    Bird bird = new Bird();
    public Bird[] observationsArray = new Bird[2];

    public void addObservation() {
        for (int i = 0; i < observationsArray.length; i++) {
            System.out.println("Enter the date of observation and species: ");
            observationsArray[i] = new Bird(SCAN.nextLine(), SCAN.nextLine());
        }
    }

    public void print(Bird[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getDate() + " " + array[i].getSpecies());
        }
        SCAN.close();
    }
}
