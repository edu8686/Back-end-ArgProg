
package com.portfolio.jwt.Service;

import com.portfolio.jwt.Entity.Educacion;
import com.portfolio.jwt.Repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    
    public List<Educacion> list() {
        return rEducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id) {
        return rEducacion.findById(id);
    }
    
    public Optional<Educacion> getByNombreEd(String nombreEd) {
        return rEducacion.findByNombreEd(nombreEd);
    }
    
    public void save(Educacion educ) {
        rEducacion.save(educ);
    }
    
    public void delete(int id) {
        rEducacion.deleteById(id);
    }
    
    public boolean existsById (int id) {
        return rEducacion.existsById(id);
    }
    
    public boolean existsByNombreEd (String nombreEd) {
        return rEducacion.existsByNombreEd(nombreEd);
    }
}
