package com.cmancode.lombok.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.cmancode.lombok.app.model.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long> {

}
