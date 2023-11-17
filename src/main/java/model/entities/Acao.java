package model.entities;

import java.time.LocalDateTime;
import java.util.Date;
import model.entities.enums.Status;
import model.entities.enums.TipoProrrogacao;


public class Acao {
    
    private String nome;
    private Date dataInicio;
    private Date dataFim;
    private Double percentual;
    private Status Status;
    private String Responsavel;
    private Double prorrogacao;
    private TipoProrrogacao tipoProrrogacao;
 

    public Acao() {
    }

    public Acao(String nome, Date dataInicio, Date dataFim, Double percentual, Status Status, String Responsavel) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.percentual = percentual;
        this.Status = Status;
        this.Responsavel = Responsavel;
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

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status Status) {
        this.Status = Status;
    }

    public String getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }
    
    private void atualizaPercent(Double percentual){
        this.percentual = percentual;
    }
    
    private boolean validarData(Date dataInicio, Date DataFim){
        
        if(dataFim == dataInicio){
            return true;
        } return false;
        
    }
    
    private void prorrogacao(int prorrogacao, TipoProrrogacao tipoProrrogacao){
      
        switch (tipoProrrogacao) {
            case SECONDS:
                LocalDateTime dateTime = LocalDateTime.of(2023, 11, 16, 12, 0, 0);
                LocalDateTime novaData = dateTime.plusSeconds(prorrogacao);
                this.dataFim = novaData;
                break;
            case MINUTES:
                this.dataFim = dataFim + prorrogacao;
                break;    
            case HOURS:
                this.dataFim = dataFim + prorrogacao;
                break;
            case DAYS:
                this.dataFim = dataFim + prorrogacao;
                break;
            case MONTHS:
                this.dataFim = dataFim + prorrogacao;
                break;
            case YEARS:
                this.dataFim = dataFim + prorrogacao;
                break;
            default:
                throw new AssertionError();
        }
        
        
    }
    
    private void alteraResponsavel(String Responsavel){
        
        this.Responsavel = Responsavel;
    }
    
    
}
