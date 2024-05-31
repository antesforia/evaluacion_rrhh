/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.evaluacionrrhh.dao.impl;

import pe.edu.utp.evaluacionrrhh.model.Registrarse;
import pe.edu.utp.evaluacionrrhh.dao.RegistrarseDao;
import java.sql.*;

public class RegistrarseDaoImpl implements RegistrarseDao{
    @Override
    public boolean guardar(Registrarse registrarse) {
        String url = "jdbc:mysql://localhost:3306/evaluacion_rrhh";
        String username = "root";
        String password = "1234";

        boolean guardoCorrectamente = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO reclutador(primer_nombre,segundo_nombre, apellido_paterno, apellido_materno,"
                     + " dni, edad, correo,username, contraseña)values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, registrarse.getPrimer_nombre());
            preparedStatement.setString(2, registrarse.getSegundo_nombre());
            preparedStatement.setString(3, registrarse.getApellido_paterno());
            preparedStatement.setString(4, registrarse.getApellido_materno());
            preparedStatement.setString(5, registrarse.getDni());
            preparedStatement.setInt(6, registrarse.getEdad());
            preparedStatement.setString(7, registrarse.getCorreo());
            preparedStatement.setString(8, registrarse.getUsername());
            preparedStatement.setString(9, registrarse.getContraseña());

            guardoCorrectamente = preparedStatement.executeUpdate() > 0;
            System.out.println("guardo Correctamente");

            preparedStatement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex);
        }

        return guardoCorrectamente;
    }
}
