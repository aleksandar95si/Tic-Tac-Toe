/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import SistemskeOperacije.AzuriranjeEkranskeForme;
import SistemskeOperacije.IgracNaPotezu;
import SistemskeOperacije.LogikaIgre;
import TransferObjekat.TransferObjekat;
import javax.jws.WebService;

/**
 *
 * @author aleks
 */
@WebService(serviceName = "GenerickiKontrolerServer")
public class GenerickiKontrolerServer {

    
   public TransferObjekat prvaMetoda(TransferObjekat gto) {
       new IgracNaPotezu().igracNaPotezu(gto);
       //System.out.println(gto);
       
       return gto;
   }
   
    public TransferObjekat pocetnaVrednost(TransferObjekat gto) {
        new LogikaIgre().kreiranjeMatrice();
        new IgracNaPotezu().pocetnaVrednost(gto);
        return gto;
    }
    
    public TransferObjekat azurirajPromene(TransferObjekat gto) {
        new LogikaIgre().azurirajMatricu(gto);
        new AzuriranjeEkranskeForme().azurirajPromene(gto);
        return gto;
    }
    
    public TransferObjekat proveriPromene(TransferObjekat gto) {
            new AzuriranjeEkranskeForme().proveriPromene(gto);
            new LogikaIgre().proveriDaLiJeKrajIgre(gto);
        return gto;
    }
}
