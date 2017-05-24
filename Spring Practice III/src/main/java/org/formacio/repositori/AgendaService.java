package org.formacio.repositori;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgendaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	@PostConstruct
	public void init() {
		personaRepository.save(new Persona("ant","Antoni","971-555123"));
		personaRepository.save(new Persona("joa","Joana","971-555555"));
		personaRepository.save(new Persona("lin","Lina","971-555888"));
	}
	
	public void inserta (String id, String nom, String telefon) {
		personaRepository.save(new Persona(id, nom, telefon));
	}
	
	public Persona recupera (String id) {
		return personaRepository.findOne(id);
	}
	
	public Long nombreContactes() {
		return personaRepository.count();
	}

	public void update(String id, String nom, String telefon) {
	    personaRepository.save(new Persona(id,nom,telefon));
    }

    public String listadoPersonas(){
        List<String> listaPersonas = new ArrayList<String>();
        for (Persona persona : personaRepository.findAll()) {
            listaPersonas.add(persona.getNom());
        }
        return String.join(" ", listaPersonas);
    }
}
