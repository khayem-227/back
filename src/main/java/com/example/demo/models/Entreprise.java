package com.example.demo.models;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Entreprise")
public class Entreprise {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "matricule_fiscale_declarante", unique = true)
	    
	    private String matriculeFiscaleDeclarante; 
    @Column(name = "raison_social")
    private String raisonSocial;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "forme_juridique")
    private String formeJuridique;
    @Column(name="nationalité")
    private String nationalite;
    
    @Column(name = "adresse_siege_social_etablissement_tunisie")
    private String adresseSiegeSocialEtablissementTunisie;
    
    @Column(name = "code_postal")
    private String codePostal;
    
    @Column(name = "activite_principale")
    private String activitePrincipale;
    
    @Column(name = "activite_secondaire")
    private String activiteSecondaire;
    
    @Column(name = "code_categorie")
    private String codeCategorie;
    
    @Column(name = "code_tva")
    private String codeTVA;
    
    @Column(name = "code_activite")
    private String codeActivite;

	public String getMatriculeFiscaleDeclarante() {
		return matriculeFiscaleDeclarante;
	}

	public void setMatriculeFiscaleDeclarante(String matriculeFiscaleDeclarante) {
		this.matriculeFiscaleDeclarante = matriculeFiscaleDeclarante;
	}

	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	public String getFormeJuridique() {
		return formeJuridique;
	}

	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getAdresseSiegeSocialEtablissementTunisie() {
		return adresseSiegeSocialEtablissementTunisie;
	}

	public void setAdresseSiegeSocialEtablissementTunisie(String adresseSiegeSocialEtablissementTunisie) {
		this.adresseSiegeSocialEtablissementTunisie = adresseSiegeSocialEtablissementTunisie;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getActivitePrincipale() {
		return activitePrincipale;
	}

	public void setActivitePrincipale(String activitePrincipale) {
		this.activitePrincipale = activitePrincipale;
	}

	public String getActiviteSecondaire() {
		return activiteSecondaire;
	}

	public void setActiviteSecondaire(String activiteSecondaire) {
		this.activiteSecondaire = activiteSecondaire;
	}

	public String getCodeCategorie() {
		return codeCategorie;
	}

	public void setCodeCategorie(String codeCategorie) {
		this.codeCategorie = codeCategorie;
	}

	public String getCodeTVA() {
		return codeTVA;
	}

	public void setCodeTVA(String codeTVA) {
		this.codeTVA = codeTVA;
	}

	public String getCodeActivite() {
		return codeActivite;
	}

	public void setCodeActivite(String codeActivite) {
		this.codeActivite = codeActivite;
	}


}
