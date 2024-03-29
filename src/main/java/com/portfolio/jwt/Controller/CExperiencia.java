
package com.portfolio.jwt.Controller;

import com.portfolio.jwt.Dto.dtoExperiencia;
import com.portfolio.jwt.Entity.Experiencia;
import com.portfolio.jwt.Security.Controller.Mensaje;
import com.portfolio.jwt.Service.SExperiencia;
import io.micrometer.common.util.StringUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfolio-ap-dfae9.web.app", methods={RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/explab")
public class CExperiencia {
    
    @Autowired
    SExperiencia sExperiencia;
    
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list() {
        List<Experiencia> list = sExperiencia.list();
        return new ResponseEntity(list, HttpStatus.OK); 
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia>getById(@PathVariable("id") int id){
        if(!sExperiencia.existsById(id))
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        Experiencia experiencia = sExperiencia.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp) {
        if(StringUtils.isBlank(dtoexp.getNombreExp()))
            return new ResponseEntity(new Mensaje ("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sExperiencia.existsByNombreExp(dtoexp.getNombreExp()))
            return new ResponseEntity(new Mensaje ("Esa experiencia laboral ya existe"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = new Experiencia(dtoexp.getNombreExp(), dtoexp.getFechaInicial(), dtoexp.getFechaFinal(), dtoexp.getDescripcionExp());
        sExperiencia.save(experiencia);
        
        return new ResponseEntity(new Mensaje ("Experiencia agregada"), HttpStatus.OK);
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencia dtoexp){
        if(!sExperiencia.existsById(id))
            return new ResponseEntity(new Mensaje ("El ID no existe"), HttpStatus.BAD_REQUEST);
        if(sExperiencia.existsByNombreExp(dtoexp.getNombreExp()) && sExperiencia.getByNombreExp(dtoexp.getNombreExp()).get().getId()!= id)
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(dtoexp.getNombreExp()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = sExperiencia.getOne(id).get();
        experiencia.setNombreExp(dtoexp.getNombreExp());
        experiencia.setFechaInicial(dtoexp.getFechaInicial());
        experiencia.setFechaFinal(dtoexp.getFechaFinal());
        experiencia.setDescripcionExp(dtoexp.getDescripcionExp());
        
        sExperiencia.save(experiencia);
        return new ResponseEntity(new Mensaje ("Experiencia actualizada"), HttpStatus.OK);
    } 
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if(!sExperiencia.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        sExperiencia.delete(id);
        
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }
    
}
