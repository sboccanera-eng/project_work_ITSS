package dev2426.ITSProjectWork.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "azienda")
public class Azienda {
	
	private long idAzienda;
	private String nome;
	private String localita;
	private String partitaIva;
	private long idTirocinio;

}
