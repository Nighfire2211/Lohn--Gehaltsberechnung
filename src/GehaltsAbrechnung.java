/**
 * The type Gehalts abrechnung.
 */
public class GehaltsAbrechnung extends Abrechnung
{
    /*
        private Variablen
     */
    private double gehalt;

    /**
     * Instantiates a new Gehalts abrechnung.
     *
     * @param p the p
     * @param m the m
     * @param v the v
     */
/*
     Konstruktor mit parametern: Periode (von Klasse Abrechnung geerbt), Objekt "Mitarbeiter", gehalt
     */
    public GehaltsAbrechnung(int p, Mitarbeiter m, double v)
    {
        super();
       this.periode = p;
       this.mitarbeiter = m;
       this.gehalt = v;
       getVerdienst();
    }

    /*
        geerbte Methode von Klasse "Abrechnung";
        fragt gehalt bzw verdienst ab
        returns gehalt
     */
    public double getVerdienst()
    {
        return gehalt;
    }

    /*
        präsentiert Objekt als String
     */
    public String toString()
    {
        return  "Gehaltsabrechnung: "+getPeriode() + ", "+getMitarbeiter()+", Gehalt: "+getVerdienst();
    }
}
