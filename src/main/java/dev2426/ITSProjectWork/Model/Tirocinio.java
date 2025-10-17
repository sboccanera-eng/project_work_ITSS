package dev2426.ITSProjectWork.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tirocinio")
public class Tirocinio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTirocinio;
	private String mansione;
	private String durata;
	public long getIdTirocinio() {
		return idTirocinio;
	}
	public void setIdTirocinio(long idTirocinio) {
		this.idTirocinio = idTirocinio;
	}
	public String getMansione() {
		return mansione;
	}
	public void setMansione(String mansione) {
		this.mansione = mansione;
	}
	public String getDurata() {
		return durata;
	}
	public void setDurata(String durata) {
		this.durata = durata;
	}
	public Tirocinio(long idTirocinio, String mansione, String durata) {
		this.idTirocinio = idTirocinio;
		this.mansione = mansione;
		this.durata = durata;
	}
	public Tirocinio() {

	}
	
}
