
package com.portfolio.jwt.Interface;

import com.portfolio.jwt.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();
    
    // Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    // Eliminar un objeto pero lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);
}
