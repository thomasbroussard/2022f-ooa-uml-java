import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        System.out.println("Hello world!");

        Connection connection = DriverManager.getConnection("jdbc:h2:mem:default");


        PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE DOCTOR(id INT NOT NULL, name VARCHAR(255))");
        preparedStatement.execute();

        connection.prepareStatement("INSERT INTO DOCTOR(id,name) values (1, 'Thomas')")
            .execute();


        connection.prepareStatement("INSERT INTO DOCTOR(id,name) values (1, 'Quentin')").execute();

        PreparedStatement selectStatement = connection.prepareStatement("SELECT name FROM DOCTOR");
        ResultSet resultSet = selectStatement.executeQuery();
        while(resultSet.next()){
            String name = resultSet.getString("name");
            System.out.println(name);
        }

        connection.close();


    }
}