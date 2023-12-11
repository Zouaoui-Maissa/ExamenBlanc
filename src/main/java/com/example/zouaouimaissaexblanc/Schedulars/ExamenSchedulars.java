package com.example.zouaouimaissaexblanc.Schedulars;

import com.example.zouaouimaissaexblanc.Servcies.IExBlanc;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ExamenSchedulars {

    IExBlanc iExBlanc ;

//    @Scheduled(cron = "/60 * * * * * *")
//    public void method() {
//          iExBlanc.annulerReservation();
//    }
}
