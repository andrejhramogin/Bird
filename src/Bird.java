import java.time.LocalDate;

public class Bird {
    private LocalDate locDate;
    private String species;
    private String sex; // male/female/unknown
    private String age; // juv/ad/unknown
    private String observationPlace;
    private int quantity;
    private String comment;
    Methods methods = new Methods();

    public Bird() {
    }

    public Bird(LocalDate date, String species, String sex) {
        this.locDate = date;
        this.species = species;
        this.sex = sex;
    }

    public Bird(LocalDate locDate, String species, String sex, String age, String place, int quantity, String comment) {
        this.locDate = locDate;
        this.species = species;
        this.sex = sex;
        this.age = age;
        observationPlace = place;
        this.quantity = quantity;
        this.comment = comment;
    }

    public LocalDate getLocDate() {
        return locDate;
    }

    public void setLocDate() {
        methods.printMessage(UiMessage.ENTER_THE_DATE_OF_OBSERVATION);
        methods.printMessage(UiMessage.ENTER_THE_YEAR);
        int year = methods.scanInteger();
        methods.printMessage(UiMessage.ENTER_THE_MONTH);
        int month = methods.scanInteger();
        methods.printMessage(UiMessage.ENTER_THE_DAY);
        int dayOfTheMonth = methods.scanInteger();
        locDate = LocalDate.of(year, month, dayOfTheMonth);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies() {
        methods.printMessage(UiMessage.ENTER_THE_SPECIES);
        species = methods.scanString();
    }

    public String getSex() {
        return sex;
    }

    public void setSex() {
        methods.printMessage(UiMessage.ENTER_THE_SEX);
        String newSex = methods.scanString();
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
                methods.printMessage(UiMessage.ENTER_THE_SEX);
                newSex = methods.scanString();
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
