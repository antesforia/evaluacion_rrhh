/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.evaluacionrrhh.service.impl;

import pe.edu.utp.evaluacionrrhh.dao.RegistrarseDao;
import pe.edu.utp.evaluacionrrhh.dao.impl.RegistrarseDaoImpl;
import pe.edu.utp.evaluacionrrhh.model.Registrarse;
import pe.edu.utp.evaluacionrrhh.service.RegistrarseService;

/**
 *
 * @author Booz
 */
public class RegistrarseServicesImpl implements RegistrarseService {

    private RegistrarseDao registrarseDao = new RegistrarseDaoImpl();

    @Override
    public boolean guardar(Registrarse registrarse) {
        return registrarseDao.guardar(registrarse);
    }
}
