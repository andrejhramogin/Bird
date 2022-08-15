import java.util.Scanner;

public class Bird {
    private String date;
    private String species;
    private String sex; // male/female/unknown
    private String age; // juv/ad/unknown
    private String observationPlace;
    private int quantity;// quantity of birds
    private String comment;
    public final Scanner SCAN = new Scanner(System.in);
    Methods methods = new Methods();



    public Bird() {
    }

    public Bird(String date, String species, String sex) {
        this.date = date;
        this.species = species;
        this.sex = sex;
    }

    public Bird(String date, String species, String sex, String age, String place, int quantity, String comment) {
        this.date = date;
        this.species = species;
        this.sex = sex;
        this.age = age;
        observationPlace = place;
        this.quantity = quantity;
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        methods.printMessage(UiMessage.ENTER_THE_DATE_OF_OBSERVATION);
        this.date = SCAN.nextLine();
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies() {
        methods.printMessage(UiMessage.ENTER_THE_SPECIES);
        this.species = SCAN.nextLine();
    }

    public String getSex() {
        return sex;
    }

    public String setSex() {
        methods.printMessage(UiMessage.ENTER_THE_SEX);
        String newSex = SCAN.nextLine();
        if (newSex.equals(UiMessage.MALE) || newSex.equals(UiMessage.FEMALE) || newSex.equals(UiMessage.UNKNOWN)) {
            sex = newSex;
        } else {
            setSex();
        }
        return sex;
    }

    public void setSex2(String newSex) {//without recursion
        boolean flag  = false;
        while (!flag) {
            if (newSex.equals(UiMessage.MALE) || newSex.equals(UiMessage.FEMALE) || newSex.equals(UiMessage.UNKNOWN)) {
                sex = newSex;
                flag = true;
            } else {
                methods.printMessage(UiMessage.ENTER_THE_SEX);
                newSex = SCAN.nextLine();
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