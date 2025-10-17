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
@Table(name = "competenza") 
public class Competenza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCompetenza;
	private String nome;
	public long getIdCompetenza() {
		return idCompetenza;
	}
	public void setIdCompetenza(long idCompetenza) {
		this.idCompetenza = idCompetenza;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Competenza(long idCompetenza, String nome) {
		this.idCompetenza = idCompetenza;
		this.nome = nome;
	}
	public Competenza() {
		
	}
	
}
