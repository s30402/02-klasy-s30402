package src.main.java;

public class Student {

    private String imie, nazwisko, index;
    private int obecnosc;
    private int ocena;

    public void setImie(String n) {
        this.imie = n;
    }
    public void setNazwisko(String n) {
        this.nazwisko = n;
    }
    public void setIndex(String n) {
        this.index = n;
    }
    public void setObecnosc(int n) {
        this.obecnosc = n;
    }
    public void setOcena(int n) {
        this.ocena = n;
    }

    // -- -- -- -- -- // -- -- -- -- -- // -- -- -- -- -- // -- -- -- -- -- //
    public String getImie() {

        if (this.imie == null) {
            this.imie = "Unknown";
        }

        return this.imie;
    }
    public String getNazwisko() {

        if (this.nazwisko == null) {
            this.nazwisko = "Unknown";
        }

        return this.nazwisko;
    }
    public String getIndex() {
        return this.index;
    }
    public int getObecnosc() {
        return this.obecnosc;
    }
    public int getOcena() {

        if (this.obecnosc < 0.5) {
            this.ocena = 2;
        }

        return this.ocena;
    }

    // -- -- -- -- -- // -- -- -- -- -- // -- -- -- -- -- // -- -- -- -- -- //
}
