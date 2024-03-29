
package com.portfolio.jwt.Service;

import com.portfolio.jwt.Entity.Experiencia;
import com.portfolio.jwt.Repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    public List<Experiencia> list() {
        return rExperiencia.findAll();
    }
    
    public Optional<Experiencia> getOne(int id) {
        return rExperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreExp(String nombreExp) {
        return rExperiencia.findByNombreExp(nombreExp);
    }
    
    public void save(Experiencia expe) {
        rExperiencia.save(expe);
    }
    
    public void delete(int id) {
        rExperiencia.deleteById(id);
    }
    
    public boolean existsById (int id) {
        return rExperiencia.existsById(id);
    }
    
    public boolean existsByNombreExp (String nombreExp) {
        return rExperiencia.existsByNombreExp(nombreExp);
    }
}
