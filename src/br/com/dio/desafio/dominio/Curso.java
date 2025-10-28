package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{

    private int cargaHoraria;



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    public void ToString(){
        IO.println("Titulo: " + getTitulo());
        IO.println("Descricao: " + getDescricao());
        IO.println("cargaHoraria: " + getCargaHoraria());
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
         setTitulo(titulo);
        setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {
    }

    @Override
    public double calcularXp() {
    return xp_padrao *cargaHoraria;
    }
}