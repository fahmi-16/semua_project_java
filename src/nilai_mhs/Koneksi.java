
package nilai_mhs;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Koneksi {
    Connection koneksi;
    
    public static Connection Koneksi() {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_bio_mhs", "root", "");
            
            return koneksi;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
}