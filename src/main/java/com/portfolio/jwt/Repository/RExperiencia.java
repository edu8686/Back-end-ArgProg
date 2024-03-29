
package com.portfolio.jwt.Repository;

import com.portfolio.jwt.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {
    
    public Optional<Experiencia> findByNombreExp(String nombreExp);
    
    public boolean existsByNombreExp(String nombreExp);
    
}
