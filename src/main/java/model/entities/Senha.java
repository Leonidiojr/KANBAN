package model.entities;

/**
 *
 * @author Alexandre dos Santos Cunha <alexandre.sc115@gmail.com>
 * @date 16/11/2023
 * @brief Class Senha
 */
public class Senha {
    
    private String login; // Armazena o nome de usuário ou login (privado para acesso interno à classe)
    protected String senha; // Armazena a senha (protegido para acesso a classes filhas)

    public Senha(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
