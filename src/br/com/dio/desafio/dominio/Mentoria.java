package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

   private String titulo;
    private String  descricao;

    private LocalDate data;


    @Override
    public double calcularXp() {
        return xp_padrao + 20d;

    }

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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void ToString(){

        IO.println("Data: " + this.data);
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.data = data;
    }

    public Mentoria() {
    }
}
