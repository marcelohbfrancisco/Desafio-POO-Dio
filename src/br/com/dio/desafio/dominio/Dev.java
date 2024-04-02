package br.com.dio.desafio.dominio;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private int perfil;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private int xp;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();


    public Dev(int perfil, String nome, String sobrenome, String email, String telefone, int xp) {
        this.perfil = perfil;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.xp = 0;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscrito;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public void desiscreverConteudo(Conteudo conteudo){
        if (conteudoInscrito.contains(conteudo)){
            conteudoInscrito.remove(conteudo);
        } else {
            throw new IllegalArgumentException("Não é possivel desinscrever do conteudo: " + conteudo.getTitulo() + " - Curso não inscrito.");
        }
    }

    public void adicionarConteudoConcluido(Conteudo conteudo){
        if (!conteudoConcluidos.contains(conteudo)){
            conteudoConcluidos.add(conteudo); // adicionando o curso concluido ao set cursosConcluidos
            this.xp += conteudo.calcularxp();
            conteudoInscrito.remove(conteudo);
        } else {
            throw new IllegalArgumentException("Não é possivel desinscrever do conteudo: " + conteudo.getTitulo() + " - Curso não inscrito.");
        }
    }

    public Set<Conteudo> getCursosConcluidos() {
        return conteudoConcluidos;
    }

    public void avancar(){
        if (!conteudoInscrito.isEmpty()) {
            Conteudo conteudoA = conteudoInscrito.iterator().next();
            conteudoConcluidos.add(conteudoA);
            this.xp += conteudoA.calcularxp();
            conteudoInscrito.remove(conteudoA);
        } else {
            System.out.println("Voce não está inscrito em nenhum curso ou mentoria");
        }
    }

    public void InscreverBootcamp(@NotNull Bootcamp bootcamp){
         this.conteudoInscrito.addAll(bootcamp.getConteudos());
    }


}