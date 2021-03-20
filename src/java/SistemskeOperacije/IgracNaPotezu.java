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
public class IgracNaPotezu {

    TransferObjekat to;
    SharedClass sc;
    
     public IgracNaPotezu() {
       sc=SharedClass.getInctanceSharredClass();
    }
  

    public void igracNaPotezu(TransferObjekat to) {
        sc.setIgracNaPotezuShared(to.vratiIgracNaPotezu());
        to.postaviIgracNaPotezu(sc.getIgracNaPotezuShared());
        
        
    }
    
    public void pocetnaVrednost(TransferObjekat to) {
        to.postaviIgracNaPotezu(sc.getIgracNaPotezuShared());
    }
    
    
    
}
