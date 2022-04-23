package pl.edu.wszib.springjpa.service.mapper;

import org.mapstruct.*;
import pl.edu.wszib.springjpa.model.Autor;
import pl.edu.wszib.springjpa.model.Ksiazka;
import pl.edu.wszib.springjpa.service.model.DomainAutor;
import pl.edu.wszib.springjpa.service.model.DomainKsiazka;

import java.util.List;

@Mapper(uses = {AutorMapper.class})
public interface KsiazkaMapper {

    @Mapping(source = "id", target = "id")
    DomainKsiazka map (Ksiazka ksiazka);

    Ksiazka map (DomainKsiazka domainKsiazka);

    List<DomainKsiazka> mapToDomain(List<Ksiazka> ksiazki);

    @BeforeMapping
    default void before(@MappingTarget Ksiazka target, DomainKsiazka source){

    }
    @AfterMapping
    default void after(@MappingTarget Ksiazka target, DomainKsiazka source){

    }

}
