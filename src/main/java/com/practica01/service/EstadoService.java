
package com.practica01.service;

import com.practica01.domain.Estado;
import java.util.List;

public interface EstadoService {
    
    //Interfaz para llamar a los diferentes metodos de edicion de la base de datos.
    public List<Estado> getEstados();
    
    public void save(Estado estado);
    
    public void delete(Estado estado);
    
    public Estado getEstado(Estado estado);
    
}
