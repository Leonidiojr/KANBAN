/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.entities;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Volid
 * @date 16/11/2023
 * @brief Class Atividade
 */
public class Atividade {
    
    private String nome;
    private String responsavel;
    private Date dataCriacao;
    private Date dataInicio;
    private Date dataFim;
    private Double percentualAtividade;

    private List<Acao> acoes = new ArrayList<>();
    
 
    public Atividade(){
    }

    public Atividade(String nome, String responsavel, Date dataInicio, Date dataFim, Date dataCriacao, Double percentualAtividade) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.dataCriacao = dataCriacao;
        this.percentualAtividade = percentualAtividade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getResponsavel(){
        return responsavel;
    }
    
    public void setResponsavel(String responsavel){
        this.responsavel = responsavel; 
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
    
    public Date getDataCriacao(){
        return dataCriacao;
    }

    public Double getPercentualAtividade() {
        return percentualAtividade;
    }
    
    public List<Acao> getAcoes(){
        return acoes;
    }
    
    public void addAcao (Acao acao){
        acoes.add(acao);
    }
    
    public void removeAcao (Acao acao){
        acoes.remove(acao);
    }
    
    
    public Double calculaPercentual(){
        if (acoes.isEmpty()){
            return 0.0;
        }
        
        int acoesConcluidas = 0;
        int totalAcoes = acoes.size();
        
        for (Acao acao : acoes){
            if (acao.getStatus().equals("CONCLUIDO")){
                acoesConcluidas++;
            }
        }
        
        Double percentual = (double) acoesConcluidas / totalAcoes * 100;
        return percentual;
    }
    
    
    //Método que valida a Data
    private void validarDataFormato(String data) throws ParseException{
        // Define o formato esperado da data
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        sdf1.setLenient(false); // Impede datas inválidas, como 2023-02-30

        try {
            // Tenta fazer o parsing da String data 
            Date newDate = sdf1.parse(data); // Converte string para date
        } catch (ParseException e) {
            // Captura exceção se a data não estiver no formato correto
            throw new ParseException(" Data inválida. Formato esperado: dd/MM/yyyy",0);
        }
    }
    
    
    // Método que altera a Data
    public String alterarData(String dataInicio, String dataFim) throws ParseException{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        validarDataFormato(dataInicio);
        validarDataFormato(dataFim);
        
        Date dataInicio2 = sdf.parse(dataInicio);
        Date dataFim2 = sdf.parse(dataFim);
        
        //Atualiza data da atividade
        Date now = new Date();
        if (dataInicio2.before(now) || dataFim2.before(now)){
            return "As datas precisam ser datas futuras";
        }
        if(!dataFim2.after(dataInicio2)){
            return "Data fim deve ser após a data de inicio";
        }
        
        this.dataInicio = dataInicio2;
        this.dataFim = dataFim2;
        return null;
    }
    
   
    //Método que salva a data da criação da atividade
    public void salvaDataCriacao (){
        dataCriacao = new Date(); 
    }
    
        
}
