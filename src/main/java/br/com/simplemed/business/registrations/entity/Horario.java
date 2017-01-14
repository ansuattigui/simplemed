package br.com.simplemed.business.registrations.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table(name = "thorario", schema = "simplemed")
public class Horario implements Serializable {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Integer id;   
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahora;
    private Integer intervalos;
    private Integer paciente;
    private String nomepaciente;
    private Integer convenio;
    private String telefone;
    private String celular;
    private Boolean confirmado;
    private Boolean ecg;    
    private Boolean encaixe;  
    private Boolean presente;    
    private Boolean atendido;    
    @Temporal(TemporalType.TIMESTAMP)
    private Date datachegada;
    private  String evento;
    private String observacoes;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataagendamento;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataatualizacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataconfirmacao;
    
    public Horario() {
        intervalos = 1;
        presente = Boolean.FALSE;
        atendido = Boolean.FALSE;
        confirmado = Boolean.FALSE;
        ecg = Boolean.FALSE;
        encaixe = Boolean.FALSE;  
        datahora = Date.from(Instant.now());
        dataagendamento = Date.from(Instant.now());
        dataatualizacao = Date.from(Instant.now());
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the datahora
     */
    public Date getDatahora() {
        return datahora;
    }

    /**
     * @param datahora the datahora to set
     */
    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }

    /**
     * @return the intervalos
     */
    public Integer getIntervalos() {
        return intervalos;
    }

    /**
     * @param intervalos the intervalos to set
     */
    public void setIntervalos(Integer intervalos) {
        this.intervalos = intervalos;
    }

    /**
     * @return the paciente
     */
    public Integer getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Integer paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the nomepaciente
     */
    public String getNomepaciente() {
        return nomepaciente;
    }

    /**
     * @param nomepaciente the nomepaciente to set
     */
    public void setNomepaciente(String nomepaciente) {
        this.nomepaciente = nomepaciente;
    }

    /**
     * @return the convenio
     */
    public Integer getConvenio() {
        return convenio;
    }

    /**
     * @param convenio the convenio to set
     */
    public void setConvenio(Integer convenio) {
        this.convenio = convenio;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the confirmado
     */
    public Boolean getConfirmado() {
        return confirmado;
    }

    /**
     * @param confirmado the confirmado to set
     */
    public void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }

    /**
     * @return the ecg
     */
    public Boolean getEcg() {
        return ecg;
    }

    /**
     * @param ecg the ecg to set
     */
    public void setEcg(Boolean ecg) {
        this.ecg = ecg;
    }

    /**
     * @return the encaixe
     */
    public Boolean getEncaixe() {
        return encaixe;
    }

    /**
     * @param encaixe the encaixe to set
     */
    public void setEncaixe(Boolean encaixe) {
        this.encaixe = encaixe;
    }

    /**
     * @return the presente
     */
    public Boolean getPresente() {
        return presente;
    }

    /**
     * @param presente the presente to set
     */
    public void setPresente(Boolean presente) {
        this.presente = presente;
    }

    /**
     * @return the atendido
     */
    public Boolean getAtendido() {
        return atendido;
    }

    /**
     * @param atendido the atendido to set
     */
    public void setAtendido(Boolean atendido) {
        this.atendido = atendido;
    }

    /**
     * @return the datachegada
     */
    public Date getDatachegada() {
        return datachegada;
    }

    /**
     * @param datachegada the datachegada to set
     */
    public void setDatachegada(Date datachegada) {
        this.datachegada = datachegada;
    }

    /**
     * @return the evento
     */
    public String getEvento() {
        return evento;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(String evento) {
        this.evento = evento;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the dataagendamento
     */
    public Date getDataagendamento() {
        return dataagendamento;
    }

    /**
     * @param dataagendamento the dataagendamento to set
     */
    public void setDataagendamento(Date dataagendamento) {
        this.dataagendamento = dataagendamento;
    }

    /**
     * @return the dataatualizacao
     */
    public Date getDataatualizacao() {
        return dataatualizacao;
    }

    /**
     * @param dataatualizacao the dataatualizacao to set
     */
    public void setDataatualizacao(Date dataatualizacao) {
        this.dataatualizacao = dataatualizacao;
    }

    /**
     * @return the dataconfirmacao
     */
    public Date getDataconfirmacao() {
        return dataconfirmacao;
    }

    /**
     * @param dataconfirmacao the dataconfirmacao to set
     */
    public void setDataconfirmacao(Date dataconfirmacao) {
        this.dataconfirmacao = dataconfirmacao;
    }
   
}