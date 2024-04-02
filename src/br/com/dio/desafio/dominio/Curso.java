package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int dificuldade; // 1=dificil 2=médio 3=facil

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public double calcularxp() {
        int xp = (XP_PADRAO+getTempo())/(dificuldade*2);
        return xp;
    }
    @Override
    public String toString() {
        return  getTitulo() + " com carga horaria de " + getTempo() + " minutos";
    }
}
