package model.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandre dos Santos Cunha <alexandre.sc115@gmail.com>
 * @date 16/11/2023
 * @brief Class Departamento
 */
public class Departamento {

    // Atributos da classe Departamento
    private String nomeDepartamento;
    private Integer codigoDepartamento;

    private Empresa empresa;
    private List<Funcionario> listaFuncionarios = new ArrayList<>();

    // Construtor vazio da classe Departamento
    public Departamento() {
    }

    // Construtor que inicializa nomeDepartamento e codigoDepartamento do departamento
    public Departamento(String nomeDepartamento, Integer codigoDepartamento, Empresa empresa) {
        this.nomeDepartamento = nomeDepartamento;
        this.codigoDepartamento = codigoDepartamento;
        this.empresa = empresa;
    }

    // Getter para obter o nome do departamento
    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    // Setter para definir o nome do departamento
    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    // Getter para obter o código do departamento
    public Integer getCodigoDepartamento() {
        return codigoDepartamento;
    }

    // Setter para definir o código do departamento
    public void setCodigoDepartamento(Integer codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void addListaFuncionarios(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public void removeListaFuncionarios(Funcionario funcionario) {
        listaFuncionarios.remove(funcionario);
    }
}
