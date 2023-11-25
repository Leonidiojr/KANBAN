package model.entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import model.entities.enums.TipoUsuario;

/**
 *
 * @author Alexandre dos Santos Cunha <alexandre.sc115@gmail.com>
 * @date 16/11/2023
 * @brief Class Senha
 */
public class Senha {
    
    private String login; // Armazena o nome de usuário ou login (privado para acesso interno à classe)
    protected String senha; // Armazena a senha (protegido para acesso a classes filhas)
    private TipoUsuario tipoUsuario;

    public Senha(String login, String senha, TipoUsuario tipoUsuario) {
        this.login = login;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
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

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public void criarArquivos(){
        String path = "";
        try{
            boolean file = new File("c:"+"\\cadastro").mkdir();
            System.out.println(file);
            
            String[] lines = new String[] {"Usuario: "+login, "Senha: "+senha};
            for (int i = 0; i < 3; i++) {
                if(i == 0){
                    path = "c:\\cadastro\\funcionarios.txt";
                    try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
                    }
                    catch(IOException e){
                        e.printStackTrace();
                    }
                }
                if(i == 1){
                    path = "c:\\cadastro\\lideres.txt";
                    try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
                    }
                    catch(IOException e){
                        e.printStackTrace();
                    }
                }
                if(i == 2){
                    path = "c:\\cadastro\\adms.txt";
                    try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
                        for(String line : lines){
                            bw.write(line);
                            bw.newLine();
                        }
                    }
                    catch(IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        finally{
        }
    }
    
    public void cadastroUsuario(String login, String senha, TipoUsuario tipoUsuario){
        this.login = login;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        String path = "";
        String[] lines = new String[] {"Login: "+login,"Senha: "+senha,"Tipo Usuário: "+tipoUsuario};
        
        if(tipoUsuario == TipoUsuario.FUNCIONARIO){
            path = "c:\\cadastro\\funcionarios.txt";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
                for(String line : lines){
                    bw.write(line);
                    bw.newLine();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        if(tipoUsuario == TipoUsuario.LIDER){
            path = "c:\\cadastro\\lideres.txt";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
                for(String line : lines){
                    bw.write(line);
                    bw.newLine();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        if(tipoUsuario == TipoUsuario.ADMINISTRADOR){
            path = "c:\\cadastro\\adms.txt";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
                for(String line : lines){
                    bw.write(line);
                    bw.newLine();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
