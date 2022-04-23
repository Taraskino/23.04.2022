package pl.edu.wszib.springjpa.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.springjpa.model.Autor;
import pl.edu.wszib.springjpa.model.Ksiazka;

import java.util.List;

@Repository
public interface KsiazkaDao extends JpaRepository<Ksiazka, Integer> {

}
