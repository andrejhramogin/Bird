import java.util.List;

public class PrintMethods {

    public void printMessage(String msg){
        System.out.println(msg);
    }

    public void printObservationArray(Bird[] array) {
        for (Bird value : array) {
            System.out.println(value.getDate() + " " + value.getSpecies() + " " + value.getSex());
        }
    }

    public void printObservationList(List<Bird> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getDate() + " " + list.get(i).getSpecies() + " " +
                    list.get(i).getSex());
        }
    }

    public void printObservListByIndex(List<Bird> list, int i) {
        System.out.println(list.get(i).getDate() + " " + list.get(i).getSpecies() + " " +
                list.get(i).getSex());
    }
}
