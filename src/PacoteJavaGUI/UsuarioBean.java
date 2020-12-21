//Classe para acesso ao objeto
package PacoteJavaGUI;

public class UsuarioBean {
    
    //Atributos da classe
    
    private String loginUsu;
    private String senhaUsu;
        
    //Criando o construtores

    public UsuarioBean() {
    }
       
    //Criar os métodos getters e setters - alt+insert

    public String getloginUsu() {
        return loginUsu;
    }

    public void setloginUsu(String loginUsu) {
        this.loginUsu = loginUsu;
    }

    public String getsenhaUsu() {
        return senhaUsu;
    }

    public void setsenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }
    
}
