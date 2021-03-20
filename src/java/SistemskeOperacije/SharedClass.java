/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemskeOperacije;

/**
 *
 * @author aleks
 */
public class SharedClass {
    String igracNaPotezuShared="";
    String poruka="";
    int[][] matrica=null;
    boolean krajIgre=false;

    static SharedClass sc=new SharedClass();
    
    private SharedClass() {
    
    }
    
    public static SharedClass getInctanceSharredClass() {
        return sc;
    }
    
    
    public String getIgracNaPotezuShared() {
        return igracNaPotezuShared;
    }
    
    public void setIgracNaPotezuShared(String s) {
        
        if(s.equals("X")) {
            igracNaPotezuShared="O";
        }
        if(s.equals("O")) {
            igracNaPotezuShared="X";
        }
          if(s.equals("")) {
            igracNaPotezuShared="X";
        }
    }
    
    public String getPoruka() {
        return poruka;
    }
    
    public void setPoruka(String poruka) {
        this.poruka=poruka;
    }
    
    public int[][] getMatrica() {
        return matrica;
    }
    
    public void setMatrica(int[][] matrica) {
        this.matrica=matrica;
    }
    
    public void apdejtujMatricu(int red, int kolona, int vrednost) {
        
        System.out.println(red + " " + kolona + " " + vrednost);
        this.matrica[red][kolona]=vrednost;
        
         for(int i=0;i<matrica.length;i++) {
           for(int y=0; y<matrica[0].length;y++) {
               
               System.out.print(" "+matrica[i][y]);
               //System.out.printf(" ");
           }
        System.out.println(" ");
        }
        
    }
    
    public boolean getKrajIgre() {
        return krajIgre;
    }
    
    public void setKrajIgre(boolean krajIgre){
        this.krajIgre=krajIgre;
    }
}
