package com.example.project;

public class Coordenador {
    private String nome;
    private int idade;
    private String cpf;

    public Coordenador(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public static boolean isEmpty(String input){
		if (input == null){
			return true;
		}
		
		if (input.equals("")){
			return true;
		}

		else{
			return false;
		}
    }
    
    public void verificarCampoObrigatorioCoordenador(){

        if (isEmpty(this.getNome())){
			throw new RuntimeException ("O campo nome do coordenador do departamento é obrigatório");
		}

		if(isEmpty(this.getCpf())) {
			throw new RuntimeException("O campo CPF do coordenador do departamento é obrigatório");
        }
    }

    private String brk = System.lineSeparator();

    public String dadosCoordenador() {        
        
        verificarCampoObrigatorioCoordenador();

        String _idade = this.getIdade() == 0 ? "" : brk + "Idade: " + this.getIdade();
        String _cpf = brk + "CPF: " + this.getCpf();

        String returnCoordenador = this.nome;
        returnCoordenador += _idade;
        returnCoordenador += _cpf;

        return returnCoordenador ;
    }
}