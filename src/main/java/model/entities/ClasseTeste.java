/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import model.entities.enums.Status;
import model.entities.enums.StatusSituacao;
import model.entities.enums.TipoProrrogacao;
import model.entities.enums.TipoUsuario;

/**
 * @author Pedro Queiroz Lima Barreto <pqlb1512@gmail.com>
 * @date 23/11/2023
 * @brief Class ClasseTeste
 */
public class ClasseTeste {
    public static void main(String[] args) throws ParseException {
        String login = "admin";
        String senha = "admin";
        TipoUsuario tipoUsuario = TipoUsuario.ADMINISTRADOR;
            
        Senha usuario = new Senha(login, senha, tipoUsuario);
        Scanner sc = new Scanner(System.in);
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Informe o nome da atividade: ");
        String nome = sc.nextLine();
        System.out.println("Informe a data de inicio (dd/mm/aaaa): ");
        Date dataInicio = sdf.parse(sc.next());
        System.out.println("Informe a data final (dd/mm/aaaa): ");
        Date dataFim = sdf.parse(sc.next());
        Double percentual = 0.0;
        Status status = Status.FAZER;
        boolean prorrog = false;
        Integer prorrogacao = 0;
        TipoProrrogacao tipoProrrogacao = TipoProrrogacao.SECONDS;
        StatusSituacao situacao = StatusSituacao.NO_PRAZO;
        Acao acao = new Acao(nome, dataInicio, dataFim, percentual, status, tipoProrrogacao, prorrogacao, situacao);
        
        String erro = acao.validarData(dataInicio, dataFim);
        if(erro != null){
            System.out.println("Erro nas datas: " + erro);
        }
        else{
            System.out.println("Tudo ok");
        }
        System.out.println("Deseja prorrogar a data final? [1 - Sim | 2 - Não]");
        int prog = sc.nextInt();
        if (prog == 1) {
            prorrog = true;
            System.out.println("Informe a opção de prorrogação: ");
            System.out.println("1 - Segundos");
            System.out.println("2 - Minutos");
            System.out.println("3 - Horas");
            System.out.println("4 - Dias");
            System.out.println("5 - Meses");
            System.out.println("6 - Anos");
            int opc = sc.nextInt();
            if(opc == 1){
                tipoProrrogacao = TipoProrrogacao.SECONDS;
                System.out.println("Informe quantos Segundos vc deseja adicionar");
                prorrogacao = sc.nextInt();
                acao.prorrogacao(prorrogacao, tipoProrrogacao);
            }
            if(opc == 2){
                tipoProrrogacao = TipoProrrogacao.MINUTES;
                System.out.println("Informe quantos Minutos vc deseja adicionar");
                prorrogacao = sc.nextInt();
                acao.prorrogacao(prorrogacao, tipoProrrogacao);
            }
            if(opc == 3){
                tipoProrrogacao = TipoProrrogacao.HOURS;
                System.out.println("Informe quantos Horas vc deseja adicionar");
                prorrogacao = sc.nextInt();
                acao.prorrogacao(prorrogacao, tipoProrrogacao);
            }
            if(opc == 4){
                tipoProrrogacao = TipoProrrogacao.DAYS;
                System.out.println("Informe quantos Dias vc deseja adicionar");
                prorrogacao = sc.nextInt();
                acao.prorrogacao(prorrogacao, tipoProrrogacao);
                System.out.println(acao.getDataFim());
            }
            if(opc == 5){
                tipoProrrogacao = TipoProrrogacao.MONTHS;
                System.out.println("Informe quantos Meses vc deseja adicionar");
                prorrogacao = sc.nextInt();
                acao.prorrogacao(prorrogacao, tipoProrrogacao);
            }
            if(opc == 6){
                tipoProrrogacao = TipoProrrogacao.YEARS;
                System.out.println("Informe quantos Anos vc deseja adicionar");
                prorrogacao = sc.nextInt();
                acao.prorrogacao(prorrogacao, tipoProrrogacao);
            }  
        }
        else{
            System.out.println("Data fim: " + dataFim);
        }*/
        System.out.println("Deseja criar uma pasta nova? [1 - Sim|2 - Não]");
        int opcarq = sc.nextInt();
        if(opcarq == 1){
            usuario.criarArquivos();
        }
        System.out.println("Cadastro de novo Usuário");
        System.out.println("Informe o Login:");
        login = sc.next();
        System.out.println("Cadastre a senha: ");
        senha = sc.next();
        System.out.println("Informe o tipo de Usuário:");
        System.out.println("1 - Funcionário");
        System.out.println("2 - Líder");
        System.out.println("3 - Administrador");
        int tpfunc = sc.nextInt();
        if(tpfunc == 1){
            tipoUsuario = TipoUsuario.FUNCIONARIO;
        }
        if(tpfunc == 2){
            tipoUsuario = TipoUsuario.LIDER;
        }
        if(tpfunc == 3){
            tipoUsuario = TipoUsuario.ADMINISTRADOR;
        }
        
        usuario.cadastroUsuario(login, senha, tipoUsuario);
    }
}
