package methods;

import observations.Bird;

import java.util.List;

public class PrintList implements IPrintData {

    @Override
    public void printSome(List<Bird> list) {
        for (Bird bird : list) {
            System.out.println(bird.getDate() + " " + bird.getSpecies() + " " + bird.getSex());
        }
    }


//    @Override
//    public <T> void printAll(List <T> list) {
//
//
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getDate() + " " + list.get(i).getSpecies() + " " +
//                    list.get(i).getSex() + " " + list.get(i).getAge() + " " + list.get(i).getQuantity() + " " + list.get(i).getComment());
//        }
//    }

    public void printObservListByIndex(List<Bird> list, int i) {
        System.out.println(list.get(i).getDate() + " " + list.get(i).getSpecies() + " " +
                list.get(i).getSex());
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
