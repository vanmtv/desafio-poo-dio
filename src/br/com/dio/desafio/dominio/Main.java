package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java");
        cursoJava.setDescricao("Descricao curso Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Java");
        cursoJS.setDescricao("Descricao curso Java");
        cursoJS.setCargaHoraria(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Descricao mentoria Java");
        mentoriaJava.setData(LocalDate.now());

        Mentoria mentoriaJS = new Mentoria();
        mentoriaJS.setTitulo("Mentoria JS");
        mentoriaJS.setDescricao("Descricao mentoria JS");
        mentoriaJS.setData(LocalDate.now());
    }
}