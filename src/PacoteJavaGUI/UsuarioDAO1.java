//Classe de acesso aos dados (SQL com Java)
package PacoteJavaGUI;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO1 {

    //Variavel para acesso a conexao (abrir e fechar o bd)
    private Connection con;

    //Criando o construtor da classe
    public UsuarioDAO1(Connection con) {
        this.con = con;
    }

    //Criando os métodos de acesso (getters e setters)
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    //Criar o select
    //public List<UsuarioBean> listarTodos(String s_usu, String s_sen) {
    public List<UsuarioBean> listarTodos() {

        //System.out.println("s_usu: " + s_usu);
        //System.out.println("s_sen: " + s_sen);
        
        //String sql = "select * from tbusuario where nomeUsu = ? and senhaUsu = ? ";

        String sql = "select * from tbusuarios";
        //Criando um vetor ou matriz vazia para carregar os valores do bd
        List<UsuarioBean> listaUsuario = new ArrayList<>();

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            //ps.setString(1, s_usu);
            //ps.setString(2, s_sen);
            
            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    UsuarioBean ub = new UsuarioBean();
                    ub.setloginUsu(rs.getString(1));
                    ub.setsenhaUsu(rs.getString(2));
                    
                    listaUsuario.add(ub);
                }
                return listaUsuario;
            } else {
                return null;
            }

        } catch (SQLException ex) {
            return null;
        }

    }
}
