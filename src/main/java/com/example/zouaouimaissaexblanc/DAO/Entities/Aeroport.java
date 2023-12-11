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
@Table(name = "Aeroport")
public class Aeroport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAeroport;

    @Column(name = "nom")
    private String nom;

    @Column(name = "codeAITA")
    private String codeAITA;

    @Column(name = "telephone")
    private long telephone;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "aeroport")
    private List<Vol> vols ;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "aeroportt")
    private List<Vol> volsl;
}
