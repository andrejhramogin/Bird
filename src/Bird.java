import java.time.LocalDate;

public class Bird {
    private LocalDate locDate;
    private String species;
    private String sex; // male/female/unknown
    private String age; // juv/ad/unknown
    private String observationPlace;
    private int quantity;
    private String comment;
    ScanMethods scanMethods = new ScanMethods();

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
        int year, month, dayOfTheMonth;
        scanMethods.printMessage(UiMessage.ENTER_THE_DATE_OF_OBSERVATION);
        year = scanMethods.scanInteger(UiMessage.ENTER_THE_YEAR);
        month = scanMethods.scanInteger(UiMessage.ENTER_THE_MONTH);
        dayOfTheMonth = scanMethods.scanInteger(UiMessage.ENTER_THE_DAY);
        locDate = LocalDate.of(year, month, dayOfTheMonth);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies() {
        species = scanMethods.scanString(UiMessage.ENTER_THE_SPECIES);
    }

    public String getSex() {
        return sex;
    }

    public void setSex() {
        scanMethods.printMessage(UiMessage.ENTER_THE_SEX);
        String newSex = scanMethods.scanString();
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
                newSex = scanMethods.scanString(UiMessage.ENTER_THE_SEX);
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
