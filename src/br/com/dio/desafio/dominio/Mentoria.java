package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public  class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularxp() {
        int xp = (XP_PADRAO/50)+(getTempo()/2);
        return xp;
    }
    public void setData(LocalDate data){
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                ", titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", tempo='" + getTempo() + '\'' +
                '}';
    }


}
