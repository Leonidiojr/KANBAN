package model.entities;

/**
 *
 * @author Alexandre dos Santos Cunha <alexandre.sc115@gmail.com>
 * @date 16/11/2023
 * @brief Class Funcionario
 */
public class Funcionario {

    // Atributos da classe Funcionario
    private String nomeFuncionario;
    private Double cpf; 
    private Integer matricula;

    private Acao acao;
    private Senha senha;
    private Departamento departamento;
    
    // Construtor vazio da classe Funcionario
    public Funcionario() {
    }

    // Construtor que inicializa nomeFuncionario, cpf e matricula do funcionário
    public Funcionario(String nomeFuncionario, Double cpf, Integer matricula, Senha senha, Departamento departamento, Acao acao) {
        this.nomeFuncionario = nomeFuncionario;
        this.cpf = cpf;
        this.matricula = matricula;
        this.acao = acao;
        this.senha = senha;
        this.departamento = departamento;
    }

    // Getter para obter o nome do funcionário
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    // Setter para definir o nome do funcionário
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    // Getter para obter o CPF do funcionário
    public Double getCpf() {
        return cpf;
    }

    // Setter para definir o CPF do funcionário
    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    // Getter para obter a matrícula do funcionário
    public Integer getMatricula() {
        return matricula;
    }

    // Setter para definir a matrícula do funcionário
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Acao getAcao() {
        return acao;
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }
    
}
