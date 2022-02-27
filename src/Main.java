
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = ("localhost"); //DataBase URL
        int port = 3306; // Port number (default: 3306)
        String database_name = ("dbname"); //your database name
        String user = ("mysql"); // database user
        String data_password = ("mysql"); //Your database password


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://"+url+":"+port+"/"+database_name, user, data_password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from table");
            while (resultSet.next()) {
//              System.out.println(resultSet.getString("title"));
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String code_operator = resultSet.getString("code_operator");
                String phone_number = resultSet.getString("phone_number");
                String adress = resultSet.getString("adress");
                String birth_date = resultSet.getString("birth_date");
                String password = resultSet.getString("password");
                String modifed_data = resultSet.getString("modifed_data");
                System.out.println(id + name + code_operator + phone_number + adress + birth_date + password + modifed_data);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}