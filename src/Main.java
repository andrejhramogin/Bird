public class Main {
    public static void main(String[] args) {

        Observation observations = new Observation();

//        Bird[] observation = new Bird[2];
//        observation[0] = new Bird("10/08/2022",Species.СТРИЖ_ЧЕРНЫЙ, "unknown", "adult+juv", Place.HRODNA, 20, "Высотный полет поздно вечером.");
//        observation[1] = new Bird("11/08/2022",Species.КАНАРЕЕЧНЫЙ_ВЬЮРОК, "male", "adult", Place.HRODNA, 1, "Поющий самец." );
//
//        for (int i = 0; i < observation.length; i++) {
//            System.out.println(observation[i].getDate()+", "+ observation[i].getSpecies() + "; " + observation[i].getSex() + ", " + observation[i].getAge() + ", " +
//                    observation[i].getObservationPlace() + ", " + observation[i].getQuantity() + ", " + observation[i].getComment());
//        }

        observations.addObservation();
        observations.print(observations.observationsArray);

    }
}
