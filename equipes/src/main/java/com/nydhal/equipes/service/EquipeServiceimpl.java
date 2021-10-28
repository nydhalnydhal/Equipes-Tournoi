package com.nydhal.equipes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nydhal.equipes.entities.Equipe;
import com.nydhal.equipes.repos.EquipeRepository;
@Service
public class EquipeServiceimpl implements EquipeService {
@Autowired
EquipeRepository equipeRepository;
@Override
public Equipe saveEquipe(Equipe E) {
return equipeRepository.save(E);
}
@Override
public  Equipe updateEquipe( Equipe E) {
return  equipeRepository.save(E);
}
@Override
public void deleteEquipe( Equipe E) {
	 equipeRepository.delete(E);
}
@Override
public void deleteEquipeById(Long id) {
	 equipeRepository.deleteById(id);
}
@Override
public  Equipe getEquipe(Long id) {
return  equipeRepository.findById(id).get();
}
@Override
public List< Equipe> getAllEquipes() {
return  equipeRepository.findAll();
}
}