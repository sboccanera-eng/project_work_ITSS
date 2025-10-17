package dev2426.ITSProjectWork.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "candidatura")
public class Candidatura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCandidatura;
	private long idTirocinio;
	private int stato;
	private String orarioLavoro;
	public long getIdCandidatura() {
		return idCandidatura;
	}
	public void setIdCandidatura(long idCandidatura) {
		this.idCandidatura = idCandidatura;
	}
	public long getIdTirocinio() {
		return idTirocinio;
	}
	public void setIdTirocinio(long idTirocinio) {
		this.idTirocinio = idTirocinio;
	}
	public int getStato() {
		return stato;
	}
	public void setStato(int stato) {
		this.stato = stato;
	}
	public String getOrarioLavoro() {
		return orarioLavoro;
	}
	public void setOrarioLavoro(String orarioLavoro) {
		this.orarioLavoro = orarioLavoro;
	}
	public Candidatura(long idCandidatura, long idTirocinio, int stato, String orarioLavoro) {
		this.idCandidatura = idCandidatura;
		this.idTirocinio = idTirocinio;
		this.stato = stato;
		this.orarioLavoro = orarioLavoro;
	}
	public Candidatura() {

	}
		
}
