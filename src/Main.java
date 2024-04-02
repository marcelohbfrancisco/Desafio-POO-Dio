import br.com.dio.desafio.dominio.*;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando Cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setDificuldade(1); // difícil
        curso1.setTempo(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setDificuldade(2); // médio
        curso2.setTempo(60);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso HTML");
        curso3.setDescricao("Descrição Curso HTML");
        curso3.setDificuldade(3); // fácil
        curso3.setTempo(40);

        // Apenas para completar a quantidade de cursos
        Curso curso4 = new Curso();
        curso4.setTitulo("Curso CSS");
        curso4.setDescricao("Descrição Curso CSS");
        curso4.setDificuldade(3); // fácil
        curso4.setTempo(40);

        Curso curso5 = new Curso();
        curso5.setTitulo("Curso React");
        curso5.setDescricao("Descrição Curso React");
        curso5.setDificuldade(2); // médio
        curso5.setTempo(60);

        // Criando Mentorias
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());
        mentoria1.setTempo(120);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JS");
        mentoria2.setDescricao("Descrição Mentoria JS");
        mentoria2.setData(LocalDate.now().plusDays(1));
        mentoria2.setTempo(90);

        // Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(curso5);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        // Criando Devs
        Dev dev1 = new Dev(123, "Joao", "Silva", "joaosilga@mail.com","+554899899657",0);
        dev1.setNome("Dev1");
        dev1.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos por " + dev1.getNome() + " " + dev1.getSobrenome() + "----" );
        for (Conteudo conteudo: dev1.getConteudoInscritos()){
            System.out.println("====> " + conteudo.getTitulo() + " carga horaria de " + conteudo.getTempo() + " minutos");
        }
        System.out.println();
        dev1.avancar();
        dev1.avancar();
        dev1.avancar();
        dev1.avancar();
        dev1.avancar();
        dev1.avancar();
        dev1.avancar();
        System.out.println("Cursos concluidos por " + dev1.getNome() + " " + dev1.getSobrenome() + ":");
        for (Conteudo conteudo : dev1.getCursosConcluidos()) {
            System.out.println("--> " + conteudo.getTitulo() + " carga horaria de " + conteudo.getTempo() + " minutos");
        }
        System.out.println("O total de XP de " + dev1.getNome() + " " + dev1.getSobrenome() + " : " + dev1.getXp());
        System.out.println();
        System.out.println();


        Dev dev2 = new Dev(456, "Maria", "Silva", "mariasilga@mail.com","+554848575657",0);;
        dev2.setNome("Dev2");
        dev2.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos por " + dev2.getNome() + " " + dev2.getSobrenome() + "----" );
        for (Conteudo conteudo : dev2.getConteudoInscritos()){
            System.out.println("====>" + conteudo.getTitulo() + " com carga horaria de " + conteudo.getTempo() + " minutos");
        }
        System.out.println();
        // Dev2 conclui apenas metade do bootcamp
        dev2.adicionarConteudoConcluido(curso1);
        dev2.adicionarConteudoConcluido(curso2);
        dev2.adicionarConteudoConcluido(mentoria1);
        System.out.println("Cursos concluidos por " + dev2.getNome() + " " + dev2.getSobrenome() + ":");
        for (Conteudo conteudo : dev2.getCursosConcluidos()) {
            System.out.println("--> " + conteudo.getTitulo() + " carga horaria de " + conteudo.getTempo() + " minutos");
        }
        System.out.println("O total de XP de " + dev2.getNome() + " " + dev2.getSobrenome() + " : " + dev2.getXp());
        System.out.println();


    }
}
