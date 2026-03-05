package Futebol;

import java.util.Date;

public class clube {
    private String nome;
    private String estadio;
    private int bilheteria;
    private Date dataDeCriacao;
    private String hino;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getBilheteria() {
        return bilheteria;
    }

    public void setBilheteria(int bilheteria) {
        this.bilheteria = bilheteria;
    }

    public Date getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(Date dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getHino() {
        return hino;
    }

    public void setHino(String hino) {
        this.hino = hino;
    }
}
