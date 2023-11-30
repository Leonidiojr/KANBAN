package model.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandre dos Santos Cunha <alexandre.sc115@gmail.com>
 * @date 16/11/2023
 * @brief Class Empresa
 */
public class Empresa {

    // Atributos da classe Empresa
    private String nomeEmpresa;
    private String cnpj;

    private List<Departamento> listaDepartamentos = new ArrayList<>();
    private List<Projeto> listaProjetos = new ArrayList<>();

    // Construtor vazio da classe Empresa
    public Empresa() {
    }

    // Construtor que inicializa nomeEmpresa e cnpj da empresa
    public Empresa(String nomeEmpresa, String cnpj) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }

    // Getter para obter o nome da empresa
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    // Setter para definir o nome da empresa
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    // Getter para obter o CNPJ da empresa
    public String getCnpj() {
        return cnpj;
    }

    // Setter para definir o CNPJ da empresa
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void addListaDepartamentos(Departamento departamento) {
        listaDepartamentos.add(departamento);
    }

    public void removeListaDepartamentos(Departamento departamento) {
        listaDepartamentos.remove(departamento);
    }

    public List<Projeto> getListaProjetos() {
        return listaProjetos;
    }

    public void addListaProjetos(Projeto projeto) {
        listaProjetos.add(projeto);
    }

    public void removeListaProjetos(Projeto projeto) {
        listaProjetos.add(projeto);
    }
}
