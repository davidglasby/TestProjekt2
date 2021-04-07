/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprojekt2;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.sql.PreparedStatement;

/**
 *
 * @author hp
 */
public class TestProjekt2 {

    private static InfDB dbUppkoppling;
    
    public static void main(String[] args) {
        try {
            dbUppkoppling = new InfDB("C:\\db\\TESTIGENDB.FDB");
            new HuvudFonster(dbUppkoppling).setVisible(true);
            
            
        }
        catch (InfException e)
        {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }
    
}
