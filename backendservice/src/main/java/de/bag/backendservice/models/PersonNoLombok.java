package de.bag.backendservice.models;

public class PersonNoLombok {

    private String vorname;
    private String nachname;
    private String anrede;

    public PersonNoLombok(String vorname, String nachname, String anrede) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.anrede = anrede;
    }

    public PersonNoLombok() {
        super();
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }   
}
