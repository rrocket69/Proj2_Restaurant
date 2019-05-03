package sqlconnect;

import entities.Ingridient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/stock_ingridients" +
            "?verifyServerCertificate=false" +
            "&useSSL=false" +
            "&requireSSL=false" +
            "&useLegacyDatetimeCode=false" +
            "&amp" +
            "&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "asdfghqwe321";

    private static final DBConnection instance = new DBConnection();

    //    private Statement statement;
    private ResultSet resultSet;

    private DBConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from food");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean getRecordsFromDB(Map<Ingridient, Integer> desc) {
//        Map<Ingridient,Integer> temp = new HashMap<>();

        try {
            Ingridient ingridient;
            int amount;
            while (resultSet.next()) {
                ingridient = Ingridient.valueOf(resultSet.getString("ingridient"));
                System.out.println(ingridient);
                amount = resultSet.getInt("amount");
                System.out.println(amount);
                if (desc.containsKey(ingridient) && amount < desc.get(ingridient))
                    return false;
//                temp.put(ingridient,amount-desc.get(ingridient));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
//        return temp;
    }

    public static DBConnection getInstance() {
        return instance;
    }

    // Used to add records to database, first created table im MySQL
//    public void makeTable(){
//            statement.execute("INSERT INTO food(ingridient, amount)VALUES ("Dough",10);");
//            statement.execute("INSERT INTO food(ingridient, amount)VALUES ("TomatoSauce",6);");
//            statement.execute("INSERT INTO food(ingridient, amount)VALUES ("Tomato",7);");
//            statement.execute("INSERT INTO food(ingridient, amount)VALUES ("Mushrooms",1);");
//            statement.execute("INSERT INTO food(ingridient, amount)VALUES ("Pepperoni",4);");
//            statement.execute("INSERT INTO food(ingridient, amount)VALUES ("Parmezan",4);");
//            statement.execute("INSERT INTO food(ingridient, amount)VALUES ("Mozarella",5);");
//            statement.execute("INSERT INTO food(ingridient, amount)VALUES ("Rokfor",0);");
//            statement.execute("INSERT INTO food(ingridient, amount)VALUES ("Gauda",1);");
//    }
}
