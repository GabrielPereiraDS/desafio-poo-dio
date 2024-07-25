import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //new
        Curso collections = new Curso();
        collections.setTitulo("Conhecendo Collections java");
        collections.setDescricao("COLLECTIONS");
        collections.setCargaHoraria(4);
        //new
        collections.setProfessor("Camila Cavalcante.");
        collections.setMaterialComplementar("https://github.com/cami-la/collections-java-api-2023");
        collections.certificarConhecimento();

        Curso streamAPI = new Curso();
        streamAPI.setTitulo("Ganhando produtividade com Stream API");
        streamAPI.setDescricao("STREAM API");
        streamAPI.setCargaHoraria(2);
        //new
        streamAPI.setProfessor("Camila Cavalcante.");
        streamAPI.setMaterialComplementar("REPOSITÓRIO GIT DO CURSO: https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java");
        streamAPI.certificarConhecimento();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander 2024 - Backend com Java");
        bootcamp.setDescricao("Back-end java Santander 2024!");
        bootcamp.getConteudos().add(collections);
        bootcamp.getConteudos().add(streamAPI);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriel:" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gabriel:" + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Gabriel:" + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXp());
        System.out.println("-------------------");
        System.out.println(bootcamp);

    }

}
