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
    
    private Empresa empresa;
    private List<Atividade> atividades = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
    public Projeto(){
    }
    
    public Projeto(String nome, Date dataInicio, Date dataFim, String descricao, StatusSituacao situacao) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricao = descricao;
        this.situacao = situacao;
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
        return atividades;
    }
    
    public void addAtividade(Atividade atividade){
        atividades.add(atividade);
    }
    
    public void removeAtividade(Atividade atividade){
        atividades.remove(atividade);
    }
    
    public long calcularDuracao(){
        long duracao = dataFim.getTime()- dataInicio.getTime();
        return TimeUnit.DAYS.convert(duracao, TimeUnit.DAYS);
    }
    
    public double calcPercent(){
        //essa função precisa da porcentagem da ação para funcionar,
        //ela precisa calcular a porcentagem da atividade baseada na porcentagem de cada atividade
        return 0;
    }
}