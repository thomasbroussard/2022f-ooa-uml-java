package fr.epita.db.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DoctorDAO {

    Connection connection;
    public DoctorDAO(){
        try {
            this.connection = connect();
            ensureDDL(connection);
        }catch (Exception e){
            //TODO deal with custom exception
            e.printStackTrace();
        }

    }




    public void save(Doctor doctor){
        connection.prepareStatement("INSERT INTO DOCTOR(id,name) values (" + id + ", " + name + ")")
                .execute();
    }

    public List<Doctor> search(){

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
