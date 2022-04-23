package pl.edu.wszib.springjpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Konto {

    @Id
    @GeneratedValue
    private Integer id;

    private String number;


    @ManyToMany
    @JoinTable(name = "konto_wlasciciel_konta",
        joinColumns = @JoinColumn(name = "konto_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "wlasciciel_id", referencedColumnName = "id")
    )
    private List<WlascicielKonta> wlasciciele;

}
