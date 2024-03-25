package com.example.demo.services;

import com.example.demo.models.Entreprise;

public interface interfaceServiceCE {
	Entreprise save(Entreprise a) ;
	Entreprise findBymatricule_fiscale_declarante(String a);
	

}
