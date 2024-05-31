/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.evaluacionrrhh.service.impl;

import pe.edu.utp.evaluacionrrhh.dao.OfertaTrabajoDao;
import pe.edu.utp.evaluacionrrhh.dao.impl.OfertaTrabajoDaoImpl;
import pe.edu.utp.evaluacionrrhh.model.OfertaTrabajo;
import pe.edu.utp.evaluacionrrhh.service.OfertaTrabajoService;

/**
 *
 * @author jalvarea
 */
public class OfertaTrabajoServicesImpl implements OfertaTrabajoService{

    private OfertaTrabajoDao ofertaTrabajoDao = new OfertaTrabajoDaoImpl();
            
    @Override
    public boolean guardar(OfertaTrabajo ofertaTrabajo) {
        return ofertaTrabajoDao.guardar(ofertaTrabajo);
    }
    
}
