package br.com.fiap.model;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Visitante{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private LocalDate datadeNascimento;
	private Long cpf;
    private Long rg;
    private LocalDate dataCadastro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



    public String getnome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



    public LocalDate getDatadeNascimento() {
		return datadeNascimento;
	}

	public void setDatadeNascimento(LocalDate datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}



    public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}



    public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}




    public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
