package dev2426.ITSProjectWork.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import dev2426.ITSProjectWork.Model.Utente;
import dev2426.ITSProjectWork.Repository.UtentiRepository;

@Service
public class UtentiService {

	@Autowired
	private UtentiRepository repo;
	
	@Autowired
    private PasswordEncoder passwordEncoder;
	
	public List<Utente> getAll() {
		
		return repo.findAll();
				
	}
	
	public Optional<Utente> findId(long idCerca) {
		return repo.findById(idCerca);
	}
	
	public void insert(Utente nuova) {
		
        nuova.setPassword(passwordEncoder.encode(nuova.getPassword()));
        repo.save(nuova);
    }

	
	public void delete(long idCancella) {
		repo.deleteById(idCancella);
	}
	
	public void update(long idUpdate, Utente nuova) {

	    Optional<Utente> found = repo.findById(idUpdate);
	    if (found.isPresent()) {
	 
	        Utente t = found.get();

	        t.setNome(nuova.getNome());
	        t.setCognome(nuova.getCognome());
	        t.setEmail(nuova.getEmail());
	        t.setCV(nuova.getCV());
	        
	        if (nuova.getPassword() != null && !nuova.getPassword().isEmpty()) {
	            t.setPassword(passwordEncoder.encode(nuova.getPassword()));
	        }
	        
	        repo.save(t);
	    }
	}
}

