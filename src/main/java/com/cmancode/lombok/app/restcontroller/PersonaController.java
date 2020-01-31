package com.cmancode.lombok.app.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmancode.lombok.app.model.Persona;
import com.cmancode.lombok.app.service.impl.PersonaServiceImpl;
import com.cmancode.lombok.app.service.interf.IPersonaService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class PersonaController {
	
	@Autowired
	private IPersonaService personaService;
	
	@PostMapping("/persona")
	public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona){
		
		this.personaService.crearPersona(persona);
		log.info("Persona guardado de manera exitosa");
		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}
	
	@PutMapping("/persona/{id}")
	public ResponseEntity<Persona> actualizarPersona(@PathVariable("id") Long id, @RequestBody Persona persona) {
		Persona p = this.personaService.buscarPersonaPorId(id);
		if(p == null) {
			return new ResponseEntity<Persona>(HttpStatus.NOT_ACCEPTABLE);
		}else {
			p.setNombre(persona.getNombre());
			p.setApellido(persona.getApellido());
			this.personaService.actualizarPersona(p);
			log.info("Persona actualizada  de manera exitosa");
		}
		return new ResponseEntity<Persona>(p, HttpStatus.OK);
	}
	
}
