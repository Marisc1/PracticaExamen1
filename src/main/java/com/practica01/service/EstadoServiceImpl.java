package com.practica01.service;

import com.practica01.dao.EstadoDao;
import com.practica01.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoDao estadoDao;

    //Lector de los datos de la base de datos.
    @Override
    @Transactional(readOnly = true)
    public List<Estado> getEstados() {
        return (List<Estado>)estadoDao.findAll();
    }
    //Guardar nuevos registros.
    @Override
    @Transactional
    public void save(Estado estado) {
        estadoDao.save(estado);
    }
    //Eliminar registros.
    @Override
    @Transactional
    public void delete(Estado estado) {
        estadoDao.delete(estado);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getId_estado()).orElse(null);
    }

}
