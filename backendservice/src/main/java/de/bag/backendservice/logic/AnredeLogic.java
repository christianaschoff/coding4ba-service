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
}
