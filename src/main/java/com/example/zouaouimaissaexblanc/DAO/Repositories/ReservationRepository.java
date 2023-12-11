package com.example.zouaouimaissaexblanc.DAO.Repositories;

import com.example.zouaouimaissaexblanc.DAO.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
    //List<Reservation> findReservationByClassPlaceAndEtatReservation(EtatReservation etatReservation);
   List<Reservation> findReservationByVoyageurs(Voyageur voyageur);

}