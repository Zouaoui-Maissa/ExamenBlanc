package com.example.zouaouimaissaexblanc.Servcies;

import com.example.zouaouimaissaexblanc.DAO.Entities.ClassPlace;
import com.example.zouaouimaissaexblanc.DAO.Entities.Reservation;
import com.example.zouaouimaissaexblanc.DAO.Entities.Vol;
import com.example.zouaouimaissaexblanc.DAO.Entities.Voyageur;

import java.util.List;
import java.util.Map;

public interface IExBlanc {


    String ajouterVolEtAeroport(Vol vol);
    String reserverVol(int voyageurId, int volId, ClassPlace classPlace);

    List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs);

    //Reservation confirmerReservation(String resId);

    Map<Integer,List<Voyageur>> getVoyageurNyVol();

    void annulerReservation();

    Vol findById(long id);

}
