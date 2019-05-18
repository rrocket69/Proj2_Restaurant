package model.entities.enums;

import java.util.HashMap;
import java.util.Map;

public enum Recipes {
    //transfer to database
    FourCheeses("FourCheeses"),
    Classical("Classical"),
    Margarita("Margarita");

    private final Map<Ingridient, Integer> map;

    Recipes(String s) {
        map = new HashMap<>();
        switch (s) {
            case "FourCheeses":
                map.put(Ingridient.Dough, 1);
                map.put(Ingridient.TomatoSauce, 1);
                map.put(Ingridient.Parmezan, 2);
                map.put(Ingridient.Gauda, 1);
                map.put(Ingridient.Mozarella, 2);
                map.put(Ingridient.Rokfor, 1);
                break;
            case "Classical":
                map.put(Ingridient.Dough, 1);
                map.put(Ingridient.TomatoSauce, 1);
                map.put(Ingridient.Parmezan, 1);
                map.put(Ingridient.Mozarella, 1);
                map.put(Ingridient.Pepperoni, 1);
                map.put(Ingridient.Tomato, 1);
                break;
            case "Margarita":
                map.put(Ingridient.Dough, 1);
                map.put(Ingridient.TomatoSauce, 1);
                map.put(Ingridient.Tomato, 1);
                map.put(Ingridient.Parmezan, 1);
                map.put(Ingridient.Mozarella, 1);
                break;
        }
    }

//    Recipes() {
//        map = new HashMap<>();
//        switch (this) {
//            case FourCheeses:
//                map.put(Ingridient.Dough, 1);
//                map.put(Ingridient.TomatoSauce, 1);
//                map.put(Ingridient.Parmezan, 2);
//                map.put(Ingridient.Gauda, 1);
//                map.put(Ingridient.Mozarella, 2);
//                map.put(Ingridient.Rokfor, 1);
//                break;
//            case Classical:
//                map.put(Ingridient.Dough, 1);
//                map.put(Ingridient.TomatoSauce, 1);
//                map.put(Ingridient.Parmezan, 1);
//                map.put(Ingridient.Mozarella, 1);
//                map.put(Ingridient.Pepperoni, 1);
//                map.put(Ingridient.Tomato, 1);
//                break;
//            case Margarita:
//                map.put(Ingridient.Dough, 1);
//                map.put(Ingridient.TomatoSauce, 1);
//                map.put(Ingridient.Tomato, 1);
//                map.put(Ingridient.Parmezan, 1);
//                map.put(Ingridient.Mozarella, 1);
//                break;
//        }
//    }

    public Map<Ingridient, Integer> getComposition() {
        return map;
    }
}
