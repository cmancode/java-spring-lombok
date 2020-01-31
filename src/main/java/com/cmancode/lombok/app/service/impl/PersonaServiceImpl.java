package com.cmancode.lombok.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmancode.lombok.app.dao.IPersonaDao;
import com.cmancode.lombok.app.model.Persona;
import com.cmancode.lombok.app.service.interf.IPersonaService;

@Transactional
@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaDao personaDao;
	
	@Transactional
	@Override
	public void crearPersona(Persona persona) {
		this.personaDao.save(persona);
	}

	@Transactional
	@Override
	public void actualizarPersona(Persona persona) {
		this.personaDao.save(persona);
	}

	@Transactional(readOnly = true)
	@Override
	public Persona buscarPersonaPorId(Long id) {
		return this.personaDao.findById(id).orElse(null);
	}

}
