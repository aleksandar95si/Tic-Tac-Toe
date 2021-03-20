/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemskeOperacije;

import TransferObjekat.TransferObjekat;

/**
 *
 * @author aleks
 */
public class AzuriranjeEkranskeForme {
    //TransferObjekat to;
    SharedClass sc;
    
     public AzuriranjeEkranskeForme() {
       sc=SharedClass.getInctanceSharredClass();
    }

     public void azurirajPromene(TransferObjekat gto) {
         //zasto uopste if?
       
         sc.setPoruka(gto.vratiPoruka());
         /*  
         
         
         if(gto.vratiPoruka().equals("Xp00")) {
             sc.setPoruka("Xp00");
         }
         
          if(gto.vratiPoruka().equals("Xp01")) {
             sc.setPoruka("Xp01");
         }
          
           if(gto.vratiPoruka().equals("Xp02")) {
             sc.setPoruka("Xp02");
         }
           
            if(gto.vratiPoruka().equals("Xp10")) {
             sc.setPoruka("Xp10");
         }
            
             if(gto.vratiPoruka().equals("Xp11")) {
             sc.setPoruka("Xp11");
         }
             
              if(gto.vratiPoruka().equals("Xp12")) {
             sc.setPoruka("Xp12");
         }
              
               if(gto.vratiPoruka().equals("Xp20")) {
             sc.setPoruka("Xp20");
         }
               
                if(gto.vratiPoruka().equals("Xp21")) {
             sc.setPoruka("Xp21");
         }
                
                 if(gto.vratiPoruka().equals("Xp22")) {
             sc.setPoruka("Xp22");
         }
                 
                 if(gto.vratiPoruka().equals("Op00")) {
             sc.setPoruka("Op00");
         }
         
          if(gto.vratiPoruka().equals("Op01")) {
             sc.setPoruka("Op01");
         }
          
           if(gto.vratiPoruka().equals("Op02")) {
             sc.setPoruka("Op02");
         }
           
            if(gto.vratiPoruka().equals("Op10")) {
             sc.setPoruka("Op10");
         }
            
             if(gto.vratiPoruka().equals("Op11")) {
             sc.setPoruka("Op11");
         }
             
              if(gto.vratiPoruka().equals("Op12")) {
             sc.setPoruka("Op12");
         }
              
               if(gto.vratiPoruka().equals("Op20")) {
             sc.setPoruka("Op20");
         }
               
                if(gto.vratiPoruka().equals("Op21")) {
             sc.setPoruka("Op21");
         }
                
                 if(gto.vratiPoruka().equals("Op22")) {
             sc.setPoruka("Op22");
         }
                 */
     }
     
     public void proveriPromene(TransferObjekat gto) {
         gto.postaviPoruku(sc.getPoruka());
     }
}
