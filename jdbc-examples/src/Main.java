import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        System.out.println("Hello world!");
        Connection connection = connect();

        ensureDDL(connection);

        saveDoctor(connection, 1, "thomas");

        saveDoctor(connection, 2, "quentin");

        searchDoctors(connection);

        connection.close();


    }

    private static List searchDoctors(Connection connection) throws SQLException {
        PreparedStatement selectStatement = connection.prepareStatement("SELECT name FROM DOCTOR");
        ResultSet resultSet = selectStatement.executeQuery();
        while(resultSet.next()){
            String name = resultSet.getString("name");
            System.out.println(name);
        }
        return null; //todo fix that
    }

    private static void saveDoctor(Connection connection, Integer id, String name) throws SQLException {
        connection.prepareStatement("INSERT INTO DOCTOR(id,name) values (" + id + ", " + name + ")")
            .execute();
    }

    /** ensures the database is correctly initialized**/
    private static void ensureDDL(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE DOCTOR(id INT NOT NULL, name VARCHAR(255))");
        preparedStatement.execute();
    }

    private static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:mem:default");
    }
}