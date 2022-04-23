package pl.edu.wszib.springjpa.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Kategorja {

    @Id
    @GeneratedValue
    private Integer id;

    private String nazwa;

    @OneToMany(mappedBy = "kategorja")
    private List<Produkt> produkty;
}
