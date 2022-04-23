package pl.edu.wszib.springjpa.model;

import javax.persistence.*;

@Entity
@Table
public class Pracownik {

    @Id
    @GeneratedValue
    private Integer id;
    private String stanowisko;

    @OneToOne
    @JoinColumn
    private Osoba osoba;
}
