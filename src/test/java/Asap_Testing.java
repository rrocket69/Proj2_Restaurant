import entities.Recipes;
import org.junit.Test;
import sqlconnect.DBConnection;

import java.util.Arrays;
import java.util.Map;

public class Asap_Testing {
    @Test
    public void test1() {
        System.out.println(DBConnection.getInstance().getRecordsFromDB(Recipes.FourCheeses.getRecipesMap()));
    }
    @Test
    public void test2(){
        System.out.println(Arrays.asList(Recipes.FourCheeses.getRecipesMap()));
    }
}
