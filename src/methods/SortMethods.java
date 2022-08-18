package methods;

import observations.Bird;

import java.util.List;

public class SortMethods {
    public void sortList(List<Bird> list, String str){
        for(int i = 0; i<list.size(); i++){
            if (list.get(i).getSpecies().equals(str)){
                System.out.println(list.get(i).getDate()+" " +list.get(i).getSpecies()+" "+list.get(i).getSex());
            }
        }
    }

    public void sortArray(Bird[]arr, String str){
        for(int i = 0; i< arr.length; i++){
            if(arr[i].getSpecies().equals("str")){
                System.out.println(arr[i].getDate()+" "+arr[i].getSpecies()+" "+arr[i].getSex());
            }
        }
    }
}
