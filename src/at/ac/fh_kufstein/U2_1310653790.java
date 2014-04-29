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
public class U2_1310653790
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Mensch m = new Mensch("Lessi ","Lermer",21);
        m.Status();
        m = new Student("Lessi ","Lermer",21,1310653790,"Web Business & Technology");
        m.Status();
        Menschen l = new Menschen("Lessless",21,"weiblich");
        System.out.println(l.printAll());
    }   
    
    
}
