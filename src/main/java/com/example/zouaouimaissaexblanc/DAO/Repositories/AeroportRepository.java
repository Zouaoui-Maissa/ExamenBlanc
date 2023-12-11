package com.example.zouaouimaissaexblanc.DAO.Repositories;

import com.example.zouaouimaissaexblanc.DAO.Entities.Aeroport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AeroportRepository extends JpaRepository<Aeroport,Long> {
    Aeroport findAeroportByCodeAITA(String codeATIA);
}
