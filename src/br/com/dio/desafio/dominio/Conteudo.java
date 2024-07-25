package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;
    protected static final int PERGUNTAS = 20;

    private String titulo;
    private String descricao;
    private String materialComplementar;
    
    

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //new

    public void setMaterialComplementar(String materialComplementar) {
        this.materialComplementar = materialComplementar;
    }

    public String getMaterialComplementar() {
        return materialComplementar;
    }

    public void certificarConhecimento(){
        int perguntasCertas = 14;
        if(perguntasCertas >= (PERGUNTAS * 100 / perguntasCertas)){
            System.out.println("Total de perguntas certas: 70%.");
            System.out.println("PARABÉNS VOÇÊ CONCLUIU O CURSO!..");
        }else{
            System.out.println("Menos de 70% das perguntas estão corretas, menos 1 heart. :(");
        }

    }



    


}
