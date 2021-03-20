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
public class LogikaIgre {

    SharedClass sc;

    public LogikaIgre() {
        this.sc = SharedClass.getInctanceSharredClass();
    }

    public void kreiranjeMatrice() {
        if (sc.getMatrica() == null) {
            int[][] matrica = new int[3][3];
            for (int i = 0; i < matrica.length; i++) {
                for (int y = 0; y < matrica[0].length; y++) {
                    matrica[i][y] = 0;
                }
            }
            sc.setMatrica(matrica);
        }
    }

    public void proveriDaLiJeKrajIgre(TransferObjekat gto) {
        if (sc.getMatrica() != null) {
            int[][] matrica = sc.getMatrica();
          //  if (matrica[0][0] != 0 && matrica[1][1] != 0 && matrica[2][2] != 0) {
                System.out.println("USO SAM U PROVERU");
                if (matrica[0][0] == matrica[0][1] && matrica[0][0] == matrica[0][2] &&
                    matrica[0][0] != 0 && matrica[0][1] !=0 && matrica[0][2]!=0) {
                    sc.setKrajIgre(true); //neka ga za slucaj da treba
                    //gto.postaviKrajIgre(true);
                    gto.postaviSignal(true); //
                } //

                if (matrica[1][0] == matrica[1][1] && matrica[1][0] == matrica[1][2] &&
                    matrica[1][0] != 0 && matrica[1][1] !=0 && matrica[1][2]!=0) {
                    System.out.println("DRUGA HORIZONTALA");
                    sc.setKrajIgre(true);
                    //gto.postaviKrajIgre(true);
                    gto.postaviSignal(true); //
                }

                if (matrica[2][0] == matrica[2][1] && matrica[2][0] == matrica[2][2] &&
                    matrica[2][0] != 0 && matrica[2][1] !=0 && matrica[2][2]!=0) {
                    sc.setKrajIgre(true);
                    //gto.postaviKrajIgre(true);
                    gto.postaviSignal(true);
                } //

                if (matrica[0][0] == matrica[1][0] && matrica[0][0] == matrica[2][0] &&
                    matrica[0][0] != 0 && matrica[1][0] !=0 && matrica[2][0]!=0) {
                    System.out.println("PRVA VERTIKALA");
                    sc.setKrajIgre(true);
                    //gto.postaviKrajIgre(true);
                    gto.postaviSignal(true);
                }

                if (matrica[0][1] == matrica[1][1] && matrica[0][1] == matrica[2][1] &&
                    matrica[0][1] != 0 && matrica[1][1] !=0 && matrica[2][1]!=0) {
                    sc.setKrajIgre(true);
                    //gto.postaviKrajIgre(true);
                    gto.postaviSignal(true);
                }

                if (matrica[0][2] == matrica[1][2] && matrica[0][2] == matrica[2][2] &&
                    matrica[0][2] != 0 && matrica[1][2] !=0 && matrica[2][2]!=0) {
                    sc.setKrajIgre(true);
                    //gto.postaviKrajIgre(true);
                    gto.postaviSignal(true); //
                }

                if (matrica[0][0] == matrica[1][1] && matrica[0][0] == matrica[2][2] &&
                    matrica[0][0] != 0 && matrica[1][1] !=0 && matrica[2][2]!=0) {
                    System.out.println("PRVA DIJAGONALA");
                    sc.setKrajIgre(true);
                    //gto.postaviKrajIgre(true);
                    gto.postaviSignal(true);
                }

                if (matrica[2][0] == matrica[1][1] && matrica[2][0] == matrica[0][2] &&
                    matrica[2][0] != 0 && matrica[1][1] !=0 && matrica[0][2]!=0) {
                    System.out.println("DRUGA DIJAGONALA");
                    sc.setKrajIgre(true);
                    //gto.postaviKrajIgre(true);
                    gto.postaviSignal(true);
                }
           // }
        }
    }

    public void azurirajMatricu(TransferObjekat gto) {

        int red = Integer.parseInt(gto.vratiPoruka().substring(3));
        int kolona = Integer.parseInt(gto.vratiPoruka().substring(2, 3));

        String igrac = gto.vratiPoruka().substring(0, 1);
        System.out.println(red + " " + kolona + " " + igrac);
        if (igrac.equals("X")) {
            sc.apdejtujMatricu(red, kolona, 1); // Za X se u matrici upisuje vrednost 1

        }
        //
        if (igrac.equals("O")) { 
            sc.apdejtujMatricu(red, kolona, 2); // Za O se u matrici upisuje vrednost 2
        }
    }

}
