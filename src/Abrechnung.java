/**
 * The type Abrechnung.
 */
public abstract class Abrechnung
{

    /**
     * The Periode.
     */
/*
    private Variablen
     */
     int periode;
    /**
     * The Mitarbeiter.
     */
    Mitarbeiter mitarbeiter;

    /**
     * Instantiates a new Abrechnung.
     *
     * @param g the g
     */
/*
Konstruktor mit Objekt "Gehaltsabrechnung" als Parameter
 */
    public Abrechnung(GehaltsAbrechnung g)
    {
        getPeriode();
        getMitarbeiter();
        getVerdienst();

    }

    /**
     * Instantiates a new Abrechnung.
     *
     * @param l the l
     */
/*
Konstruktor mit Objekt "LohnAbrechnung" als Parameter
 */
    public Abrechnung(LohnAbrechnung l)
    {
        getPeriode();
        getMitarbeiter();
        getVerdienst();
        toString();

    }

    /**
     * Instantiates a new Abrechnung.
     */
/*
    für die super(); Funktion
    */
    public Abrechnung()
    {

    }

    /**
     * Gets periode.
     *
     * @return the periode
     */
/*
        fragt periodennummer ab
        returns periode
     */
    public int getPeriode()
    {
        return periode;
    }

    /**
     * Sets periode.
     */
/*
        stellt periodennummer ein
    */
    public void setPeriode()
    {
        this.periode= periode;
    }

    /**
     * Gets mitarbeiter.
     *
     * @return the mitarbeiter
     */
/*
        fragt Mitarbeiter ab
        returns mitarbeiter
     */
    public Mitarbeiter getMitarbeiter()
    {
        return mitarbeiter;
    }

    /**
     * Gets verdienst.
     *
     * @return the verdienst
     */
/*
        abstrakte methode für vererbung
     */
    public abstract double getVerdienst();

    /*
        präsentiert Objekt als String
     */
    public String toString()
    {
        return + periode + ","+mitarbeiter+","+getVerdienst();
    }

}
