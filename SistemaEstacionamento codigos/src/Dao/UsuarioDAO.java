
package Dao;

import Modelo.ModeloUsuario;
import Controle.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Valmir Junior
 */
public class UsuarioDAO {
    
    PreparedStatement ST;
    ResultSet         RS;
    
    public void Salvar(ModeloUsuario modelo) throws Exception {
        
        String SQL = "INSERT INTO Usuario(nome, usuario, senha, status) VALUES(?,?,?,?)";
      
        
        try {          
          ST = Conexao.conector().prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
          ST.setString(1, modelo.getNome());
          ST.setString(2,modelo.getUsuario());
          ST.setString(3,modelo.getSenha());
          ST.setString(4, modelo.getCodigoStatus());
          ST.executeUpdate();
          
           RS = ST.getGeneratedKeys();
            if (RS.next()) {
                modelo.setCodigo(RS.getInt(1));
            }     
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha no Banco de Dados\n" + e.toString(),"Inclusão",JOptionPane.PLAIN_MESSAGE);
        } 
    }
    
    public void Alterar(ModeloUsuario modelo) throws Exception {
        
        String SQL = "UPDATE usuario SET nome = ?, usuario = ?, senha = ?, status = ? WHERE codigo = ?";
      
        
        try {          
          ST = Conexao.conector().prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
          ST.setString(1, modelo.getNome());
          ST.setString(2,modelo.getUsuario());
          ST.setString(3,modelo.getSenha());
          ST.setString(4, modelo.getCodigoStatus());
          ST.setInt(5, modelo.getCodigo());
          ST.executeUpdate();
          
           RS = ST.getGeneratedKeys();
            if (RS.next()) {
                modelo.setCodigo(RS.getInt(1));
            }     
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha no Banco de Dados\n" + e.toString(),"Inclusão",JOptionPane.PLAIN_MESSAGE);
        } 
    }
    
    public void Excluir(ModeloUsuario modelo) throws Exception {
        
        String SQL = "DELETE FROM usuario WHERE codigo = ?";
      
        
        try {          
          ST = Conexao.conector().prepareStatement(SQL);
          ST.setInt(1, modelo.getCodigo());
          ST.executeUpdate();
        
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha no Banco de Dados\n" + e.toString(),"Inclusão",JOptionPane.PLAIN_MESSAGE);
        } 
    }
    
    public void verificarLogin(ModeloUsuario modelo) throws SQLException {
       
        String SQL = "SELECT * FROM Usuario WHERE usuario = ? AND senha = ?";
         
          ST = Conexao.conector().prepareStatement(SQL);
          ST.setString(1, modelo.getUsuario());
          ST.setString(2, modelo.getSenha());
          RS = ST.executeQuery();
               
    }
    
}
