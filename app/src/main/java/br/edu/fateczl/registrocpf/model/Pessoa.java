/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */


package br.edu.fateczl.registrocpf.model;

public class Pessoa {

    private String cpf;
    private String nome;

    public Pessoa(String cpf, String nome) {
        super(); // Chama o construtor da classe Object (classe mãe de todas as classes em Java)
        this.cpf = cpf;
        this.nome = nome;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
