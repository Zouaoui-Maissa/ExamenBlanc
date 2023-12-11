package com.example.zouaouimaissaexblanc.Servcies;

import com.example.zouaouimaissaexblanc.DAO.Entities.*;
import com.example.zouaouimaissaexblanc.DAO.Repositories.AeroportRepository;
import com.example.zouaouimaissaexblanc.DAO.Repositories.ReservationRepository;
import com.example.zouaouimaissaexblanc.DAO.Repositories.VolRepository;
import com.example.zouaouimaissaexblanc.DAO.Repositories.VoyageurRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
@AllArgsConstructor
public class ExBlancService implements IExBlanc{

    @Autowired
    AeroportRepository aeroportRepository;
    @Autowired
    VolRepository volRepository;
    @Autowired
    VoyageurRepository voyageurRepository;
    @Autowired
    ReservationRepository reservationRepository;
    @Override
    public String ajouterVolEtAeroport(Vol vol) {
        if(vol.getAeroport().getCodeAITA().equals(vol.getAeroportt().getCodeAITA())){
        return "Verifier les aeroports saisis !!";
        }else{
            volRepository.save(vol);
            return "Vol ajoute avec succes";
        }
    }



    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
        return voyageurRepository.saveAll(voyageurs);
    }

    @Override
    public String reserverVol(int voyageurId, int volId, ClassPlace classePlace) {
       /* Reservation reservation = new Reservation();
        String eco = "ECO-";
        String bui = "BUS-";
        Vol v = VolRepository.findByIdVol(volId);
        if (classePlace == ClassPlace.ECONOMIQUE) {
            List<Reservation> reservations = reservationRepository.findReservationByClassPlaceAndEtatReservation(ClassPlace.ECONOMIQUE,volId);

            if (reservations.size()<=3) {
                reservation.setIdReservation("ECO-" + volId + "-" + voyageurId);
                reservation.setDateReservation(LocalDate.now());
                reservation.setClassPlace(ClassPlace.ECONOMIQUE);
                reservation.setEtatReservation(EtatReservation.ENCOURS);
                reservationRepository.save(reservation);
                return "Affectation avec succes"+reservation.getIdReservation();
            }else
                return classePlace+" du vol "+volId+" est  complet";
        } else if (classePlace == ClassPlace.BUSINESS) {
            List<Reservation> reservations = reservationRepository.findReservationByClassPlaceAndEtatReservation(ClassPlace.BUSINESS,volId);
            if (reservations.size() <= 2) {
                reservation.setIdReservation("ECO-" + volId + "-" + voyageurId);
                reservation.setDateReservation(LocalDate.now());
                reservation.setClassPlace(ClassPlace.BUSINESS);
                reservation.setEtatReservation(EtatReservation.ENCOURS);
                return "Affectation avec succes"+reservation.getIdReservation();
            } else
                return classePlace+" du vol "+volId+" est  complet";
        }*/
        return "";
    }
    @Override
    public Map<Integer, List<Voyageur>> getVoyageurNyVol() {

        return null;
    }


    @Override
    public void annulerReservation() {

        /*List<Reservation> reservations = reservationRepository.findReservationByClassPlaceAndEtatReservation(EtatReservation.ENCOURS);
        for (Reservation reservation: reservations){
            reservationRepository.save(reservation);
        }*/

    }

    @Override
    public Vol findById(long id) {
        return volRepository.findById(id).orElse(Vol.builder().idVol(0).build());

    }
}
