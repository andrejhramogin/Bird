import java.util.Scanner;

public class Bird {
    private String date;
    private String species;
    private String sex; // male/female/unknown
    private String age; // juv/ad/unknown
    private String observationPlace;
    private int quantity;// quantity of birds
    private String comment;
//    Calendar date;

    Scanner scan = new Scanner(System.in);

    boolean flag;

    public Bird(String date, String species) {
        this.date = date;
        this.species = species;
    }
    public Bird(){

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

    public void setDate(String newDate) {
        this.date = newDate;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    public String getSex() {
        return sex;
    }

    public String setSex() {
        System.out.println("Enter the sex: male / female / unknown: ");
        String newSex = scan.nextLine();
        if (newSex.equals("male") || newSex.equals("female") || newSex.equals("unknown")) {
            sex = newSex;
        } else {
            setSex();
        }
        return sex;
    }

    public void setSex2(String newSex) {
        while (!flag) {
            if (newSex.equals("male") || newSex.equals("female") || newSex.equals("unknown")) {
                sex = newSex;
                flag = true;
            } else {
                System.out.println("Enter the wright sex: male / female / unknown");
                newSex = scan.nextLine();
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