package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final int XP_PADRAO = 100;
    private String titulo;
    private String descricao;
    private int tempo; // Em minutos
    public abstract double calcularxp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tempo=" + tempo +
                '}';
    }


}
