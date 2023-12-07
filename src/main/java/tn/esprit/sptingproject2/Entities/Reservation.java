package tn.esprit.sptingproject2.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@ToString(exclude={"idReservation"}, includeFieldNames = false)
@Setter
@Getter
@Table(name = "reservation")
public class Reservation {

    @Id
    private String idReservation;


    @Column(name = "anneeUniversitaire")
    private LocalDate anneeUniversitaire; //JJ/MM/YYYY

    @Column(name = "estValide")
    private boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Etudiant> etudiants = new HashSet<>();


}
