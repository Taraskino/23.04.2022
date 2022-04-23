package pl.edu.wszib.springjpa.model;

import javax.persistence.*;
import java.util.List;
import java.util.PropertyPermission;

@Entity
@Table
public class Student {

  @Id
  @GeneratedValue
  private Integer id;
  private String imie;
  private String nazwisko;


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
}
