package entities;

import java.util.HashMap;
import java.util.Map;

public enum Recipes {
    FourCheeses,
    Classical,
    Margarita;

    private Map<Ingridient,Integer> comp = new HashMap<>();

    public Map<Ingridient, Integer> getRecipesMap(){
        return comp;
    }
    Recipes(){
        switch (this.toString()){
            case "FourCheeses":
                comp.put(Ingridient.Dough,1);
                comp.put(Ingridient.TomatoSauce,1);
                comp.put(Ingridient.Parmezan,2);
                comp.put(Ingridient.Gauda,1);
                comp.put(Ingridient.Mozarella,2);
                comp.put(Ingridient.Rokfor,1);
                break;
            case "Classical":
                comp.put(Ingridient.Dough,1);
                comp.put(Ingridient.TomatoSauce,1);
                comp.put(Ingridient.Parmezan,1);
                comp.put(Ingridient.Mozarella,1);
                comp.put(Ingridient.Pepperoni,1);
                comp.put(Ingridient.Tomato,1);

            case "Margarita":
                comp.put(Ingridient.Dough,1);
                comp.put(Ingridient.TomatoSauce,1);
                comp.put(Ingridient.Tomato,1);
                comp.put(Ingridient.Parmezan,1);
                comp.put(Ingridient.Mozarella,1);
        }
    }

}




//        if(this.toString().equals("FourCheeses")){
//            comp.put(Ingridient.Dough,1);
//            comp.put(Ingridient.TomatoSauce,1);
//            comp.put(Ingridient.Parmezan,2);
//            comp.put(Ingridient.Gauda,1);
//            comp.put(Ingridient.Mozarella,2);
//            comp.put(Ingridient.Rokfor,1);
//        }
//        if(this.toString().equals("Classical")){
//            comp.put(Ingridient.Dough,1);
//        }
//package entities;
//
//        import java.util.List;
//
//public enum Recipes {
//    FourCheeses(Ingridient.Dough,
//            Ingridient.TomatoSauce,
//            Ingridient.Gauda,
//            Ingridient.Mozarella,
//            Ingridient.Parmezan,
//            Ingridient.Rokfor),
//    Classical(
//            Ingridient.Dough
//    ),
//    Margarita;
//
//    private List<Ingridient> comp;
//
//    private Recipes(Ingridient ... desc){
//        for (Ingridient i :desc) {
//
//        }
//    }
//
//}
