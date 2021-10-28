package com.nydhal.equipes.service;

import java.util.List;
import com.nydhal.equipes.entities.Equipe;
public interface EquipeService {
	Equipe saveEquipe(Equipe E);
	Equipe updateEquipe(Equipe E);
	void deleteEquipe(Equipe E);
	void deleteEquipeById(Long id);
	Equipe getEquipe(Long id);
	List<Equipe> getAllEquipes();

}
