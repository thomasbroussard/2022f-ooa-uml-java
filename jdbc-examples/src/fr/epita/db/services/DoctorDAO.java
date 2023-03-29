package fr.epita.db.services;

import fr.epita.db.datamodel.Doctor;
import fr.epita.db.exceptions.DAOInitializationException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAO {

    Connection connection;

    public DoctorDAO() throws DAOInitializationException {
        try {
            this.connection = connect();
            ensureDDL(connection);
        } catch (Exception e) {
            throw new DAOInitializationException(e);
        }

    }


    public void save(Doctor doctor) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO DOCTOR(id,name) values (? , ?)");
            preparedStatement.setInt(1, doctor.getId());
            preparedStatement.setString(2, doctor.getName());
            preparedStatement.execute();
        } catch (Exception e) {
            //todo custom exception
            e.printStackTrace();
        }
    }

    public List<Doctor> search() {
        List<Doctor> doctors = new ArrayList<>();
        try {
            PreparedStatement selectStatement = connection.prepareStatement("SELECT id,name FROM DOCTOR");
            ResultSet resultSet = selectStatement.executeQuery();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Doctor doctor = new Doctor(id, name);
                doctors.add(doctor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctors;

    }

    /**
     * ensures the database is correctly initialized
     **/
    private static void ensureDDL(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE DOCTOR(id INT NOT NULL, name VARCHAR(255))");
        preparedStatement.execute();
    }

    private static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:h3:mem:default");
    }
}
