package com.mayssa.etudiants.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idEtudiant;
	private String nom;
	private String prenom;
	private Date dateNaiss;
	private String email;
	private String classe;
	@ManyToOne
	private Groupe groupe;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Etudiant(String nom, String prenom, Date dateNaiss, String email,String classe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.email = email;
		this.setClasse(classe);
	}

	public Long getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss
		+",email=" + email  +",classe="+classe+ "]";
	}
	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}



	
}
