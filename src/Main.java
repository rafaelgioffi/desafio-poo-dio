import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Um curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Um curso de JavaScript");
        curso2.setCargaHoraria(4);

        System.out.println("Título: " + curso1.getTitulo());
        System.out.println("Descrição: " + curso1.getDescricao());
        System.out.println("Carga horária: " + curso1.getCargaHoraria() + "h");

        System.out.println("\nTítulo: " + curso2.getTitulo());
        System.out.println("Descrição: " + curso2.getDescricao());
        System.out.println("Carga horária: " + curso2.getCargaHoraria() + "h");

        System.out.println("\n---------------------\n");

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Uma mentoria sobre Java");
        mentoria1.setData(LocalDate.now());

        System.out.println("Título: " + mentoria1.getTitulo());
        System.out.println("Descrição: " + mentoria1.getDescricao());
        System.out.println("Data: " + mentoria1.getData());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Um bootcamp de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("\n---------------------\n");

        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Descrição: " + bootcamp.getDescricao());

    }
}
