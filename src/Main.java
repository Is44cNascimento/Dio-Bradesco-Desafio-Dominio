import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Mentoria mentoriaA = new Mentoria();
        Curso cursoA = new Curso();


        cursoA.setTitulo("Estrutura de dados");
        cursoA.setDescricao("Aula de estrura de dados. A base de todo sistema");
        cursoA.setCargaHoraria(160);



        mentoriaA.setTitulo("Recursividade");
        mentoriaA.setDescricao("Mentoria de como utilizar recursividade e como funciona");
        mentoriaA.setData(LocalDate.now());

        mentoriaA.ToString();
        cursoA.ToString();
    }
}
