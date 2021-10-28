package com.nydhal.equipes;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.nydhal.equipes.entities.Equipe;
import com.nydhal.equipes.repos.EquipeRepository;
@SpringBootTest
class EquipesApplicationTests {
@Autowired
private EquipeRepository EquipeRepository;
@Test
public void testCreateEquipe() {
Equipe Equip = new Equipe("PC Dell",2200.500,new Date());
EquipeRepository.save(Equip);
}

@Test
public void testFindEquipe()
{
Equipe E = EquipeRepository.findById(1L).get();

System.out.println(E);
}
@Test
public void testUpdateEquipe()
{
Equipe E = EquipeRepository.findById(1L).get();
E.setPrixEquipe(2000.0);
EquipeRepository.save(E);
}
@Test
public void testDeleteEquipe()
{
EquipeRepository.deleteById(1L);;
}
@Test
public void testListerTousEquipes()
{
List<Equipe> Equip = EquipeRepository.findAll();
for (Equipe E : Equip)
{
System.out.println(E);
}
}
}

