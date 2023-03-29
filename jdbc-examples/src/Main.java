import fr.epita.db.datamodel.Doctor;
import fr.epita.db.exceptions.DAOInitializationException;
import fr.epita.db.services.DoctorDAO;

import javax.print.Doc;
import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        System.out.println("Hello world!");
        DoctorDAO doctorDAO = null;
        try {
            doctorDAO = new DoctorDAO();
        } catch (DAOInitializationException e) {
            System.out.println("dao was not able to initialize properly");
            e.printStackTrace();
            return;
        }

        Doctor thomas = new Doctor(1, "Thomas");
        Doctor quentin = new Doctor(2, "Quentin");

        doctorDAO.save(thomas);
        doctorDAO.save(quentin);

        List<Doctor> results = doctorDAO.search();
        System.out.println(results);
    }
}