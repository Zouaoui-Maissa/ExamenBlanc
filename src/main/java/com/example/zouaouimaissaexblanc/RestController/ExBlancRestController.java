package com.example.zouaouimaissaexblanc.RestController;

import com.example.zouaouimaissaexblanc.DAO.Entities.Reservation;
import com.example.zouaouimaissaexblanc.DAO.Entities.Vol;
import com.example.zouaouimaissaexblanc.DAO.Entities.Voyageur;
import com.example.zouaouimaissaexblanc.DAO.Repositories.AeroportRepository;
import com.example.zouaouimaissaexblanc.DAO.Repositories.VolRepository;
import com.example.zouaouimaissaexblanc.Servcies.IExBlanc;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ExBlancRestController {

    IExBlanc iExBlanc;

    @PostMapping("ajouterBank")
    public String ajouterVolEtAeroport(@RequestBody Vol vol) {
        return iExBlanc.ajouterVolEtAeroport(vol);
    }

    @PostMapping("ajouterVoyageurs")
    public List<Voyageur> ajouterVoyageurs(@RequestBody List<Voyageur> voyageurs) {
        return iExBlanc.ajouterVoyageurs(voyageurs);
    }

    @PostMapping("confirmerReservation")
    public Reservation confirmerReservation(@RequestBody String resId) {
       // return iExBlanc.confirmerReservation(resId);
        return null;
    }



}
