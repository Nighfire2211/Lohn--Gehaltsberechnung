/**
 * The type Lohn abrechnung.
 */
public class LohnAbrechnung extends Abrechnung
{
    /*
        private Variablen
     */
    private int stundenLohn,anzahlStunden;

    /**
     * Instantiates a new Lohn abrechnung.
     *
     * @param p           the p
     * @param m           the m
     * @param stundenlohn the stundenlohn
     * @param stunden     the stunden
     */
/*
        Konstruktor mit Parametern: Periode (von Klasse Abrechnung geerbt), Objekt "Mitarbeiter", stundenlohn, stunden = anzahlstunden
     */
    public LohnAbrechnung(int p, Mitarbeiter m, int stundenlohn , int stunden)
    {
        super();
      this.periode = p;
      this.mitarbeiter = m;
      this.stundenLohn = stundenlohn;
      this.anzahlStunden = stunden;
      getVerdienst();
    }

    /**
     * Gets anzahl stunden.
     *
     * @return the anzahl stunden
     */
/*
        fragt Anzahl Stunden ab
        returns anzahlStunden
     */
    public int getAnzahlStunden()
    {
        return anzahlStunden;
    }

    /**
     * Sets anzahl stunden.
     */
/*
        stellt Anzahl Stunden ein
     */
    public void setAnzahlStunden()
    {
        this.anzahlStunden = anzahlStunden;
    }

    /**
     * Gets stunden lohn.
     *
     * @return the stunden lohn
     */
/*
        fragt Stundenlohn ab
        returns stundenLohn
     */
    public int getStundenLohn()
    {
        return stundenLohn;
    }

    /**
     * Sets stunden lohn.
     */
/*
        stellt Stundenlohn ein
     */
    public void setStundenLohn()
    {
        this.stundenLohn = stundenLohn;
    }

    /*
     geerbte Methode von Klasse "Abrechnung";
     fragt verdienst ab
     returns produkt von stundenlohn und anzahlstunden
  */
    public double getVerdienst()
    {
        return stundenLohn*anzahlStunden;
    }

    /*
        präsentiert Objekt als String
     */

    public String toString()
    {
        return "Lohnabrechnung: " + getPeriode() + ", "+getMitarbeiter()+", Gehalt: "+getVerdienst();
    }
}
