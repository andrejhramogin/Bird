package methods;

import observations.Bird;

import java.util.List;

public  class PrintList  {

    public void printAll (List <Bird> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getDate() + " " + list.get(i).getSpecies() + " " +
                    list.get(i).getSex() + " " + list.get(i).getAge() + " "+list.get(i).getObservationPlace()+" " +
                    list.get(i).getQuantity() + " " + list.get(i).getComment());
        }
    }
    public void printSome(List<Bird> list) {
        for (Bird bird : list) {
            System.out.println(bird.getDate() + " " + bird.getSpecies() + " " + bird.getSex());
        }
    }

    public void printByIndex(List<Bird> list, int index) {
        System.out.println(list.get(index).getDate() + " " + list.get(index).getSpecies() + " " +
                list.get(index).getSex());
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
