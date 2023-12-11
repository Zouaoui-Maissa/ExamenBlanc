package com.example.zouaouimaissaexblanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Reservation")
public class Reservation {

    @Id
    private String idReservation;

    @Column(name = "dateReservation")
    private LocalDate dateReservation;

    @Column(name = "classPlace")
    private ClassPlace classPlace;

    @Column(name = "etatReservation")
    private EtatReservation etatReservation;

    @ManyToOne
    private Voyageur voyageurs;

    @ManyToOne
    private Vol vols;
}
