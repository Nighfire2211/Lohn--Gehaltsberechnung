/**
 * The type Main.
 */
public class Main
{

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        Personalverwaltung pv = new Personalverwaltung();
        Mitarbeiter m1 = new Mitarbeiter("Josef Maier");
        pv.addMitarbeiter(m1);
        Mitarbeiter m2 = new Mitarbeiter("Franz Huber");
        pv.addMitarbeiter(m2);
        Mitarbeiter m3 = new Mitarbeiter("Werner Müller");
        pv.addMitarbeiter(m3);

        pv.sortMitarbeiter();
        pv.listMitarbeiter();

        pv.addAbrechnung(new LohnAbrechnung(1,m1,10,158));
        pv.addAbrechnung(new GehaltsAbrechnung(1,m2,3010));
        pv.addAbrechnung(new GehaltsAbrechnung(1,m3,2700));

        pv.addAbrechnung(new LohnAbrechnung(2,m1,16,158));
        pv.addAbrechnung(new GehaltsAbrechnung(2,m2,3010));
        pv.addAbrechnung(new GehaltsAbrechnung(2,m3,2800));
        pv.listAbrechnung();

    }

}
