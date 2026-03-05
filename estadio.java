package Futebol;

import java.util.Date;

public class estadio {
    private String nome;
    private Date dataDeCricao;
    private float faturamento;
    private float lotacao;
    private String gramado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeCricao() {
        return dataDeCricao;
    }

    public void setDataDeCricao(Date dataDeCricao) {
        this.dataDeCricao = dataDeCricao;
    }

    public float getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(float faturamento) {
        this.faturamento = faturamento;
    }

    public float getLotacao() {
        return lotacao;
    }

    public void setLotacao(float lotacao) {
        this.lotacao = lotacao;
    }

    public String getGramado() {
        return gramado;
    }

    public void setGramado(String gramado) {
        this.gramado = gramado;
    }
}
