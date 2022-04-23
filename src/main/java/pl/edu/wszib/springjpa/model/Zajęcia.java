package pl.edu.wszib.springjpa.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table
public class Zajęcia {
  @Id
  @GeneratedValue
  private Integer id;
  private String nazwa;
  @ManyToMany
  @JoinTable(name = "zajecia_student",
          joinColumns = @JoinColumn(name = "zajęcia_id", referencedColumnName = "id"),
          inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id")
  )
  private List<Student> student;

  @ManyToOne
  @JoinColumn
  private Prowadzacy prowadzacy;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public List<Student> getStudent() {
    return student;
  }

  public void setStudent(List<Student> student) {
    this.student = student;
  }

  public Prowadzacy getProwadzacy() {
    return prowadzacy;
  }

  public void setProwadzacy(Prowadzacy prowadzacy) {
    this.prowadzacy = prowadzacy;
  }
}
