package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import model.entities.enums.StatusSituacao;

/**
 *
 * @author Pedro Queiroz Lima Barreto <pqlb1512@gmail.com>
 * @date 16/11/2023
 * @brief Class Projeto
 */
public class Projeto {

    private String nome;
    private Date dataInicio;
    private Date dataFim;
    private String descricao;
    private StatusSituacao situacao;
    private Double percentualProjeto;

    private Empresa empresa;
    private List<Atividade> listaAtividades = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Projeto() {
    }

    public Projeto(String nome, Date dataInicio, Date dataFim, String descricao, StatusSituacao situacao, Empresa empresa, Double percentualProjeto) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricao = descricao;
        this.situacao = situacao;
        this.empresa = empresa;
        this.percentualProjeto = percentualProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusSituacao getSituacao() {
        return situacao;
    }

    public void setSituacao(StatusSituacao situacao) {
        this.situacao = situacao;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Atividade> getAtividades() {
        return listaAtividades;
    }

    public void addAtividade(Atividade atividade) {
        listaAtividades.add(atividade);
    }

    public void removeAtividade(Atividade atividade) {
        listaAtividades.remove(atividade);
    }

    public long calcularDuracao() {
        long duracao = dataFim.getTime() - dataInicio.getTime();
        return TimeUnit.DAYS.convert(duracao, TimeUnit.DAYS);
    }

    //Está função calcula a média da porcentagem do projeto
    public double calcPercent() {
        double porcentagemTotal = 0;
        int cont = 0;
        for (Atividade atividade : listaAtividades)
        {
            porcentagemTotal += atividade.getPercentualAtividade();
            cont++;
        }
        return porcentagemTotal / cont;
    }
}
