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
public class Menschen extends Saeugetier
{

    public Menschen(String Name, int Alter, String Geschlecht)
    {
        super(Name, Alter, Geschlecht);
    }
    
    @Override
    public String printAll()
    {
        return Name + "#" + Alter + "#" + Geschlecht;
    }
}
