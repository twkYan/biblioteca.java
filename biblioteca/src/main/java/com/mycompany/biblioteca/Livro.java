/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author YAN
 */
public class Livro {
    private String nome;
    private String autor;
    private String genero;
    
    public Livro(String nome, String autor, String genero){
        this.nome =nome;
        this.autor= autor;
        this.genero= genero;
    }
    
    public String getNome(){
        return nome;
    }
    public String getAutor(){
        return autor;
    }
    public String getGenero(){
        return genero;
    }
    
            
}
