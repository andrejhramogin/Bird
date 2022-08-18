package methods;

import observations.Bird;

public class PrintArray {

    public void printSome (Bird[] array) {
        for (Bird value : array) {
            System.out.println(value.getDate() + " " + value.getSpecies() + " " + value.getSex());
        }
    }

    public void printAll (Bird[] array){
        for (Bird value : array) {
            System.out.println(value.getDate() + ", " + value.getSpecies() + "; " + value.getSex() + ", " + value.getAge() + ", " +
                    value.getObservationPlace() + ", " + value.getQuantity() + ", " + value.getComment());
        }
    }
}
