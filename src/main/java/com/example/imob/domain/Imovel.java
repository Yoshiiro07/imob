package com.example.imob.domain;

public class Imovel {
    private Integer imovelId;
    private String tipo;
    private String endereco;
    private String cidade;
    private String estado;
    private Double preco;
    private Boolean disponivel;

    public Imovel(Integer imovelId, String tipo,  String endereco, String cidade, String estado, Double preco, Boolean disponivel) {
        this.imovelId = imovelId;
        this.tipo = tipo;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.preco = preco;
        this.disponivel = disponivel;
    }
    
    public Integer getImovelId() {
        return imovelId;
    }

    public void setImovelId(Integer imovelId) {
        this.imovelId = imovelId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

}
