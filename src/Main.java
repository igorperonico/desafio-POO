import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso POO");
        curso2.setDescricao("Descrição Curso POO");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIgor = new Dev();
        devIgor.setNome("Igor Peronico");
        devIgor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Igor: " + devIgor.getConteudosInscritos());
        devIgor.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos de Igor: " + devIgor.getConteudosInscritos());
        System.out.println("Conteudos Concluídos de Igor: " + devIgor.getConteudosConcluidos());
        devIgor.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos de Igor: " + devIgor.getConteudosInscritos());
        System.out.println("Conteudos Concluídos de Igor: " + devIgor.getConteudosConcluidos());
        System.out.println("XP Igor: " + devIgor.calcularTotalXp());

        System.out.println("--------------------------------");

        Dev devMarcilia = new Dev();
        devMarcilia.setNome("Marcilia Carla");
        devMarcilia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Marcilia: " + devMarcilia.getConteudosInscritos());
        devMarcilia.progredir();
        devMarcilia.progredir();
        devMarcilia.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos de Marcilia: " + devMarcilia.getConteudosInscritos());
        System.out.println("Conteudos Concluídos de Marcilia: " + devMarcilia.getConteudosConcluidos());
        System.out.println("XP Marcilia: " + devMarcilia.calcularTotalXp());
    }
}