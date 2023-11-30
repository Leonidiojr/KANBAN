/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastro de Empresa!!!");
        System.out.println("Informe o nome da empresa: ");
        String nomeEmpresa = sc.next();
        System.out.println("Informe o CNPJ: ");
        String cnpj = sc.next();
        Empresa empresa = new Empresa(nomeEmpresa, cnpj);
        System.out.println("Cadastro de Departamento!!!");
        System.out.println("Informe o nome do departamento: ");
        String nomeDepartamento = sc.next();
        System.out.println("Informe o código do departamento: ");
        Integer codigoDepartamento = sc.nextInt();
        Departamento departamento  =  new Departamento(nomeDepartamento, codigoDepartamento, empresa);
        System.out.println("Cadastro de Funcionário!!!");
        System.out.println("Informe o nome do Funcionário: ");
        String nomeFuncionario = sc.next();
        System.out.println("Informe o CPF do funcionário");
        String cpf = sc.next();
        System.out.println("Informe o número da matrícula");
        Integer matricula = sc.nextInt();
        Funcionario funcionario = new Funcionario(nomeFuncionario,cpf,matricula,departamento);
        if(funcionario.verificarCPF(cpf) == true){
            departamento.addListaFuncionarios(funcionario);
            System.out.println("Deu certo");
        }
        else{
            System.out.println("Deu errado");
            funcionario = null;
        }
    }
}
