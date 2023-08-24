package br.edu.umfg.dip;

public class Produto {
    private String descricao;
    private Float valor;

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return this.descricao;
    }

    public void setValor(Float valor)
    {
        this.valor = valor;
    }

    public Float getValor()
    {
        return this.valor;
    }
}
