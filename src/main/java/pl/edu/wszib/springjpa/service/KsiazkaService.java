package pl.edu.wszib.springjpa.service;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.springjpa.dao.AutorDao;
import pl.edu.wszib.springjpa.dao.KsiazkaDao;
import pl.edu.wszib.springjpa.model.Autor;
import pl.edu.wszib.springjpa.model.Ksiazka;
import pl.edu.wszib.springjpa.service.mapper.AutorMapper;
import pl.edu.wszib.springjpa.service.mapper.KsiazkaMapper;
import pl.edu.wszib.springjpa.service.model.DomainAutor;
import pl.edu.wszib.springjpa.service.model.DomainKsiazka;

import java.util.List;

@Service
public class KsiazkaService implements CrudService <DomainKsiazka, Integer> {

    private KsiazkaMapper mapper = Mappers.getMapper((KsiazkaMapper.class));

    @Autowired
    private KsiazkaDao ksiazkaDao;

    @Override
    public List<DomainKsiazka> list() {
        return mapper.mapToDomain(ksiazkaDao.findAll());
    }

    @Override
    public DomainKsiazka get(Integer integer) {
        return ksiazkaDao.findById(integer).map(ksiazka -> mapper.map(ksiazka)).orElse(null);
    }

    @Override
    public DomainKsiazka create(DomainKsiazka domainKsiazka) {
        domainKsiazka.setId(null);
        Ksiazka created = ksiazkaDao.save(mapper.map(domainKsiazka));
        return mapper.map(created);
    }

    @Override
    public DomainKsiazka update(DomainKsiazka domainKsiazka) {
        DomainKsiazka existing = get(domainKsiazka.getId());
        if (existing == null){
            return null;
        }
        Ksiazka updated = ksiazkaDao.save(mapper.map(domainKsiazka));
        return mapper.map(updated);
    }

    @Override
    public void delete(Integer integer) {
        ksiazkaDao.deleteById(integer);
    }
}
