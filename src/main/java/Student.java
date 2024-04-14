package src.main.java;


public class Student {

    private String imie, nazwisko, index;
    private int ocena;

    private double obecnosc;

    public void setImie(String n) {
        this.imie = n;
    }
    public void setImie() { this.imie = "Unknown";}
    public void setNazwisko(String n) {
        this.nazwisko = n;
    }
    public void setNazwisko() { this.nazwisko = "Unknown";}
    public void setIndex(String n) {
        this.index = n;
    }
    public void setObecnosc(double n) {

        if (n > 1) {
            this.obecnosc = n / 100;
        } else {
            this.obecnosc = n;
        }
    }
    public void setOcena(int n) {

        try {
            if (n < 2 || n > 5) {
                throw new IllegalStateException("Oceny mają wartości od 2 do 5.");
            } else {
                this.ocena = n;
            }
        } catch (Exception e) {
            System.out.println("Oceny mają wartości od 2 do 5.");
            this.ocena = 2;
        }
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
    public double getObecnosc() {
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
