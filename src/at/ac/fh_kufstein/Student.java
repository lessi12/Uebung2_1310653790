/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein;

/**
 *
 * @author lessi
 */
public class Student extends Mensch
{
    private int Matrikelnummer;
    private String Studiengang;

    public int getMatrikelnummer()
    {
        return Matrikelnummer;
    }

    public void setMatrikelnummer(int Matrikelnummer)
    {
        this.Matrikelnummer = Matrikelnummer;
    }

    public String getStudiengang()
    {
        return Studiengang;
    }

    public void setStudiengang(String Studiengang)
    {
        this.Studiengang = Studiengang;
    }
    
    
    public Student(String Vorname, String Nachname, int Alter, int Matrikelnummer, String Studiengang)
    {
        super(Vorname, Nachname, Alter);
        this.Matrikelnummer = Matrikelnummer;
        this.Studiengang = Studiengang;
    }

    @Override
    public void Status()
    {
        System.out.println("Es handelt sich um einen Studenten mit dem Namen " + getVorname() + getNachname() + " , der " + getAlter() + " Jahre alt ist und die Matrikelnummer " + getMatrikelnummer() + " für den Studiengang " + getStudiengang() + " besitzt.");
    }

    
}
