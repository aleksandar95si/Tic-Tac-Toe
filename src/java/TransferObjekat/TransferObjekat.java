 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransferObjekat;

import DomenskiObjekat.GeneralDObject;
import DomenskiObjekat.Korisnik;
import java.io.Serializable;

/**
 *
 * @author aleks
 */

public class TransferObjekat implements Serializable{
   public Korisnik gdo; 
   public String poruka;
   public boolean signal; // signal o uspesnosti izvrsenja operacije.
   public int currentRecord = -1;
   public String igracNaPotezu="";
   public boolean krajIgre;
      
   public void postaviDK(GeneralDObject gdo)  {this.gdo = (Korisnik) gdo;}
   public String vratiPoruka(){return poruka;}
   public boolean vratiSignal(){return signal;} 
   public GeneralDObject vratiDK(){return (GeneralDObject) gdo;}
   public void postaviSignal(boolean signal) {this.signal = signal;}
   public void postaviIgracNaPotezu(String igracNaPotezu) {this.igracNaPotezu=igracNaPotezu;}
   public String vratiIgracNaPotezu() {return igracNaPotezu;}
   public String postaviPoruku(String poruka) {return this.poruka=poruka;}
   public void postaviKrajIgre(boolean krajIgre) {this.krajIgre=krajIgre;}
}