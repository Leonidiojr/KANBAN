package model.entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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
                    file = new File("c:\\cadastro\\funcionarios").mkdir();
                }
                if(i == 1){
                    file = new File("c:\\cadastro\\lideres").mkdir();
                }
                if(i == 2){
                   file = new File("c:\\cadastro\\adms").mkdir();
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
        String[] lines = new String[] {login,senha};
        
        if(tipoUsuario == TipoUsuario.FUNCIONARIO){
            path = "c:\\cadastro\\funcionarios\\"+login+".txt";
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
           path = "c:\\cadastro\\lideres\\"+login+".txt";
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
            path = "c:\\cadastro\\adms\\"+login+".txt";
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
    
    public void VerificacaoUsuario(String login, String senha){
        String loginVerificar = login;
        String senhaVerificar = senha;
        String path = "";
        for(int i = 0; i < 3; i++) {
            if (i == 0) {
                path = "c:\\cadastro\\adms\\"+loginVerificar+".txt";
            }
            if (i == 1) {
                path = "c:\\cadastro\\lideres\\"+loginVerificar+".txt";
            }
            if (i == 2) {
                path = "c:\\cadastro\\funcionarios\\"+loginVerificar+".txt";
            }
            try(BufferedReader br = new BufferedReader(new FileReader(path))){
                String line = br.readLine();
                while(line != null){
                    System.out.println(line);
                    line = br.readLine();
                }
            }
            catch(IOException e){
                System.out.println("Error : " + e.getMessage());
            } 
        }
    }
}
