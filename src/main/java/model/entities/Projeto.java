/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Carlos Garcia <carlosgarcianeto229@gmail.com>
 * @date 16/11/2023
 * @brief Class Projeto
 */
public class Projeto {
    private String nome;
    private Date dataInicio;
    private Date dataFim;
    private String descricao;
    private Double percentualProjeto;
    private Double duracao;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
    public Projeto(){
    }
    
    public Projeto(String nome, Date dataInicio, Date dataFim, String descricao, Double percentualProjeto, Double duracao) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricao = descricao;
        this.percentualProjeto = percentualProjeto;
        this.duracao = duracao;
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

    public Double getPercentualProjeto() {
        return percentualProjeto;
    }

    public void setPercentualProjeto(Double percentualProjeto) {
        this.percentualProjeto = percentualProjeto;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }
    
    public void calcPercent(Double percentualProjeto){
        this.percentualProjeto = percentualProjeto;
    }
    
    public void validarData(Date dataInicio, Date dataFim){
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        //continuar essa função
    }
    
    public void calcularDuracao(Double duracao){
        this.duracao = duracao;
        //aqui deve ser um return da data fim menos a data inicio
        //para isso é necessario alterar a função
    }
    
}




