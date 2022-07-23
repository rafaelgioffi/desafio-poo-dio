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

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Uma mentoria sobre Java");
        mentoria1.setData(LocalDate.now());

        System.out.println("\nTítulo: " + mentoria1.getTitulo());
        System.out.println("Descrição: " + mentoria1.getDescricao());
        System.out.println("Data: " + mentoria1.getData());
    }
}
