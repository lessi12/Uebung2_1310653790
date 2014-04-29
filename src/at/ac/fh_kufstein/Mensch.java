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
public class Mensch
{
    private String Vorname;
    private String Nachname;
    private int Alter;

    public String getVorname()
    {
        return Vorname;
    }

    public void setVorname(String Vorname)
    {
        this.Vorname = Vorname;
    }

    public String getNachname()
    {
        return Nachname;
    }

    public void setNachname(String Nachname)
    {
        this.Nachname = Nachname;
    }

    public int getAlter()
    {
        return Alter;
    }

    public void setAlter(int Alter)
    {
        this.Alter = Alter;
    }

    
    public Mensch(String Vorname, String Nachname, int Alter)
    {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Alter = Alter;
    }

    public void Status()
    {
        System.out.println("Es handelt sich um einen Mensch mit dem Namen " + Vorname + Nachname + " und mit einem Alter von " + Alter + " Jahren.");
    }
}
