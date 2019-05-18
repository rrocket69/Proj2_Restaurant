import model.entities.enums.Ingridient;
import model.entities.enums.Recipes;
import org.junit.Test;

public class Asap_Testing {
    @Test
    public void test1() {
        for (Recipes recipes: Recipes.values()) {
            System.out.println(recipes.getComposition());
        }
    }
    @Test
    public void test2(){
        for (Ingridient recipes: Ingridient.values()) {
            System.out.println(recipes.getAmount());
        }
    }
}
