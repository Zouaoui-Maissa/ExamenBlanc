package com.example.zouaouimaissaexblanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Vol")
public class Vol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVol;

    @Column(name = "dateDepart")
    private LocalDate dateDepart;

    @Column(name = "dateArrive")
    private LocalDate dateArrive;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vols")
    private List<Reservation> reservationList;

    @ManyToOne
    private Aeroport aeroport;


    @ManyToOne
    private Aeroport aeroportt;

}
