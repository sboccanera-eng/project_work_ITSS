package dev2426.ITSProjectWork.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import dev2426.ITSProjectWork.Model.Utente;
import dev2426.ITSProjectWork.Repository.UtentiRepository;

public class UtentiService {

	@Autowired
	private UtentiRepository repo;
	
	public List<Utente> getAll() {
		
		return repo.findAll();
				
	}
	
	public Optional<Utente> find(long idCerca) {
		return repo.findById(idCerca);
	}
	
	public void insert(Utente nuova) {
		
		repo.save(nuova);
		
	}
	
	public void delete(long idCancella) {
		repo.deleteById(idCancella);
	}
	
	public void update(long idUpdate, Utente nuova) {

		Optional<Utente> found = repo.findById(idUpdate);
		Utente t = found.get();

		t.setIdUtente(nuova.getIdUtente());
		t.setNome(nuova.getNome());
		t.setCognome(nuova.getCognome());
		t.setEmail(nuova.getEmail());
		t.setPassword(nuova.getPassword());
		t.setCV(nuova.getCV());
		
		repo.save(t);

	}	
}

