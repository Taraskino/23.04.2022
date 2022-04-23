package pl.edu.wszib.springjpa.service.model;

import io.swagger.v3.oas.models.security.SecurityScheme;

public class DomainAutor {
    private Integer id;
    private String imie;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    private String nazwisko;
}
