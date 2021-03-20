package DomenskiObjekat;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aleks
 */
public class Korisnik extends GeneralDObject implements Serializable{

    public int idKorisnik;
    public String korisnickoIme;
    public String sifra;
    public String ime;
    public String prezime;
    public int brojPobeda;
    public int brojPoraza;
    public Date datumRodjenja;

    public Korisnik() {
        idKorisnik = 0;
        korisnickoIme = "";
        sifra = "";
        ime = "";
        prezime = "";
        brojPobeda = 0;
        brojPoraza = 0;
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        datumRodjenja = new Date();
        datumRodjenja = java.sql.Date.valueOf(sm.format(datumRodjenja));
    }

    public Korisnik(int idKorisnik, String korisnickoIme, String sifra, String ime, String prezime, int brojPobeda, int brojPoraza, Date datumRodjenja) {
        this.idKorisnik = idKorisnik;
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
        this.ime = ime;
        this.prezime = prezime;
        this.brojPobeda = brojPobeda;
        this.brojPoraza = brojPoraza;
        this.datumRodjenja = datumRodjenja;
    }

    // primarni kljuc
    public Korisnik(int idKorisnik) {
        this.idKorisnik = idKorisnik;
    }

    public void setID(int id) {
        this.idKorisnik = id;
    }

    public int getPrimaryKey() {
        return this.idKorisnik;
    }

    @Override
    public GeneralDObject getNewRecord(ResultSet rs) throws SQLException {
        return new Korisnik(rs.getInt("idKorisnik"), rs.getString("korisnickoIme"), rs.getString("sifra"), rs.getString("ime"), rs.getString("prezime"), rs.getInt("brojPobeda"), rs.getInt("brojPoraza"), rs.getDate("datumRodjenja"));
    }

    @Override
    public String getAtrValue() {
        return idKorisnik + ", " + (korisnickoIme == null ? null : "'" + korisnickoIme + "'") + ", " + (sifra == null ? null : "'" + sifra + "'") + ", " + (ime == null ? null : "'" + ime + "'") + ", " + (prezime == null ? null : "'" + prezime + "'") + ", " + brojPobeda + ", " + brojPoraza + ", " + "'" + datumRodjenja + "'";
    }

    @Override
    public String setAtrValue() {
        return "idKorisnik=" + idKorisnik + ", " + "korisnickoIme=" + (korisnickoIme == null ? null : "'" + korisnickoIme + "'") + ", " + "sifra=" + (sifra == null ? null : "'" + sifra + "'") + ", " + "ime=" + (ime == null ? null : "'" + ime + "'") + ", " + "prezime=" + (prezime == null ? null : "'" + prezime + "'") + ", " + "brojPobeda=" + brojPobeda + ", " + "brojPoraza=" + brojPoraza + ", " + "datumRodjenja=" + "'" + getdatumRodjenja1(datumRodjenja) + "'";
    }

    @Override
    public String getClassName() {
        return "KorisnikIksOks";
    }

    @Override
    public String getWhereCondition() {
        return "idKorisnik = " + idKorisnik;
    }

    @Override
    public String getNameByColumn(int column) {
        String names[] = {"idKorisnik", "korisnickoIme", "sifra", "ime", "prezime", "brojPobeda", "brojPoraza", "datumRodjenja"};
        return names[column];
    }

    public String[] getNameAtributes() {
        String names[] = {"idKorisnik", "korisnickoIme", "sifra", "ime", "prezime", "brojPobeda", "brojPoraza", "datumRodjenja"};
        return names;
    }

    @Override
    public String poruka1() {
        return "Problem oko brojaca korisnika.";
    }

    @Override
    public String poruka2() {
        return "Ne moze da se poveca brojac korisnika.";
    }

    @Override
    public String poruka3() {
        return "Korisnik je kreiran.";
    }

    @Override
    public String poruka4() {
        return "Nije mogao da bude kreiran korisnik.";
    }

    @Override
    public String poruka5() {
        return "Korisnik je obrisan.";
    }

    @Override
    public String poruka6() {
        return "Nije mogao da se obrise korisnik.";
    }

    @Override
    public String poruka7() {
        return "Ne moze se obrisati korisnik jer ne postoji.";
    }

    @Override
    public String poruka8() {
        return "Korisnik je promenjen.";
    }

    @Override
    public String poruka9() {
        return "Nije mogao da se promeni korisnik.";
    }

    @Override
    public String poruka10() {
        return "Ne moze se promeniti korisnik jer ne postoji.";
    }

    public java.util.Date getdatumRodjenja1(java.util.Date datumRodjenja)
      {SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
       this.datumRodjenja = java.sql.Date.valueOf(sm.format(datumRodjenja)); 
       return this.datumRodjenja;
      } 
    
}
