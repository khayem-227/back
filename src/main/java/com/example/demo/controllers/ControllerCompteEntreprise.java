package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Entreprise;
import com.example.demo.services.CompteEntrepriseService;

@RestController
public class ControllerCompteEntreprise {
	@Autowired
	private CompteEntrepriseService CompteEntrepriseService;
	
	@PostMapping("/Entreprise")
	public Entreprise save(@RequestBody Entreprise a) {
		return CompteEntrepriseService.save(a);
		
	}
	@GetMapping("/Entreprise/{matriculeFiscaleDeclarante}")
	public Entreprise findbymatricule(@PathVariable("matriculeFiscaleDeclarante") String matriculeFiscaleDeclarante) {
		return CompteEntrepriseService.findBymatricule_fiscale_declarante(matriculeFiscaleDeclarante);
	}
}
