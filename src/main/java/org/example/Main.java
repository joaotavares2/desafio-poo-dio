import org.example.dominio.Bootcamp;
import org.example.dominio.Curso;
import org.example.dominio.Dev;
import org.example.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Básico");
        cursoJava.setDescricao("Aprenda os fundamentos do Java");
        cursoJava.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Sessão ao vivo com especialista");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para aprender Java do zero");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("João Pedro");
        dev.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos: " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteúdos concluídos: " + dev.getConteudosConcluidos());
        System.out.println("XP Total: " + dev.calcularTotalXp());
    }
}

