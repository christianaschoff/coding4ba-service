package de.bag.backendservice.logic;

public class AnredeLogic {
    
    private String nachname;
    private String vorname;

    public AnredeLogic(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String ermittleName() {
        return vorname + " " + nachname;
    }

    public String ermittleNameMitAnrede(String anrede) {
        return anrede + " " + this.ermittleName();
    }

    public String grossKlein(String anrede) {
        String vollstaendigeAnrede = this.ermittleNameMitAnrede(anrede);
        String rueckgabewert = "";

        if(anrede.equals("Frau")) {
            rueckgabewert = vollstaendigeAnrede.toUpperCase();
        } else {
            rueckgabewert = vollstaendigeAnrede.toLowerCase();
        }

        return rueckgabewert;
    }
}
