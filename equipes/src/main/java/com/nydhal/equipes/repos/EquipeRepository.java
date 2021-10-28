package com.nydhal.equipes.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nydhal.equipes.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {

}
