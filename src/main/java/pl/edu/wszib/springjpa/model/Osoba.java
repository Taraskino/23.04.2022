package pl.edu.wszib.springjpa.model;


import io.swagger.v3.oas.models.security.SecurityScheme;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table
public class Osoba {

    @Id
    @GeneratedValue
    private Integer id;
    private String imie;
    private String nazwisko;


    @OneToOne(mappedBy = "osoba")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Pracownik pracownik;
}
