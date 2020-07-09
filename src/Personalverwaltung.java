import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * The type Personalverwaltung.
 */
public class Personalverwaltung
{

    private ArrayList<Mitarbeiter>mitarbeiterliste;
    private ArrayList<Abrechnung>abrechnung;


    /**
     * Instantiates a new Personalverwaltung.
     */
    public Personalverwaltung()
    {
        mitarbeiterliste= new ArrayList<Mitarbeiter>();
        abrechnung = new ArrayList<Abrechnung>();
    }

    /**
     * Add mitarbeiter.
     *
     * @param m the m
     */
    public void addMitarbeiter(Mitarbeiter m)
    {
        mitarbeiterliste.add(m);
    }

    /**
     * Sort mitarbeiter.
     */
    public void sortMitarbeiter()
    {
        Collections.sort(mitarbeiterliste);
    }

    /**
     * Print.
     */
    public void print()
    {
        System.out.println(mitarbeiterliste);
    }

    /**
     * List mitarbeiter boolean.
     *
     * @return the boolean
     */
    public boolean listMitarbeiter()
    {
        Iterator iter = mitarbeiterliste.iterator();
        while (iter.hasNext()) {
            System.out.println((Mitarbeiter)iter.next());
        }
        return true;
    }

    /**
     * Number of mitarbeiter int.
     *
     * @return the int
     */
    public int numberOfMitarbeiter()
    {
        return mitarbeiterliste.size();
    }

    /**
     * Add abrechnung.
     *
     * @param a the a
     */
    public void addAbrechnung(Abrechnung a)
    {
        abrechnung.add(a);
    }

    /**
     * List abrechnung boolean.
     *
     * @return the boolean
     */
    public boolean listAbrechnung()
    {
        Iterator iterator = abrechnung.iterator();
        while (iterator.hasNext())
        {
            System.out.println((Abrechnung)iterator.next());
        }

        return true;
    }

    /**
     * Number of abrechnung int.
     *
     * @return the int
     */
    public int numberOfAbrechnung()
    {
        return abrechnung.size();

    }


}
