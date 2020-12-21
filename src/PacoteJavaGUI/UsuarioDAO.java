//Classe de acesso aos dados (SQL com Java)
package PacoteJavaGUI;

import java.sql.*;

public class UsuarioDAO {

    //Variavel para acesso a conexao (abrir e fechar o bd)
    private Connection con;
       
    //Criando o construtor da classe
    public UsuarioDAO(Connection con) {
        this.con = con;
    }

    //Criando os métodos de acesso (getters e setters)
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String achouUsu (String s_usuario, String s_senha)  {
  
        String sql = "select * from tbusuarios WHERE loginUsu=? and senhaUsu=?";

        try {
         
            PreparedStatement ps = con.prepareStatement(sql);
 
            ps.setString(1, s_usuario);
            ps.setString(2, s_senha);
 
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
               return "achou";
            } else {
               return "naoachou";
            }

        } catch (SQLException ex) {
            return "naoachou";
        }
    }
}

