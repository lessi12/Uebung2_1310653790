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
public abstract class Saeugetier
{
    String Name;
    int Alter;
    String Geschlecht;
    public abstract String printAll();

    public Saeugetier(String Name, int Alter, String Geschlecht)
    {
        this.Name = Name;
        this.Alter = Alter;
        this.Geschlecht = Geschlecht;
    }
    
    
}
