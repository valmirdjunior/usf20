
package Controle;

import static com.lowagie.text.pdf.PdfFileSpecification.url;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    
    // metodo responsavel por estabelecer  a conexao com o banco infox
        
    java.sql.Connection conexao = null;
    
     
    // metodo responsavel por estabelecer  a conexao com o banco 
    public static Connection conector(){
        
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/estacionamento";
        String user = "root";
        String password = "";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao; 
            
            } catch (Exception e) {
                return null;
        }
    }

    public Conexao getConexao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
 
}
