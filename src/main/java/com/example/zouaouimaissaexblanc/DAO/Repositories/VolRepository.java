package com.example.zouaouimaissaexblanc.DAO.Repositories;

import com.example.zouaouimaissaexblanc.DAO.Entities.Reservation;
import com.example.zouaouimaissaexblanc.DAO.Entities.Vol;
import com.example.zouaouimaissaexblanc.DAO.Entities.Voyageur;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Function;

public interface VolRepository extends JpaRepository<Vol,Long> {

    Vol findByIdVol(long volId);

    //List<Reservation> findReservationByVoyageurs(Voyageur voyageur);
    List<Vol> findByDateDepart(LocalDate ld);


}
