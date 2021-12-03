package ch.fhnw.oop2.addex.generics.aufgabe8.solution;

import java.util.LinkedList;
import java.util.List;

public class UnionUtil {

    public static List<Cake> union(List<? extends Cake> firstList, List<? extends Cake> secondList) {
        List<Cake> returnList = new LinkedList<>();

        returnList.addAll(firstList);
        for(Cake cake : secondList){
            if(!returnList.contains(cake)){
                returnList.add(cake);
            }
        }

        return returnList;
    }
    
}
