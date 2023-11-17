package model.entities;

/**
 *
 * @author Alexandre dos Santos Cunha <alexandre.sc115@gmail.com>
 * @date 16/11/2023
 * @brief Class Empresa
 */
public class Empresa {

    // Atributos da classe Empresa
    private String nomeEmpresa;
    private Double cnpj; 

    // Construtor vazio da classe Empresa
    public Empresa() {
    }

    // Construtor que inicializa nomeEmpresa e cnpj da empresa
    public Empresa(String nomeEmpresa, Double cnpj) {
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
    public Double getCnpj() {
        return cnpj;
    }

    // Setter para definir o CNPJ da empresa
    public void setCnpj(Double cnpj) {
        this.cnpj = cnpj;
    }

}
