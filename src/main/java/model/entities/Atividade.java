/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.entities;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Volid
 * @date 16/11/2023
 * @brief Class Atividade
 */
public class Atividade {
    
    private String nome;
    private Date dataInicio;
    private Date dataFim;
    private Double percentualAtividade;
    
    
    public Atividade(){
    }
    
    public Atividade(String nome, Date dataInicio, Double percentualAtividade) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.percentualAtividade = percentualAtividade;
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

    public Double getPercentualAtividade() {
        return percentualAtividade;
    }

    public void setPercentualAtividade(Double percentualAtividade) {
        this.percentualAtividade = percentualAtividade;
    }
    
    public void calcPercent(){
        
    }
    
    public void validarData(){
        
        if (dataInicio != null) {
            validarDataFormato(dataInicio, "Data de Início");
        }

        if (dataFim != null) {
            validarDataFormato(dataFim, "Data de Fim");
        }
    }

    private void validarDataFormato(Date data, String tipoData) {
        // Define o formato esperado da data
        DateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
        formatoData.setLenient(false); // Impede datas inválidas, como 2023-02-30

        try {
            // Tenta fazer o parsing da data
            String dataString = formatoData.format(data); // Converte Date para String
            formatoData.parse(dataString); // Tenta fazer o parsing da String
            System.out.println(tipoData + " válida: " + dataString);
        } catch (ParseException e) {
            // Captura exceção se a data não estiver no formato correto
            System.out.println(tipoData + " inválida. Formato esperado: yyyy-MM-dd");
        }
    }
    
    public void prorrogarData(int dias){
        if (dataFim != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dataFim);

            // Adiciona o número de dias à dataFim
            calendar.add(Calendar.DAY_OF_MONTH, dias);

            // Atualiza a nova dataFim
            dataFim = calendar.getTime();

            System.out.println("Data de Fim prorrogada para: " + dataFim);
        } else {
            System.out.println("Não é possível prorrogar. Data de Fim não definida.");
        }
    }
        
}
