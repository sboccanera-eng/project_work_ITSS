package dev2426.ITSProjectWork.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev2426.ITSProjectWork.Model.Azienda;
import dev2426.ITSProjectWork.Repository.AziendeRepository;

@Service
public class AziendaService {
	
	@Autowired
	private AziendeRepository Aziende;
	
	public List<Azienda> getAllAziende(){
		return Aziende.findAll();
	}
	
	public void insertAzienda(Azienda nuovaAzienda) {
		Aziende.save(nuovaAzienda);
	}
	
	public void deleteAzienda(long idCancella) {
		Aziende.deleteById(idCancella);
	}
	
	public Optional<Azienda> findAzienda(long idAzienda){
		return Aziende.findById(idAzienda);
	}
	
	public void updateAzienda(Azienda nuovaAzienda, long idAzienda) {
		Optional<Azienda> aziendaDaTrovare = Aziende.findById(idAzienda);
		Azienda a = aziendaDaTrovare.get();
	}
	

}
