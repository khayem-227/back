package com.example.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Entreprise;
import com.example.demo.repositories.CompteEntrepriseRepositry;
@Service
public class CompteEntrepriseService implements interfaceServiceCE {
  @Autowired
	private CompteEntrepriseRepositry CompteEntrepriseRepositry;
  
	public Entreprise save(Entreprise a) {
		return CompteEntrepriseRepositry.save(a);
		
	}

	
	public Entreprise findBymatricule_fiscale_declarante(String a) {
	
	 return CompteEntrepriseRepositry.findByMatriculeFiscaleDeclarante(a);
	}


	

}
