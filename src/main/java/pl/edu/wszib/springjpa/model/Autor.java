package pl.edu.wszib.springjpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Autor {
@Id
@GeneratedValue
  private Integer id;
  private String imie;
  private String nazwisko;

  @ManyToMany(mappedBy = "autorzy")
  private List<Ksiazka> ksiazki;

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

  public List<Ksiazka> getKsiazki() {
    return ksiazki;
  }

  public void setKsiazki(List<Ksiazka> ksiazki) {
    this.ksiazki = ksiazki;
  }
}
