package dev2426.ITSProjectWork.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import dev2426.ITSProjectWork.Model.Tirocinio;
import dev2426.ITSProjectWork.Repository.TirociniRepository;

public class TirocinioService { 

	@Autowired
	private TirociniRepository repo;
	
	public List<Tirocinio> getAll() {
		
		return repo.findAll();
				
	}
	
	public Optional<Tirocinio> find(long idCerca) {
		return repo.findById(idCerca);
	}
	
	public void insert(Tirocinio nuova) {
		
		repo.save(nuova);
		
	}
	
	public void delete(long idCancella) {
		repo.deleteById(idCancella);
	}
	
	public void update(long idUpdate, Tirocinio nuova) {

		Optional<Tirocinio> found = repo.findById(idUpdate);
		Tirocinio t = found.get();

		t.setIdTirocinio(nuova.getIdTirocinio());
		t.setMansione(nuova.getMansione());
		t.setDurata(nuova.getDurata());
		
		repo.save(t);

	}	
}
