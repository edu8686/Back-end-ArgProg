
package com.portfolio.jwt.Security.Repository;

import com.portfolio.jwt.Security.Entity.Rol;
import com.portfolio.jwt.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByrolNombre(RolNombre rolNombre);
}
