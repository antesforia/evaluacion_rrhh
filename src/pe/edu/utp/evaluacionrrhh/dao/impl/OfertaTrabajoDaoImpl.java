/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.evaluacionrrhh.dao.impl;

import pe.edu.utp.evaluacionrrhh.dao.OfertaTrabajoDao;
import pe.edu.utp.evaluacionrrhh.model.OfertaTrabajo;
import java.sql.*;

/**
 *
 * @author booz
 */
public class OfertaTrabajoDaoImpl implements OfertaTrabajoDao {

    @Override
    public boolean guardar(OfertaTrabajo ofertaTrabajo) {
        String url = "jdbc:mysql://localhost:3306/evaluacion_rrhh";
        String username = "root";
        String password = "1234";  

        boolean guardoCorrectamente = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO oferta_trabajo (area, cargo, modalidad, direccion, edadMaxima, sueldoTope, fechaDeEntrevista) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, ofertaTrabajo.getArea());
            preparedStatement.setString(2, ofertaTrabajo.getCargo());
            preparedStatement.setString(3, ofertaTrabajo.getModalidad());
            preparedStatement.setString(4, ofertaTrabajo.getDireccion());
            preparedStatement.setInt(5, ofertaTrabajo.getEdadMaxima());
            preparedStatement.setInt(6, ofertaTrabajo.getSueldoTope());
            preparedStatement.setDate(7, Date.valueOf(ofertaTrabajo.getFechaDeEntrevista()));

            guardoCorrectamente = preparedStatement.executeUpdate() > 0;
            System.out.println("Guardo Correctamente");

            preparedStatement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex);
        }

        return guardoCorrectamente;
    }

}
