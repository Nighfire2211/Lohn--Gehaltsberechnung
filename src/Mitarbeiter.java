/**
 * The type Mitarbeiter.
 */
public class Mitarbeiter implements Comparable<Mitarbeiter >//Für sortieren
{
    /*
        private Variablen
     */
    private static int counter = 1; //Diese Variable zählt die Mitarbeiter auf. zb ID: 1 Name: Jaiswal
    private String name;
    private int ID;

    /**
     * Instantiates a new Mitarbeiter.
     *
     * @param name the name
     */
/*
        Konstruktor mit parameter: name
     */
    public Mitarbeiter( String name)
    {
        this.name = name;
        ID = counter++;//Der  Mitarbeiter bekommt automatisch eine ID
    }

    /**
     * Gets id.
     *
     * @return the id
     */
/*
        fragt ID ab
        returns ID
     */
    public Integer getID()
    {
        return ID;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
/*
        Stellt ID ein
     */
    public void setID(int id)
    {
        this.ID = ID;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
/*
        fragt name ab
        returns name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
/*
        stellt name ein

     */
    public void setName(String name)
    {
        this.name = name;
    }

    /*
        präsentiert Objekt als String
     */
    @Override
    public String toString()
    {
        return "ID: "+ ID + ", Name: "+name;
    }

    @Override
    public int compareTo(Mitarbeiter o) //Vergleich von 2 objekten; Unterschied=ID
    {
        return this.getID().compareTo(o.getID());
    }
}

