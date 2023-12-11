package com.example.zouaouimaissaexblanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Voyageur")
public class Voyageur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVoyageur;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "dateNaissance")
    private Date dateNaissance;

    @OneToMany(mappedBy = "voyageurs")
    private List<Reservation> reservations;
}
