package com.example.zouaouimaissaexblanc.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@org.aspectj.lang.annotation.Aspect
@Slf4j
public class Aspect {

    //@Before("execution(* tn.esprit.spring.Services.*.get*(..))")
    //public void avant(JoinPoint JoinPoint) {
      //  log.info("In the method "+ JoinPoint.getSignature().getName() +" at " + new Date());
    //}

    //@After("execution(* tn.esprit.spring.Services.*.get*(..))")
    //public void avant(JoinPoint JoinPoint) {
    //  log.info("In the method "+ JoinPoint.getSignature().getName() +" at " + new Date());
    //}

    //@Around("execution(* tn.esprit.spring.Services.*.get*(..))")
    //@Around("execution(* tn.esprit.spring.service.ClientService.addClient(..))"
    //public void avant(JoinPoint JoinPoint) {
    //  log.info("In the method "+ JoinPoint.getSignature().getName() +" at " + new Date());
    //}

    @Around("execution(* com.example.zouaouimaissaexblanc.RestController.*.ajouter*(..))")
    public void apres(JoinPoint JoinPoint) {
        log.info("In the method "+ JoinPoint.getSignature().getName() +" In the package " +  JoinPoint.getClass().getName());
    }
}
