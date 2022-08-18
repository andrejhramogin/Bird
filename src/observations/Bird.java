package observations;

import java.time.LocalDate;

import date.LocDate;
import methods.PrintList;
import methods.ScanMethod;
import uidata.UiMessage;

public class Bird {
    private LocalDate date;
    private String species;
    private String sex;
    private String age;
    private String observationPlace;
    private int quantity;
    private String comment;
    ScanMethod scanMethod = new ScanMethod();
    PrintList printList = new PrintList();
    LocDate locDate = new LocDate();

    public Bird() {
    }

    public Bird(LocalDate date, String species, String sex) {
        this.date = date;
        this.species = species;
        this.sex = sex;
    }

    public Bird(LocalDate date, String species, String sex, String age, String place, int quantity, String comment) {
        this.date = date;
        this.species = species;
        this.sex = sex;
        this.age = age;
        observationPlace = place;
        this.quantity = quantity;
        this.comment = comment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate() {
        date = locDate.setDate();
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies() {
        species = scanMethod.scanString(UiMessage.ENTER_THE_SPECIES);
    }

    public String getSex() {
        return sex;
    }

    public void setSex() {
        printList.printMessage(UiMessage.ENTER_THE_SEX);
        String newSex = scanMethod.scanString();
        boolean flag = false;
        while (!flag) {
            if (newSex.equals("m") || newSex.equals("f") || newSex.equals("u")) {
                switch (newSex) {
                    case "m":
                        sex = UiMessage.MALE;
                        break;
                    case "f":
                        sex = UiMessage.FEMALE;
                        break;
                    case "u":
                        sex = UiMessage.UNKNOWN;
                        break;
                }
                flag = true;
            } else {
                newSex = scanMethod.scanString(UiMessage.ENTER_THE_SEX);
            }
        }
    }

    public String getAge() {
        return age;
    }

    public void setAge(String newAge) {
        age = newAge;
    }

    public String getObservationPlace() {
        return observationPlace;
    }

    public void setObservationPlace(String newPlace) {
        observationPlace = newPlace;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
